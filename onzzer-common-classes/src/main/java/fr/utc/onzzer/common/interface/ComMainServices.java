package fr.utc.onzzer.common.services;

import fr.utc.onzzer.common.dataclass.Track;
import fr.utc.onzzer.common.dataclass.UserLite;

import java.net.ConnectException;
import java.util.List;
import java.util.UUID;

public interface ComMainServices {
    void connect(UserLite user, List<Track> trackList) throws ConnectException;
    void editUser(UserLite user) throws Exception;
    void disconnect() throws Exception;
}