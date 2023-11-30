package fr.utc.onzzer.common.dataclass;

import java.io.Serializable;
import java.util.*;

public class User implements Serializable {
    private UUID id;
    private String username;
    private String firstName;
    private String lastName;
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

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
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

