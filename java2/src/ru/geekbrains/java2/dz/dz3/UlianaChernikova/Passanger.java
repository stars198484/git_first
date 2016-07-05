//package UlianaChernikova;
package ru.geekbrains.java2.dz.dz3.UlianaChernikova;

public class Passanger {
    private String pName;
    private Integer pPassport;


    public Passanger() {

    }

    public Passanger(String pName, Integer pPassport) {
        this.pName = pName;
        this.pPassport = pPassport;

    }

    public String getpName() {
        return pName;
    }

    public int getpPassport() {
        return pPassport;
    }


    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setpPassport(int pPassport) {
        this.pPassport = pPassport;
    }


    @Override
    public String toString() {
        return "Passanger{" + "pName=" + pName + ", pPassport=" + pPassport +'}';
    }

}



