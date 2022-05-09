package org.loose.fis.sre.model;

import java.util.Objects;

public class Produs {


    private String nume;
    private String pret;
    private String tippiele;
    public Produs(){}


    public Produs(String nume, String pret, String tippiele) {
        this.nume = nume;
        this.pret = pret;
        this.tippiele = tippiele;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPret() {
        return pret;
    }

    public void setPret(String pret) {
        this.pret = pret;
    }

    public String getTippiele() {
        return tippiele;
    }

    public void setTippiele(String tippiele) {
        this.tippiele = tippiele;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", tippiele='" + tippiele + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produs produs = (Produs) o;
        return pret == produs.pret && nume.equals(produs.nume) && tippiele.equals(produs.tippiele);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, pret, tippiele);
    }
}
