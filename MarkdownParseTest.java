import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;

public class MarkdownParseTest {
    ArrayList<String> fileText;
    ArrayList<ArrayList<String>> fileContains;
    @Before
    public void setUp() throws IOException{
	    fileText = new ArrayList();
	    fileContains = new ArrayList();
	    //test-file.md
	    fileText.add(Files.readString(Path.of("test-file.md")));
	    fileContains.add(new ArrayList<String>(Arrays.asList(
		 new String[]{ "https://something.com",
		   "some-thing.html"})));
    }
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testTestFiles() {
	for(int i = 0; i < fileContains.size(); i++){
        	assertEquals(fileContains.get(i),MarkdownParse.getLinks(fileText.get(i)));
	}
    }
}
