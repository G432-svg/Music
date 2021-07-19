package be.intecbrussel;
import java.lang.String;
import java.util.*;

public class Playlist {
    private String playlistName;
    Song[] playlist;
//    playlist = new Song[]{} ;
    public static int count;
    {
        count++;
    }

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public Song[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Song[] playlist) {
        this.playlist = playlist;
    }

    //Adds a Song to a Playlist.
    public void addSong(Song song) {

    }

//    Removes the song located at the specified index from the Playlist.
//    public void removeSong(String index) {
//        System.out.println(this.removeSong());
//
//    }
//
//    public int getcountOfPlaylist() {
//        return countOfPlaylist();
//
//    }

    public void displayPlaylist() {


    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlistName='" + playlistName + '\'' +
                ", playlist=" + Arrays.toString(playlist) +
                '}';
    }

    public void sortByName() {


    }

}

 
