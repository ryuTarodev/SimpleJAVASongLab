package ProjectSONG;

public class Song {
    private String title;
    private String artist;
    private int duration;
    private boolean isLike;

    // Constructor
    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration; // in seconds
        this.isLike = false;
    }

    // Getter Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song [title=" + title + ", artist=" + artist + ", duration=" + duration + "]";
    }
}
