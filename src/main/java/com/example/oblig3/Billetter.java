package com.example.oblig3;

public class Billetter {
    private String filmS;
    private int antallBilleterS;
    private String fornavnS;
    private String etternavnS;
    private String telefonS;
    private String epostS;

    public Billetter(){}

    public Billetter(String film, int antallBilleter, String fornavn,
                     String etternavn, String telefon, String epost){
        this.filmS = film;
        this.antallBilleterS = antallBilleter;
        this.fornavnS = fornavn;
        this.etternavnS = etternavn;
        this.telefonS = telefon;
        this.epostS = epost;
    }

    public String getFilmS() {
        return filmS;
    }

    public void setFilmS(String film) {
        this.filmS = film;
    }

    public int getAntallBilleterS() {
        return antallBilleterS;
    }

    public void setAntallBilleterS(int antallBilleterS) {
        this.antallBilleterS = antallBilleterS;
    }

    public String getFornavnS() {
        return fornavnS;
    }

    public void setFornavnS(String fornavnS) {
        this.fornavnS = fornavnS;
    }

    public String getEtternavnS() {
        return etternavnS;
    }

    public void setEtternavnS(String etternavnS) {
        this.etternavnS = etternavnS;
    }

    public String getTelefonS() {
        return telefonS;
    }

    public void setTelefonS(String telefonS) {
        this.telefonS = telefonS;
    }

    public String getEpostS() {
        return epostS;
    }

    public void setEpostS(String epostS) {
        this.epostS = epostS;
    }
}
