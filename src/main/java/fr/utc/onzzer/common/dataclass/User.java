package fr.utc.onzzer.common.dataclass;

import java.io.Serializable;
import java.util.*;

public class User implements Serializable {
    private UUID id;
    private String username;
    private List<Track> trackList;
    private String email;
    private String password;
    private Date birthdate;
    private byte[] avatar;

    public User(UUID id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.trackList = new ArrayList<Track>();
    }

    // Getters and setters for other attributes

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Other getters and setters for the remaining attributes

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", trackList=" + trackList +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", birthdate=" + birthdate +
                ", avatar=" + Arrays.toString(avatar) +
                '}';
    }
}

