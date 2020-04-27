package com.company;

import java.util.ArrayList;

public class Album {
    String albumName;
    Artist artist;
    ArrayList<Track> trackList = new ArrayList<>();

    public Album(String albumName, Artist artist, ArrayList<Track> trackList) {
        this.albumName = albumName;
        this.artist = artist;
        this.trackList = trackList;
    }
}
