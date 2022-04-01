package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KinoController {

    @GetMapping("/getFilm")
        public List<String> getFilm() {
        List<String> filmNavn = new ArrayList<>();
        filmNavn.add("The Best Offer");
        filmNavn.add("The Curious Case of Blob Blobsen");
        filmNavn.add("Lewis had a dog");
        filmNavn.add("Lunch is life");
        return filmNavn;
    }

    @Autowired
    private BilletterRepository rep;

    @PostMapping("/kjop")
    public void lagreBillett(Billetter innBillett){
        rep.lagreBillett(innBillett);
    }

    @GetMapping("/hentAlle")
    public List<Billetter> hentAlle(){
        return rep.hentAlleBiletene();
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        rep.settAlleBiletene();
    }
}
