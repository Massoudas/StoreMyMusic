package com.company;

public class Track {
    String trackName;
    int numberOfSeconds;
    Artist artist;
    int publishedYear;

    public Track(String trackName, int numberOfSeconds, Artist artist, int publishedYear) {
        this.trackName = trackName;
        this.numberOfSeconds = numberOfSeconds;
        this.artist = artist;
        this.publishedYear = publishedYear;
    }
}
