package fr.utc.onzzer.common.dataclass;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class TrackLite implements Serializable {
    private UUID id;
    private UUID user;
    private String title;
    private String author;
    private List<String> tags;
    private String album;

    public TrackLite(UUID id, UUID user, String title, String author, String album) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.author = author;
        this.album = album;
        this.tags = new ArrayList<String>();
    }

    // Getters and setters for other attributes


    public UUID getId() {
        return id;
    }

    public UUID getUser() {
        return user;
    }
    public String getAlbum() {
        return album;
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

    public void setUser(UUID user) {
        this.user = user;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAlbum(String album) {
        this.album = album;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackLite trackLite = (TrackLite) o;
        return Objects.equals(id, trackLite.id)
                && Objects.equals(user, trackLite.user)
                && Objects.equals(title, trackLite.title)
                && Objects.equals(author, trackLite.author)
                && Objects.equals(tags, trackLite.tags)
                && Objects.equals(album, trackLite.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, title, author, tags, album);
    }
}
