package fr.utc.onzzer.common.services;

import fr.utc.onzzer.common.dataclass.Comment;
import fr.utc.onzzer.common.dataclass.Rating;
import fr.utc.onzzer.common.dataclass.TrackLite;

import java.util.UUID;
import java.util.List; // Assuming Rating and Comment are custom classes

public interface ComMusicServices {
    void downloadTrack(UUID trackId) throws Exception;
    void updateTrack(TrackLite track) throws Exception;
    void publishTrack(TrackLite track) throws Exception;
    void unpublishTrack(TrackLite track) throws Exception;
    void addRating(UUID trackId, Rating rating) throws Exception;
    void addComment(UUID trackId, Comment comment) throws Exception;
}