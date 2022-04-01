package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BilletterRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreBillett (Billetter innBilett){
        String sql = "INSERT INTO Billetter (filmS,antallBilleterS,fornavnS,etternavnS,telefonS,epostS) values (?,?,?,?,?,?)";
        db.update(sql, innBilett.getFilmS(), innBilett.getAntallBilleterS(), innBilett.getFornavnS(), innBilett.getEtternavnS(), innBilett.getTelefonS(), innBilett.getEpostS());
    }
    public List<Billetter> hentAlleBiletene(){
        String sql = "SELECT * FROM Billetter ORDER BY LOWER(etternavnS)";
        List<Billetter> alleBiletene = db.query(sql, new BeanPropertyRowMapper(Billetter.class));
        return alleBiletene;
    }

    public void settAlleBiletene(){
        String sql = "DELETE FROM Billetter";
        db.update(sql);
    }
}
