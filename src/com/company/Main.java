package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {




        Artist death = new Artist("Chuck Schuldiner", "IROND");
        Artist sepultra = new Artist("Sepultra", "Nuclear Blast");

        Track tr1=new Track("root", 230,sepultra, 2004);
        Track tr2 = new Track("Reza", 231,sepultra,1998);
        Track tr3= new Track("Crystal Mountain", 311, death, 1988);
        Track tr4 = new Track("Evil Dead", 276, death, 1989);

        ArrayList<Track> trackList1 = new ArrayList<>();
        trackList1.add(tr3);
        trackList1.add(tr4);

        ArrayList<Track> trackList2 = new ArrayList<>();
        trackList2.add(tr1);
        trackList2.add(tr2);

        Album screamBloodyGore = new Album("Scream Bloody Gore", death,trackList1);
        Album bloodyRoots = new Album("Bloody Roots", sepultra, trackList2);

        ArrayList<Album> albumsInMusicStore = new ArrayList<>();
        albumsInMusicStore.add(bloodyRoots);
        albumsInMusicStore.add(screamBloodyGore);

        MusicStore musicStore = new MusicStore(albumsInMusicStore);
        musicStore.getAlbumsIncludeTrack(tr1);
        musicStore.getAlbumsIncludeTrack(tr4);

        musicStore.getLabelOfArtist(death);
        musicStore.getLabelOfArtist(sepultra);

        musicStore.getAlbumsOfArtist(death);




	// write your code here
    }
}
