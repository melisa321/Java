package org.example;

import java.util.Objects;

public class Passanger {
    private final String name;
    private final String surname;
    private Ticket ticket;

    public Passanger(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Ticket getTicket(){
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Passanger{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ticket=" + ticket +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passanger passanger = (Passanger) o;
        return Objects.equals(getName(), passanger.getName()) &&
                Objects.equals(getSurname(), passanger.getSurname()) &&
                Objects.equals(getTicket(), passanger.getTicket());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getTicket());
    }
}
