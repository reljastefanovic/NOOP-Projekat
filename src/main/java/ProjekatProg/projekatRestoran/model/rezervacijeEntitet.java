package ProjekatProg.projekatRestoran.model;

public class rezervacijeEntitet {

    private Long id;
    private String ime;
    private String telefon;
    private String datum;
    private String vreme;
    private  String broj_gostiju;

    public rezervacijeEntitet() {
        this.id = id;
        this.ime = ime;
        this.telefon = telefon;
        this.datum = datum;
        this.vreme = vreme;
        this.broj_gostiju = broj_gostiju;
    }

    public Long getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getDatum() {
        return datum;
    }

    public String getVreme() {
        return vreme;
    }

    public String getBroj_gostiju() {
        return broj_gostiju;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public void setBroj_gostiju(String broj_gostiju) {
        this.broj_gostiju = broj_gostiju;
    }
}
