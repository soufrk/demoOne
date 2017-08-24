package algorithms;

import static java.nio.file.StandardWatchEventKinds.*;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Scanner;

/**
 * Continuation from {@link:nio.filewatcher.WatcherDemo1}. A scrolling log
 * reader implementation. Reads a simple text file in your classpath. Ensure
 * there is only a single file present at the classpath.
 * 
 * @author soufrk
 *
 */
public class ScrollingLogReader {

    private static String[] CONSOLE_OUT = new String[5];

    public static void main(String[] args) {
	Path dir = Paths.get("").toAbsolutePath();
	int linesReadLast = 0;
	try {
	    WatchService watcher = FileSystems.getDefault().newWatchService();
	    WatchKey key = dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
	    while (true) {
		WatchKey innerKey;
		try {
		    key = watcher.take();
		} catch (InterruptedException x) {
		    return;
		}
		for (WatchEvent<?> event : key.pollEvents()) {
		    WatchEvent.Kind<?> kind = event.kind();
		    if (kind == OVERFLOW) {
			continue;
		    }
		    WatchEvent<Path> ev = (WatchEvent<Path>) event;
		    Path filename = ev.context();
		    int linesReadThisTime = 0;
		    try (Scanner scanner = new Scanner(Files.newBufferedReader(filename));) {
			while (scanner.hasNextLine()) {
			    String line = scanner.nextLine();
			    linesReadThisTime++;
			    if (linesReadLast < linesReadThisTime) {
				linesReadLast = linesReadThisTime;
				System.out.println(line);
			    }
			}
		    } catch (IOException e) {
			e.printStackTrace();
		    }

		    boolean valid = key.reset();
		    if (!valid) {
			break;
		    }
		}
	    }
	} catch (IOException x) {
	    System.err.println(x);
	}
    }
}
