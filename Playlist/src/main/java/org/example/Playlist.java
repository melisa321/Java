package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Playlist {
    private final List<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public static int countSongsLengthInSeconds(Song... songs) {
        return countSongsLengthInSeconds(Arrays.asList(songs));
    }

    public static int countSongsLengthInSeconds(List<Song> songs) {
        int totalTime = 0;
        for (Song song : songs) {
            totalTime += song.getLength();
        }

        return totalTime;
        // TODO do domu. Napisz tą funkcje za pomocą streama.
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void addSongs(List<Song> songs) {
        this.songs.addAll(songs);
    }

    public void addSongs(Song... songs) {
        this.songs.addAll(Arrays.asList(songs));
    }

    public int countSongsLengthInSeconds() {
        return countSongsLengthInSeconds(songs);
    }

}
