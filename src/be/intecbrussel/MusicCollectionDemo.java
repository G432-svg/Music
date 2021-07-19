package be.intecbrussel;

public class MusicCollectionDemo {


    public static void main(String[] args) {
        MusicCollection playlists;
        Playlist[] musicCollection = new Playlist[3];
        playlists = new MusicCollection();



        Playlist playlist1 = new Playlist("Remix");
        Playlist playlist2 = new Playlist("Megalux");
        Playlist playlist3 = new Playlist("Alfa");

        playlists.addPlaylist(playlist1);
        playlists.addPlaylist(playlist2);
        playlists.addPlaylist(playlist3);

        System.out.println(musicCollection);

        playlists.removePlaylist(playlist2);

        System.out.println(musicCollection);



    }
    private static void print(MusicCollection[] playlists) {
        printHeader();

        for (int i = 0; i < playlists.length; i++) {
            if (playlists[i] != null) {
                System.out.println(playlists[i]);

                fancyLines(55);
            }


        }
    }

    private static void printHeader() {
        fancyLines(45);
        System.out.println("\t\t\t\tPlaylistName\n");
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
