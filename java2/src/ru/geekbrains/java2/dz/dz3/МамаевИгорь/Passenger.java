package ru.geekbrains.java2.dz.dz3.МамаевИгорь;
public class Passenger {
        private String name;
    private String identityDocumentNumber;
    private Integer flightNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityDocumentNumber() {
        return identityDocumentNumber;
    }

    public void setIdentityDocumentNumber(String identityDocumentNumber) {
        this.identityDocumentNumber = identityDocumentNumber;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Passenger(String name, String identityDocumentNumber, Integer flightNumber) {
        this.name = name;
        this.identityDocumentNumber = identityDocumentNumber;
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "Пассажир {" +
                "Имя='" + name + '\'' +
                ", Номер документа='" + identityDocumentNumber + '\'' +
                ", Номер рейса=" + flightNumber +
                '}';
    }


}
