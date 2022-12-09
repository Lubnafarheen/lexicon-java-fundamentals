package org.lubna.fundamentals.streams_practise;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPuzzle {
    public static void main(String[] args) {
        SongSearch songSearch = new SongSearch();
        songSearch.printTopFiveSongs();
        songSearch.search("Pendulum");

    }
}

class SongSearch {
    private final List<Song> songs = JukeBox.getSongs();

    void printTopFiveSongs() {
        List<String> topFive = songs.stream()
                .sorted(Comparator.comparing(Song::getTimesPlayed))
                .map(Song::getTitle).limit(5).collect(Collectors.toList());
        topFive.forEach(System.out::println);
    }

    void search(String artist){
      Optional<Song> searchByArtist = songs.stream()
              .filter(song -> song.getArtist().equalsIgnoreCase(artist)).findFirst();
      if (searchByArtist.isPresent()) System.out.println(searchByArtist.get());
      else System.out.println("No song found by" + artist);
    }


}
