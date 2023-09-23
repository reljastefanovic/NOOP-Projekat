package ProjekatProg.projekatRestoran.repository;

import ProjekatProg.projekatRestoran.model.rezervacijeEntitet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class rezervacijeRepository {

    private  final JdbcTemplate jdbcTemplate;

    @Autowired
    public rezervacijeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public  void save(rezervacijeEntitet rezervacije) {

        String sql = "INSERT INTO REZERVACIJE (ime, telefon, datum, vreme, broj_gostiju) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql, rezervacije.getIme(), rezervacije.getTelefon(),rezervacije.getDatum(),rezervacije.getVreme(),rezervacije.getBroj_gostiju());
    }



}