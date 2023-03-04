package practice_3;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Wijdane KHATTAT
 */
public class LocalizationBundle4 {
    public static void main(String[] args) {
        //1. Load Resource Bundle and format msg
        System.out.println("\n***********************************");
        Locale locale = Locale.UK;
        ResourceBundle msg = ResourceBundle.getBundle("messages", locale);
        System.out.println(msg);
        String offerPattern = msg.getString("offer");
        System.out.println(offerPattern);
        ZoneId london = ZoneId.of("Europe/Paris");
        ZonedDateTime londonTime = ZonedDateTime.of(LocalDateTime.now(), london);
        String datePattern = "EE', 'd' of 'MMMM yyyy' at 'HH:mm z";
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(datePattern, locale);
        String timeTxt = dateFormat.format(londonTime);
        String teaTxt = "Tea";
        double price = 1.88;
        double rate = 0.065;
        price = Math.round(price*100)/100.0;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
        percentFormat.setMaximumFractionDigits(2);
        String priceTxt = currencyFormat.format(price);
        String rateTxt = percentFormat.format(rate);
        String output = MessageFormat.format(offerPattern, teaTxt, priceTxt, rateTxt, timeTxt);
        System.out.println(output);

        //2. Translate version of resource bundle
        System.out.println("\n***********************************");
        locale = new Locale("fr","FR");
        System.out.println(locale);
        msg = ResourceBundle.getBundle("messages", locale);
        offerPattern = msg.getString("offer");
        datePattern = msg.getString("dateFormat");
        currencyFormat = NumberFormat.getCurrencyInstance(locale);
        percentFormat = NumberFormat.getPercentInstance(locale);
        percentFormat.setMaximumFractionDigits(2);
        dateFormat = DateTimeFormatter.ofPattern(datePattern, locale);

        teaTxt = "Thé";
        priceTxt = currencyFormat.format(price);
        rateTxt = percentFormat.format(rate);
        timeTxt = dateFormat.format(londonTime);
        System.out.println(timeTxt);
        String outputFr= MessageFormat.format(offerPattern, teaTxt, priceTxt, rateTxt, timeTxt);
        System.out.println(outputFr);

    }
}
