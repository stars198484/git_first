package ru.geekbrains.java2.dz.dz3.АндрейИванов;

/**
 * Created by a.ivanov on 15.06.2016.
 */
public class Passenger {

    private String name;
    private long documentNumber;
    private int flight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(long documentNumber) {
        this.documentNumber = documentNumber;
    }

    public int getFlight() {
        return flight;
    }

    public void setFlight(int flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "[ Имя - " + name + ". Номер документа - " + documentNumber + " ]";
    }
}
