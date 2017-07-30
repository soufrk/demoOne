package nio.filewatcher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * A continuous file read operation triggered by user input. File in question is
 * modified externally, using an editor.
 * 
 * @author soufrk
 */
public class ContinuousFileRead {

	public static void main(String[] args) {
		Path path = Paths.get("test.txt");
		String input = "N";
		Scanner consoleIn = new Scanner(System.in);

		do{
			System.out.println("Read file(Y/N):");
			input = consoleIn.nextLine();
			try(Scanner scanner = new Scanner(Files.newBufferedReader(path));){
				while(scanner.hasNextLine()){
					System.out.println(scanner.nextLine());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}while(input.equals("Y"));
	}

}
