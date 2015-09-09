package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Additional Range Operation using ^, &&.
 * @author souvik.goswami
 *
 */
public class Pattern004 {

	public static void main(String[] args) {
		String input = "john o jo hn jon n j ohn ojhn john";
		//Pattern pattern = Pattern.compile("[a-bA-B]");
		Pattern pattern = Pattern.compile("john|ohn");
		Matcher matcher = pattern.matcher(input);
		String output = "Found match at:[";
		while(matcher.find()){
			output += matcher.start() + ",";
		}
		output = output.substring(0, output.length()-1) + "]";
		System.out.println(output);

	}

}
