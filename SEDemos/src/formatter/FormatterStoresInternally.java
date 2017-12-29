package formatter;

import java.util.Formatter;
import java.util.Locale;

/**
 * Formatter has in-built string-storage facility. No need to use explicit
 * StringBuilder/StringBuffer instances for doing so.
 * 
 * @author soufrk
 *
 */
public class FormatterStoresInternally {

    public static void main(String[] args) {
	int i = 65536;
	long l = 6553665536L;
	float f = 10.2365487f;
	double d = 255695844.0012548965236;

	// StringBuilder sb = new StringBuilder("DataHolder class: \n\n");
	Formatter formatter = new Formatter(Locale.US);

	/*
	 * sb.append(formatter.format("int field: %d\n", i));
	 * sb.append(formatter.format("long field: %d\n", l));
	 * sb.append(formatter.format("float field: %f\n", f));
	 * sb.append(formatter.format("double field: %f\n", d));
	 */

	formatter.format("int field: %d\n", i);
	formatter.format("long field: %d\n", l);
	formatter.format("float field: %f\n", f);
	formatter.format("double field: %f\n", d);
	// sb.append(formatter.toString());
	System.out.println(formatter);
	formatter.close();
    }

}
