import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class NoMarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void multiplication() {
        assertEquals(10, 5*2);
    }
    
   
    /* public void testLink()  throws IOException{
        String[] links = {"https://something.com","some-page.html"};
        List<String> Array4 = Arrays.asList("http:…");
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(regLines));
    } */
    @Test
    public void testLink() throws IOException {
        String regFile = Files.readString(Path.of("./test-file.md"));
        String[] regLines = regFile.split("\n");
        assertEquals(List.of("https://something.com","some-page.html"), NewMarkdownParse.getLinks(regLines));
    }

   

    }

