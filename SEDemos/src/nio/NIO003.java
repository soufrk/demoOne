package nio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Listing files/directories under one directory in old-school (io) style.
 * @author soufrk
 *
 */
public class NIO003 {
	
	public static void main(String args[]){
		try {
			File file = new File("./");
			System.out.println(file.getAbsoluteFile());
			File []dirs = file.listFiles();
			for(File dir:dirs){
				if(dir.isDirectory())
					System.out.println(dir.getAbsolutePath());
			}

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			/*FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();*/

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
