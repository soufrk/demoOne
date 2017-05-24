package nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Demo of FileVisitor.
 * <ul>
 * <li>Alphabetical order of file visit.</li>
 * <li>Folder depth visit first.</li>
 * </ul>
 * @author souvik.goswami
 *
 */
public class FileVisitor extends SimpleFileVisitor<Path> {
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
		System.out.println(file);
		return FileVisitResult.CONTINUE;
	}
	/*@Override
    public FileVisitResult postVisitDirectory(Path dir,
                                          IOException exc) {
        //System.out.format("Directory: %s%n", dir);
        return FileVisitResult.CONTINUE;
    }*/
	@Override
    public FileVisitResult visitFileFailed(Path file,
                                       IOException exc) {
        System.err.println(exc);
        return FileVisitResult.CONTINUE;
    }

	public static void main(String[] args) {
		Path path = Paths.get("/");
		try {
			Files.walkFileTree(path, new FileVisitor());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
