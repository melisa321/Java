package org.example;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class songsCollector {

    private static final Scanner sc = new Scanner(System.in);

    public static List<Song> getUserSongs(){

        List<Song> userSongs = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            System.out.println("Insert name of " + i +1 + " the song");
            String userSongName = sc.next();
            System.out.println("Insert length of the song: ");
            int userSongLegth = sc.nextInt();
            Song userSong = new Song(userSongName, userSongLegth);
            userSongs.add(userSong);
        }
        return userSongs;
    }



}
