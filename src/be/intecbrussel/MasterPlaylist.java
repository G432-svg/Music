package be.intecbrussel;
import java.lang.String;
import java.util.Arrays;

public class MasterPlaylist {
     private Song[] playlist;

    public MasterPlaylist() {
        playlist = new Song[12];
    }

    public void addSong(Song song) {

        if (!isSongPresent(song)) {

            for (int i = 0; i < playlist.length; i++) {

                if (playlist[i] == null) {

                    playlist[i] = song;
                    break;
                } else if (playlist[i] != null && i == (playlist.length - 1)){
                    System.out.println("Sorry no more place in this playlist.");
                }
            }
        }
    }

    public void removeSong(Song song) {
        if (isSongPresent(song)){
            for (int i = 0; i < playlist.length; i++){
                if (song.equals(playlist[i])){
                    playlist[i] = null;
                    return;
                }
            }
        }
    }

    private boolean isSongPresent (Song song) {
        for (Song s: playlist) {
            if (s != null) {
                if (s.getAlbum() == song.getAlbum()){
                    return true;
                }
            }
        }
        return false;
    }


    public Song[] getPlaylist () {

        return playlist;
    }

}





