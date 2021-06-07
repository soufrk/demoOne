import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\sogoswami\\Desktop");
        String glob = "*.java";
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path, glob);
        Iterator<Path> fileIterator = directoryStream.iterator();
        while(fileIterator.hasNext()) {
            covertTabs(fileIterator.next());
        }
    }

    private static void covertTabs(Path next) throws IOException {
        BufferedInputStream bs = new BufferedInputStream(Files.newInputStream(next, StandardOpenOption.READ));
        System.out.format("===Filename:%-20s===\n", next.getFileName());
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        int read = -1, line = 0, column = 0;
        do {
            read = bs.read();
            //switch(read) {
            //case '\t': // If TAB is encountered
            //    System.out.format("Tab at line:%d, column:%d\n", line, column); // DEBUG
            //    break;
            //case '\n':
            //    column = 0;
            //    line++;
            //    break;
            //default:
            //    column++;
            //}
            if(read == '\t') {
                //System.out.println("Space");
                buf.write("    ".getBytes());
            } else {
                buf.write((byte)read);
            }
        } while(read> -1);
        System.out.format("%s\n%s\n", "=======READ FILE CONTENTS========", buf.toString("UTF-8"));
        Path editedFile = Files.write(Paths.get(next.toAbsolutePath().toString() + "-edited"), 
            buf.toByteArray(), StandardOpenOption.WRITE, StandardOpenOption.CREATE, 
            StandardOpenOption.TRUNCATE_EXISTING);
        System.out.format("%s\n%s\n", "=======EDITED FILE ========", editedFile.toAbsolutePath().toString());
    }
}ÿ
