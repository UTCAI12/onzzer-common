package fr.utc.onzzer.common.dataclass;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class Comment implements Serializable {
    private UUID id;
    private UserLite user;
    private String username;
    private Date date;
    private String text;

    public Comment(UUID id, UserLite user, String username, Date date, String text) {
        this.id = id;
        this.user = user;
        this.username = username;
        this.date = date;
        this.text = text;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
