package fr.utc.onzzer.common.dataclass;

import junit.framework.TestCase;
import fr.utc.onzzer.common.dataclass.Track;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

public class TrackTest extends TestCase {

    public void testAsMp3File() {
        try {
            Path path = Paths.get("src/test/java/fr/utc/onzzer/common/dataclass/Booba - 92i Veyron.mp3");
            byte[] mp3bytes = Files.readAllBytes(path);
            Track track= new Track(UUID.randomUUID(),mp3bytes, UUID.randomUUID(),"title","author",false);
            String pathBooba = track.asMp3File("boobaV2");
            System.out.println(pathBooba);
        } catch (IOException e) {
            fail("Erreur lors de l'enregistrement du fichier : " + e.getMessage());
        }
    }
}