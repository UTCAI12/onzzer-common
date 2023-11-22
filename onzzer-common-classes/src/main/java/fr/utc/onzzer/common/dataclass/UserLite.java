package fr.utc.onzzer.common.dataclass;

import java.util.UUID;

public class UserLite {
    private UUID id;
    private String username;

    public UserLite(UUID id, String username) {
        this.id = id;
        this.username = username;
    }

    // Getters and setters

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
}
