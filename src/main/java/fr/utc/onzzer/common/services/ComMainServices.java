package fr.utc.onzzer.common.services;

import fr.utc.onzzer.common.dataclass.Track;
import fr.utc.onzzer.common.dataclass.UserLite;

import java.net.ConnectException;
import java.net.InetAddress;
import java.util.List;

public interface ComMainServices {
    void connect(UserLite user, List<Track> trackList, String ip, int port) throws ConnectException;
    void editUser(UserLite user) throws Exception;
    void disconnect() throws Exception;
}