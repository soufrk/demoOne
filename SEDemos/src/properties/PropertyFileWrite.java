package properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFileWrite {

    public static void main(String[] args) {
	Properties prop = new Properties();
	OutputStream output = null;
	try {
	    output = new FileOutputStream("my.properties");

	    // set the properties value
	    prop.setProperty("key1", "localhost");
	    prop.setProperty("key2", "mkyong");
	    prop.setProperty("key3", "password");

	    // save properties to project root folder
	    prop.store(output, null);

	} catch (IOException io) {
	    io.printStackTrace();
	} finally {
	    if (output != null) {
		try {
		    output.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    }

	}

    }

}
