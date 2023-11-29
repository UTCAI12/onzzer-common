package fr.utc.onzzer.common.dataclass;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class Rating implements Serializable {
    private UUID id;
    private UserLite user;
    private String username;
    private Date date;
    private short value;

    public Rating(UUID id, UserLite user, String username, Date date, short value) {
        this.id = id;
        this.user = user;
        this.username = username;
        this.date = date;
        this.value = value;
    }

    // Getters and setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UserLite getUser() {
        return user;
    }

    public void setUser(UserLite user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public short getValue() {
        return value;
    }

    public void setValue(short value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "id=" + id +
                ", user=" + user +
                ", username='" + username + '\'' +
                ", date=" + date +
                ", value=" + value +
                '}';
    }
}
