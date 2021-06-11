import org.junit.Test;
import java.nio.file.*;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;

public class WatchServiceTest {
    @Test
    public  void givenADirectory_WhenWatchedListAllTheActivites() throws IOException{
        Path dir = Paths.get("C:\\Users\\Durga Prasath\\IdeaProjects\\FilesCreated");
        Files.list(dir).filter(Files::isRegularFile).forEach(System.out::println);
        new Java8WatchServiceExample(dir).processEvents();
    }
}
