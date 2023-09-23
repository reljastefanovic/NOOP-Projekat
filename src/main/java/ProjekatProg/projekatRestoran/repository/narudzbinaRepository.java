package ProjekatProg.projekatRestoran.repository;
import ProjekatProg.projekatRestoran.model.narudzbinaEntitet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class narudzbinaRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(narudzbinaEntitet narudzbine) {
        String sql = "INSERT INTO NARUDZBINE (naruceno, ukupna_cena) VALUES (?, ?)";
        jdbcTemplate.update(sql, narudzbine.getNaruceno(), narudzbine.getUkupnaCena());
    }
}