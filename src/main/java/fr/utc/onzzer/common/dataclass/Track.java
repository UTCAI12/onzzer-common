package fr.utc.onzzer.common.dataclass;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Track implements Serializable {
    private UUID id;
    private UUID userId;
    private String title;
    private String author;
    private List<String> tags;
    private List<Rating> ratings;
    private List<Comment> comments;
    private byte[] audio;

    public Track(UUID id, UUID userId, String title, String author) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.author = author;
        this.tags = new ArrayList<String>();
        this.ratings = new ArrayList<Rating>();
        this.comments = new ArrayList<Comment>();
    }

    // Getters and setters for other attributes


    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
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
        TrackLite trackLite = new TrackLite(this.id, this.userId, this.title,this.author);
        return trackLite;
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

