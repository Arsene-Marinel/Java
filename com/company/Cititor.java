package com.company;

public class Cititor extends Persoana {
    private int codIdentificare;
    private int valabilitatePermis;
    private int varsta;

    public Cititor(){}
    Cititor(String nume, String prenume, int codIdentificare, int valabilitatePermis, int varsta){
        super(nume, prenume);
        this.codIdentificare = codIdentificare;
        this.valabilitatePermis = valabilitatePermis;
        this.varsta = varsta;
    }

    public void setCodIdentificare(int codIdentificare) { this.codIdentificare = codIdentificare; }
    public void setValabilitatePermis(int valabilitatePermis) { this.valabilitatePermis = valabilitatePermis; }
    public void setVarsta(int varsta) { this.varsta = varsta; }

    public int getCodIdentificare() { return codIdentificare; }
    public int getVarsta() { return varsta; }
    public int getValabilitatePermis() { return valabilitatePermis; }

    @Override
    public String toString() {
        return "Cititorul are " +
                "codul de identificare =" + codIdentificare +
                ", valabilitatea permisului de " + valabilitatePermis +
                " si varsta de" + varsta + "ani";
    }
}
