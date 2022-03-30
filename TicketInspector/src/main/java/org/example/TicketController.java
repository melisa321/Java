package org.example;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketController {
    public static void main(String[] args) {


        //utwórz tablicę pasażerów i do części z nich przypisz bilety (z czego niektóre bilety powinny być "przeterminowane"

        Passanger passanger1 = new Passanger("Krzysztof", "Kowalski");
        Passanger passanger2 = new Passanger("Damian", "Nowak");
        Passanger passanger3 = new Passanger("Henryk", "Stoworski");

        List<Passanger> passangers = new ArrayList<>();
        passangers.add(passanger1);
        passangers.add(passanger2);
        passangers.add(passanger3);

        TicketMachine ticketMachine = new TicketMachine();
        ticketMachine.buyTicket(passanger1, 20);
        ticketMachine.buyTicket(passanger2, 60, LocalDateTime.of(LocalDate.now(), LocalTime.of(10, 50, 30)));

        System.out.println(passanger1);
        System.out.println(passanger2);
        System.out.println(passanger3);

        //manualne kupowanie
        /*System.out.println(ticketMachine.isTicketExpired(passanger1, 20, LocalTime.of(16, 33, 00)));
        System.out.println(ticketMachine.isTicketExpired(passanger2, 60, LocalTime.of(17, 33, 00)));
        System.out.println(ticketMachine.isTicketExpired(passanger3, 60, LocalTime.of(10, 33, 00)));
*/
        //automatyczne kupowanie
        System.out.println("Na jaki czas chcesz kupić bilet? ");
        Scanner sc = new Scanner(System.in);
        int dlugoscWaznosciBiletuWMinutach = sc.nextInt();
        ticketMachine.maszynaDoKupowaniaBiletu(passanger1, dlugoscWaznosciBiletuWMinutach, LocalTime.of(11, 33, 00));
    }
}
