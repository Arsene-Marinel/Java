package com.company;

public class ImprumutCarte {
    private String dataImprumut;
    private String dataExpirare;
    private Carte carte;
    private Cititor cititor;
    private Angajat angajat;

    ImprumutCarte() {
        this.dataImprumut = "";
        this.dataExpirare = "";
        this.carte = new Carte();
        this.cititor = new Cititor();
        this.angajat = new Angajat();
    }

    ImprumutCarte(String dataImprumut, String dataExpirare, Carte carte, Cititor cititor, Angajat angajat){
        this.dataImprumut = dataImprumut;
        this.dataExpirare = dataExpirare;
        this.carte = carte;
        this.cititor = cititor;
        this.angajat = angajat;
    }

    public void setDataImprumut(String dataImprumut) { this.dataImprumut = dataImprumut; }
    public void setDataExpirare(String dataExpirare) { this.dataExpirare = dataExpirare; }
    public void setCarte(Carte carte) {this.carte = carte; }
    public void setCititor(Cititor cititor) { this.cititor = cititor; }
    public void setAngajat(Angajat angajat) {this.angajat = angajat; }

    public String getDataImprumut() { return dataImprumut; }
    public String getDataExpirare() { return dataExpirare; }
    public Carte getCarte() { return carte; }
    public Cititor getCititor() { return cititor; }
    public Angajat getAngajat() { return angajat; }

    @Override
    public String toString() {
        return "De la data de " + dataImprumut +
                " pana la data de " + dataExpirare +
                " cartea " + carte +
                " a fost imprumutata de " + cititor +
                " de la angajatul " + angajat;
    }
}
