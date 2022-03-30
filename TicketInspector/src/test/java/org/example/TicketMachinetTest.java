package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TicketMachinetTest {
    private final TicketMachine ticketMachine = new TicketMachine();

    @Test
    public void isTicketExpiredTest() {
        Passanger passanger1 = new Passanger("Krzysztof", "Kowalski");
        Passanger passanger2 = new Passanger("Damian", "Nowak");
        Passanger passanger3 = new Passanger("Henryk", "Stoworski");

        List<Passanger> passangers = new ArrayList<>();
        passangers.add(passanger1);
        passangers.add(passanger2);
        passangers.add(passanger3);

        TicketMachine ticketMachine = new TicketMachine();

        boolean result1 = ticketMachine.isTicketExpired(passanger1, 20, LocalTime.of(10, 50, 30));
        boolean result2 = ticketMachine.isTicketExpired(passanger1, 60, LocalTime.of(18, 50, 30));
        Assertions.assertAll(
                () -> Assertions.assertEquals(false, result1),
                () -> Assertions.assertEquals(true, result2)
        );
    }
}