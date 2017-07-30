package nio.filewatcher;

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
 * Simple FileWatcher, that automatically reads any file, if there is any I/O operation 
 * like create, delete, apeends.
 * Assumed there is a sinlge file under directory being observed, and I/O event is 
 * append always.
 * 
 * @author souvik.goswami
 *
 */
public class WatcherDemo1 {

	public static void main(String[] args) {
		Path dir = Paths.get("").toAbsolutePath();
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
					System.out.println("Event triggered by:" + filename);
					try (Scanner scanner = new Scanner(Files.newBufferedReader(filename));) {
						while (scanner.hasNextLine()) {
							System.out.println(scanner.nextLine());
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
