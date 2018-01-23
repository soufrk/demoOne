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
 * <li>Only visits file not directories.</li>
 * <li>Alphabetical order of file visit.</li>
 * <li>Folder depth visit first.</li>
 * </ul>
 * 
 * @author soufrk
 *
 */
public class FileVisitor extends SimpleFileVisitor<Path> {
    
    private static final String PATH = "D:/Workspace/MySpace/Rough/testDir";

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
	System.out.println(file);
	return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
	System.out.println("After visiting directory:" + dir.toString());
	return FileVisitResult.CONTINUE;
    }
    
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs){
	System.out.println("Before visiting directory:" + dir.toString());
	return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exception) {
	System.err.println(exception);
	return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) {
	Path path = Paths.get(PATH);
	try {
	    Files.walkFileTree(path, new FileVisitor());
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
