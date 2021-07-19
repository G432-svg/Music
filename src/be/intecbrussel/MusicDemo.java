package be.intecbrussel;

public class MusicDemo {
    public static void main(String[] args) {
        MasterPlaylist songs;

        // construct call
        songs = new MasterPlaylist();


        Song playlist[] = songs.getPlaylist();
        Song song1 = new Song("Hotline Bling", "Drake", "Hotline Bing - Single", 267000);
        Song song2 = new Song("What Do You Mean?", "Justin Bieber", "What Do You Mean? - Single", 207000);
        Song song3 = new Song("Watch Me", "Silento", "Watch Me (Whip / Nae Nae) - Single", 185000);
        Song song4 = new Song("679", "Fetty Wap ft. Remy Boyz", "Fetty Wap", 185000);
        Song song5 = new Song("Can't Feel My Face", "The Weeknd", "Beauty Behind the Madness", 213000);
        Song song6 = new Song("Good for You", "Selena Gomez ft. A$AP Rocky", "Good for You - Single", 221000);
        Song song7 = new Song("If You", "Big Bang", "MADE", 264000);

        Song song8 = new Song("Celine Dion","My heart will go on","Titanic", 364152);
        Song song9 =new Song( "Only You", "Kylie Minogue","Christmas",450000);

        songs.addSong(song1);
        songs.addSong(song2);
        songs.addSong(song3);
        songs.addSong(song4);
        songs.addSong(song5);
        songs.addSong(song6);
        songs.addSong(song7);


        print(playlist);


        songs.removeSong(song4);
        songs.removeSong(song7);

        print(playlist);

        songs.addSong(song8);
        songs.addSong(song9);

        print(playlist);

    }

    private static void print(Song[] playlist) {
        printHeader();



        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null) {
                System.out.println(playlist[i]);
                playlist[i].getAlbum();
                fancyLines(55);
            }
        }
    }

    private static void printHeader() {
        fancyLines(45);
        System.out.println("\t\t\t\tPlaylist\n");
        fancyLines(45);
    }

    private static void fancyLines(int numbOfLines) {
        for (int i = 0; i < numbOfLines; i++) {
            System.out.print("-");
            if (i == (numbOfLines - 1)) {
                System.out.println("|\n");
            }
        }
    }
}
