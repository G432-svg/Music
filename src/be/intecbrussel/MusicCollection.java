package be.intecbrussel;
import java.lang.String;
import java.util.Arrays;

public class MusicCollection {

    private String musicCollectionName;
    Playlist[] musicCollection = new Playlist[]{};

    public MusicCollection() {
        musicCollection = new Playlist[3];
    }

    public static int count;

    {

        count++;
    }

    public MusicCollection(String musicCollectionName) {
        this.musicCollectionName = musicCollectionName;
    }

    //Method to add songs to the playlist or to delete

    public void addSongToPlaylist(String playlistName, Song song) {

    }
    public void removeSongFromPlaylist(String playlistName, Song song) {
    }

    //Method to add or remove a playlist
    public void addPlaylist(Playlist playlist) {


    }

    public void removePlaylist(Playlist playlist) {

    }
    //Method to show list
    public void displayPlaylistInCollection(Playlist playlist) {


    }

    public void displaySongsFromPlaylist(String playlistName) {


    }

}
