package org.example;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TicketMachine {

    public void buyTicket(Passanger passenger, int dlugoscWaznosciBiletuWMinutach) {
        buyTicket(passenger, dlugoscWaznosciBiletuWMinutach, LocalDateTime.now());
    }

    public void buyTicket(Passanger passenger, int dlugoscWaznosciBiletuWMinutach, LocalDateTime czasZakupubiletu) {
        Ticket ticket = new Ticket(dlugoscWaznosciBiletuWMinutach, czasZakupubiletu);
        passenger.setTicket(ticket);
    }

    public boolean isTicketExpired(Passanger passanger, int dlugoscWaznosciBiletuWMinutach, LocalTime czasZakupuBiletu) {
        return czasZakupuBiletu.plusMinutes(dlugoscWaznosciBiletuWMinutach).isAfter(LocalTime.from(LocalDateTime.now()));
    }

    public void maszynaDoKupowaniaBiletu(Passanger passanger, int dlugoscWaznosciBiletuWMinutach, LocalTime czasZakupuBiletu) {

        if (isTicketExpired(passanger, dlugoscWaznosciBiletuWMinutach, czasZakupuBiletu) == false)
            System.out.println("Bilet jest przeterminowany");
        else
            System.out.println("Bilet jest ważny");


    }

}
