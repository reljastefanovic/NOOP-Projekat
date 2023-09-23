package ProjekatProg.projekatRestoran.model;

public class meniEntitet {
        private Long id;
        private String nazivProizvoda;
        private int cenaProizvoda;

        // Constructors, getters, and setters

        public meniEntitet() {
            // Default constructor
        }

        public meniEntitet(Long id, String nazivProizvoda, int cenaProizvoda) {
            this.id = id;
            this.nazivProizvoda = nazivProizvoda;
            this.cenaProizvoda = cenaProizvoda;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNazivProizvoda() {
            return nazivProizvoda;
        }

        public void setNazivProizvoda(String nazivProizvoda) {
            this.nazivProizvoda = nazivProizvoda;
        }

        public int getCenaProizvoda() {
            return cenaProizvoda;
        }

        public void setCenaProizvoda(int cenaProizvoda) {
            this.cenaProizvoda = cenaProizvoda;
        }
    }

