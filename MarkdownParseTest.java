import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;

public class MarkdownParseTest {
    String testfilemd = "";
    ArrayList<String> testfilecontains;
    @Before
    public void setUp() throws IOException{
	    testfilemd = Files.readString(Path.of("test-file.md"));
	    testfilecontains = new ArrayList<String>(Arrays.asList(
		 new String[]{ "https://something.com",
		    "https://something.com",
		   "some-thing.html"}));
    }
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testGetLinksTestFileMd() {
        assertEquals(testfilecontains,MarkdownParse.getLinks(testfilemd));
    }
}
