package org.lubna.fundamentals.streams_practise;

import java.util.*;
import java.util.stream.Collectors;

public class JukeBox {
    public static void main(String[] args) {
        List<Song> songList = getSongs();

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

        String getAllGenres = songList.stream()
                .map(song -> song.getGenre())
                .distinct() //removes duplicates
                .collect(Collectors.joining(","));
        System.out.println(getAllGenres);
        System.out.println("-----------");

        String title = "Silence";
        List<String> allDetailsAboutThisSong = songList.stream()
                .filter(song -> song.getTitle().equals(title))
                .map(s -> s.getArtist())
                .filter(artist -> artist.equals("Delerium"))
                .collect(Collectors.toList());
        allDetailsAboutThisSong.forEach(System.out::println);
        System.out.println("-----------");

        List<Song> sortSongsUsingLambda = songList.stream()
                .sorted((o1, o2) -> o1.getYear() - o2.getYear())
                .collect(Collectors.toList());
        sortSongsUsingLambda.forEach(System.out::println);
        System.out.println("-----------");

        List<Song> sortSongsUsingMR = songList.stream()
                .sorted(Comparator.comparingInt(Song::getTimesPlayed))
                .collect(Collectors.toList());
        sortSongsUsingMR.forEach(System.out::println);
        System.out.println("-----------");

        boolean matchGenre = songList.stream().anyMatch(song -> song.getGenre().equals("Electronic"));
        System.out.println(matchGenre);
        System.out.println("-----------");

        Optional<Song> findingFirstResult = songList.stream().filter(song -> song.getYear() == 1905).findFirst();
        if (findingFirstResult.isPresent()) System.out.println(findingFirstResult.get());
        else System.out.println("Cannot find");
        System.out.println("-----------");

        long count = songList.stream().map(song -> song.getGenre()).count();
        System.out.println(count);

        List<String> coffees = Arrays.asList("Cappuccino",
                "Americano", "Espresso", "Cortado", "Mocha");
        Optional<String> sortedCoffeeList = coffees.stream().sorted().findFirst();
        if (sortedCoffeeList.isPresent()) System.out.println("Ascending order");
        else System.out.println("No order");


    }

    public static List<Song> getSongs() {
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
        return songList;
    }
}