package practice_3;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * @author Wijdane KHATTAT
 */
public class LocaleResourceBundleTest {

    public static void main(String[] args) {
        Locale localeUk = Locale.FRANCE;
        ResourceBundle resourceBundle1 = ResourceBundle.getBundle("bdls/messages", localeUk);
        String offerPattern = resourceBundle1.getString("offer");
        System.out.println(offerPattern);
        String offerFormatted = MessageFormat.format(offerPattern, "Table", "1000 dh", "20 %", "01 Mars 2023");
        System.out.println(offerFormatted);
        //System.out.println(Locale.getDefault());

        /*
        System.out.println("\n************************");
        Locale frLocale = new Locale.Builder().setLanguage("fr").setRegion("FR").build();
        resourceBundle1 =ResourceBundle.getBundle("messages", frLocale);
        offerPattern = resourceBundle1.getString("offer");
        System.out.println(offerPattern);
        offerFormatted = MessageFormat.format(offerPattern, "Table", "1000 dh", "20 %", "01 Mars 2023");
        System.out.println(offerFormatted);

         //Locale uk = new Locale("en","GB","EURO");
        //System.out.println(uk);
        */


    }
}
