package streams.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamNio01 {

	public static void main1(String... args) throws IOException {
		Files.readAllLines(Paths.get("Target.txt"), StandardCharsets.UTF_8)
			.stream()
			.filter(u->u.matches(".*\\/\\w+"))
			//.filter(u->u.length()>0)
			.peek(System.out::println)
			.count()
			;
	}

	public static void main(String... args) {
		try(Stream<String> fileStream = Files.lines(Paths.get("Target.txt"))) {
            fileStream
            .filter(u->u.matches(".*\\/\\w+"))
			//.filter(u->u.length()>0)
			.peek(System.out::println)
			.count()
			;
		} catch(IOException e){
		    e.printStackTrace();
		}	
	}

}
