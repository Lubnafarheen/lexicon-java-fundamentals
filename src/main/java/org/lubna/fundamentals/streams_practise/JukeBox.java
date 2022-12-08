package org.lubna.fundamentals.streams_practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JukeBox {
    public static void main(String[] args) {
        List<Song> songList = new ArrayList<>();
        songList.add(new Song("$10", "Hitchhiker", "Electronic", 2016, 183));
        songList.add(new Song("Havana", "Camila Cabello", "R&B", 2017, 324));
        songList.add(new Song("Cassidy", "Grateful Dead", "Rock", 1972, 123));
        songList.add(new Song("50 ways", "Paul Simon", "Soft Rock", 1975, 199));
        songList.add(new Song("Hurt", "Nine Inch Nails", "Industrial Rock", 1995, 257));
        songList.add(new Song("Silence", "Delerium", "Electronic", 1999, 134));
        songList.add(new Song("Come Together", "Ike & Tina Turner", "Rock", 1970, 165));
        songList.add(new Song("With a Little Help from My Friends", "The Beatles", "Rock", 1967, 168));
        songList.add(new Song("Watercolour", "Pendulum", "Electronic", 2010, 155));

        List<Song> rockSongs = songList.stream()
                .filter(song -> song.getGenre().equals("Rock"))
                .collect(Collectors.toList());
        rockSongs.forEach(System.out::println);
        System.out.println("-----------");

        List<Song> allRockSongs = songList.stream()
                .filter(song -> song.getGenre().contains("Rock"))
                .collect(Collectors.toList());
        allRockSongs.forEach(System.out::println);
        System.out.println("-----------");

        List<Song> searchSong50ways = songList.stream()
                .filter(song -> song.getTitle().equalsIgnoreCase("50 ways"))
                .collect(Collectors.toList());
        searchSong50ways.forEach(System.out::println);
        System.out.println("-----------");

        List<Song> searchSongStartsWithH = songList.stream()
                .filter(song -> song.getTitle().startsWith("H"))
                .collect(Collectors.toList());
        searchSongStartsWithH.forEach(System.out::println);
        System.out.println("-----------");

        List<Song> searchRecentSongs = songList.stream()
                .filter(song -> song.getYear() > 1995)
                .collect(Collectors.toList());
        searchRecentSongs.forEach(System.out::println);
        System.out.println("-----------");

        List<String> getAllGenres = songList.stream()
                .map(song -> song.getGenre())
                .distinct() //removes duplicates
                .collect(Collectors.toList());
        getAllGenres.forEach(System.out::println);
        System.out.println("-----------");

        String title = "Silence";
        List<String> allDetailsAboutThisSong = songList.stream()
                .filter(song -> song.getTitle().equals(title))
                .map(s -> s.getArtist())
                .filter(artist -> artist.equals("Delerium"))
                .collect(Collectors.toList());
        allDetailsAboutThisSong.forEach(System.out::println);

    }
}