package fr.utc.onzzer.common.dataclass;

import java.io.IOException;
import java.io.Serializable;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.nio.file.Files;

public class Track implements Serializable {
    private UUID id;
    private UUID userId;
    private String title;
    private String author;
    private List<String> tags;
    private List<Rating> ratings;
    private List<Comment> comments;
    private byte[] audio;
    private Boolean privateTrack;
    private String album;



    public Track(UUID id, UUID userId, String title, String author, Boolean privateTrack) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.author = author;
        this.privateTrack = privateTrack;
        this.tags = new ArrayList<String>();
        this.ratings = new ArrayList<Rating>();
        this.comments = new ArrayList<Comment>();
    }
    public Track(UUID uuid, byte[] audio, UUID userId, String title, String author, Boolean privateTrack){
        this.id = uuid;
        this.userId = userId;
        this.title = title;
        this.author = author;
        this.privateTrack = privateTrack;
        this.tags = new ArrayList<String>();
        this.ratings = new ArrayList<Rating>();
        this.comments = new ArrayList<Comment>();
        this.audio = audio;
    }

    public Track(UUID uuid, String audioPath, UUID userId, String title, String author, Boolean privateTrack) throws IOException {
        this.id = uuid;
        this.userId = userId;
        this.title = title;
        this.author = author;
        this.privateTrack = privateTrack;
        this.tags = new ArrayList<String>();
        this.ratings = new ArrayList<Rating>();
        this.comments = new ArrayList<Comment>();
        this.audio = Files.readAllBytes(Paths.get(audioPath));
    }
    // Getters and setters for other attributes

    public void setPrivateTrack(Boolean privateTrack) {
        this.privateTrack = privateTrack;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    public UUID getId() {
        return id;
    }
    public String getAlbum() {
        return album;
    }
    public UUID getUserId() {
        return userId;
    }
    public Boolean getPrivateTrack() {
        return privateTrack;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public byte[] getAudio() {
        return audio;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAuthor(Boolean privateTrack) {
        this.privateTrack = privateTrack;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setAudio(byte[] audio) {
        this.audio = audio;
    }
    public TrackLite toTrackLite(){
        TrackLite trackLite = new TrackLite(this.id, this.userId, this.title,this.author, album);
        return trackLite;
    }

    public String asMp3File(String nomFichier) throws IOException {
        String repertoireTemporaire = System.getProperty("java.io.tmpdir");
        String nomFichierAvecExtension = nomFichier + ".mp3";
        Path cheminFichier = Path.of(repertoireTemporaire, nomFichierAvecExtension);
        Files.write(cheminFichier, this.audio, StandardOpenOption.CREATE);
        return cheminFichier.toString();
    }

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", tags=" + tags +
                ", ratings=" + ratings +
                ", comments=" + comments +
                ", audio=" + Arrays.toString(audio) +
                '}';
    }
}

