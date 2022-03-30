package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Podejscie 1 i 2
        Playlist playlist = new Playlist();
        Song song = new Song("Nothing else matters", 320);
        playlist.addSong(song);
        playlist.addSong(song);
        playlist.addSong(song);
        playlist.addSong(new Song("Nothing else matters", 1));
        playlist.addSong(new Song("Nothing else matters", 2));
        playlist.addSong(new Song("Nothing else matters", 3));
        playlist.addSong(new Song("Nothing else matters", 4));

        int playListLength = playlist.countSongsLengthInSeconds();
        System.out.println("Play List Length : " + playListLength);
        // Koniec podejścia 1 i 2

        Playlist playlist2 = new Playlist();
        List<Song> userSongs = songsCollector.getUserSongs();
        playlist2.addSongs(userSongs);
        int playListLength2 = playlist2.countSongsLengthInSeconds();
        //songsCollector.getUserSongs();


        Playlist.countSongsLengthInSeconds(Arrays.asList(song,song,song));
        System.out.println(Playlist.countSongsLengthInSeconds(song, song, song));


        //        //Podejscie 1 i 2
        //
        //
        //        //Podejscie 3


    }

}
