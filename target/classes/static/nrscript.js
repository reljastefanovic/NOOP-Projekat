$(document).ready(function () {
    var dt = new Date();
    document.getElementById("datetime").innerHTML = dt.toLocaleTimeString();
    fetch('http://localhost:8080/narudzbine')
        .then(response => response.json())
        .then((json) => {
            // Find the highest ID in the JSON data
            var highestId = Math.max(...json.meni.map(item => item.id));
            
            // Filter the data to get the object with the highest ID
            var highestIdObject = json.meni.find(item => item.id === highestId);
            
            var cardMarkup = "";

            // Check if we found the highest ID object
            if (highestIdObject) {
                // Replace newline characters with spaces in the 'naruceno' field
                var narucenoWithoutNewlines = highestIdObject.naruceno.replace(/\r\n/g, ' ');
                var items = narucenoWithoutNewlines.split(/(\d+x\s+)/).filter(Boolean);
                cardMarkup += `
                    <tr>
                        <td></td>
                        <td>`;
                for (var i = 0; i < items.length; i++) {
                    if (i % 2 === 0) {
                        // Even index: Number and 'x'
                        cardMarkup += `<span>${items[i]}</span>`;
                    } else {
                        // Odd index: Item
                        cardMarkup += `${items[i]}</td></tr><tr><td></td><td>`;
                    }
                }
                cardMarkup += `</td>
                        <td class="right-align"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td class="right-align bold">Ukupno: ${highestIdObject.ukupnaCena}.00 RSD</td>
                    </tr>
                `;
            }

            $("#menu").html(cardMarkup);
        });
});
