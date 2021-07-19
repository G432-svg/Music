package be.intecbrussel;


import java.lang.String;

public class Song {

    private String title;
    private String artist;
    private String album;
    private float playTime;


    //Creates a playlist object with an artist, title, album, playTime.


    public Song(String title, String artist, String album, float playTime) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.playTime = playTime;
    }

    //Sets Song's artist to argument artist.
    public void setArtist(String artist){
        this.artist = artist;
    }

    //Return the value of artist in a Song.
    public String getArtist() {
        return artist;
    }

    //Sets Song's title to argument title.
    public void setTitle(String title) {
        this.title = title;
    }

    //Returns the value of title in a Song.
    public String getTitle() {
        return this.title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Float getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Float playTime) {
        this.playTime = playTime;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", playTime=" + playTime +
                '}';
    }
}