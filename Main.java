package ProjectSONG;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("My Playlist", 10);

        playlist.addSong(new Song("Song 1", "Artist 1", 120));
        playlist.addSong(new Song("Song 2", "Artist 2", 60));
        playlist.addSong(new Song("Song 3", "Artist 3", 20));
        playlist.showPlaylist();
        playlist.lengthPlaylist();
        playlist.totalDuration();
        playlist.removeSong("Song 2");
        // playlist.showPlaylist();
    }

}
