package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileRead {

    public static void main(String[] args) {
	Properties prop = new Properties();
	InputStream input = null;

	try {
	    input = new FileInputStream("my.properties");

	    // load a properties file
	    prop.load(input);

	    // get the property value and print it out
	    System.out.println(prop.getProperty("key1"));
	    System.out.println(prop.getProperty("key2"));
	    System.out.println(prop.getProperty("key4"));

	} catch (IOException ex) {
	    ex.printStackTrace();
	} finally {
	    if (input != null) {
		try {
		    input.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    }
	}

    }

}
