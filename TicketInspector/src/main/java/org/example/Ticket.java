package org.example;

import java.time.LocalDateTime;

public class Ticket {
    private final int ticketTimeInMinutes;
    private final LocalDateTime buyTime;

    public Ticket(int timeOfTicketValidity, LocalDateTime timeWhenTicketWasValidated) {
        this.ticketTimeInMinutes = timeOfTicketValidity;
        this.buyTime = timeWhenTicketWasValidated;
    }

    public int getTimeOfTicketValidity() {
        return ticketTimeInMinutes;
    }

    public LocalDateTime getTimeWhenTicketWasValidated() {
        return buyTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "timeOfTicket=" + ticketTimeInMinutes +
                ", buyTime=" + buyTime +
                '}';
    }
}
