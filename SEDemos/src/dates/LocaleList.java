package dates;

import java.util.Arrays;
import java.util.Locale;

public class LocaleList {

    public static void main(String[] args) {
        Arrays.stream(Locale.getAvailableLocales())
            .map(e->e.toString())
            .sorted()
            .forEach(e->System.out.format("%s\n", e));
    }

}
