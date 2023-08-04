package ProjectSONG;

public class Playlist {
    // Instance field
    Song[] playlist;
    int cout;
    String playlistName;
    int playlistSize;
    int sumDuration;

    // Constract
    public Playlist(String name, int size) {
        this.playlistName = name;
        this.playlistSize = size;
        this.playlist = new Song[size];
        this.cout = 0;
        this.sumDuration = 0;
    }

    public void addSong(Song inputSong) {
        //
        playlist[cout++] = inputSong;// index(cout) increase
        sumDuration += inputSong.getDuration();// For totalDuration

    }

    public void showPlaylist() {
        System.out.println("Playlist: " + playlistName);
        for (int i = 0; i < playlist.length; i++) {
            System.out.println(playlist[i]);
        }
    }

    public void totalDuration() {
        System.out.println("Duration: " + sumDuration + "seconds");
    }

    public void lengthPlaylist() {
        System.out.println("Number of songs in the playlist: " + cout);
    }

    public void removeSong(String name) {
        int removedIndex = -1;
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i].getTitle().equals(name)) {
                removedIndex = i;
                break;
            }
        } // find index that have to remove

        // Case song not exist
        if (removedIndex == -1) {
            System.out.println("Song not founded");
        }

        // Dummy Playlist จำลองๆ
        Song[] tempPlaylist = new Song[playlist.length];

        // use 2 loop for put oldplaylist to newplaylist
        // the newIndex will increase if song has input in newplaylist
        int tempIndex = 0;
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null && i != removedIndex) {// Case song != null and i != removedIndex
                tempPlaylist[tempIndex] = playlist[i];
                tempIndex++;
            }
        }
        playlist = tempPlaylist; // replace playlist
        // showPlaylist();
    }

    // getter setter
    public Song[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Song[] playlist) {
        this.playlist = playlist;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public int getPlaylistSize() {
        return playlistSize;
    }

    public void setPlaylistSize(int playlistSize) {
        this.playlistSize = playlistSize;
    }

    public int getSumDuration() {
        return sumDuration;
    }

    public void setSumDuration(int sumDuration) {
        this.sumDuration = sumDuration;
    }

}
