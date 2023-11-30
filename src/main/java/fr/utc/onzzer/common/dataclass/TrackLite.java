package fr.utc.onzzer.common.dataclass;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TrackLite implements Serializable {
    private UUID id;
    private UserLite user;
    private String title;
    private String author;
    private List<String> tags;

    public TrackLite(UUID id, UserLite user, String title, String author) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.author = author;
        this.tags = new ArrayList<String>();
    }

    // Getters and setters for other attributes


    public UUID getId() {
        return id;
    }

    public UserLite getUser() {
        return user;
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

    public void setId(UUID id) {
        this.id = id;
    }

    public void setUser(UserLite user) {
        this.user = user;
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

    @Override
    public String toString() {
        return "TrackLite{" +
                "id=" + id +
                ", user=" + user +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", tags=" + tags +
                '}';
    }
}
