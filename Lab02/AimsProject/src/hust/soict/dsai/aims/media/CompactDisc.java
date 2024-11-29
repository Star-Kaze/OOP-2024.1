package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
        super(title, category, cost, length, director);
        this.artist = artist;
    }

    public CompactDisc() {

    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("The track has already existed");
        } else {
            tracks.add(track);
            System.out.println("Adding track successfully");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Removing track successfully");
        } else {
            System.out.println("The track has not existed");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track:tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public void play() {
        System.out.println("Playing compact disk: " + this.getTitle());
        for (Track track:tracks) {
            track.play();
        }
    }
}
