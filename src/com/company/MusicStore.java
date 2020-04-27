package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MusicStore{

    ArrayList<Album> albums = new ArrayList<>();

    public MusicStore(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public ArrayList<Album> getAlbumsOfArtist(Artist artist1){
        ArrayList<Album> artistAlbums = new ArrayList<>();
        for(Album a: albums){
            if(a.artist.equals(artist1)){
                artistAlbums.add(a);
                System.out.println(a.albumName);
            }
        }

        return artistAlbums;
    }
    public ArrayList<Album> getAlbumsIncludeTrack (Track tr){
        ArrayList<Album> albumIncludeTrack = new ArrayList<>();
        for(Album a: albums) {
            for (Track t : a.trackList) {
                if (t.equals(tr)) {
                    albumIncludeTrack.add(a);
                    System.out.println(a.albumName);
                }
            }
        }

        return albumIncludeTrack;
    }
    public String getLabelOfArtist(Artist a){
        System.out.println(a.labelName);
        return a.labelName;
    }

}
