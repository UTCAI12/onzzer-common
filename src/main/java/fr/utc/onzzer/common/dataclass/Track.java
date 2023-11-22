package fr.utc.onzzer.common.dataclass;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Track {
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

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    // Other getters and setters for the remaining attributes

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public byte[] getAudio() {
        return audio;
    }

    public void setAudio(byte[] audio) {
        this.audio = audio;
    }
}

