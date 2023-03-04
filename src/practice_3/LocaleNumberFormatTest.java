package practice_3;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Wijdane KHATTAT
 */
public class LocaleNumberFormatTest {
    public static void main(String[] args) {
        System.out.println("**************en_UK************");
        BigDecimal price = BigDecimal.valueOf(2.99);
        Double tax = 0.2;
        int quantity = 12764599;
        Locale locale = new Locale("en","GB");

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);

        String formattedPrice = currencyFormat.format(price);
        String formattedTax = percentageFormat.format(tax);
        String formattedQuantity = numberFormat.format(quantity);

        System.out.println(formattedPrice);
        System.out.println(formattedTax);
        System.out.println(formattedQuantity);

        System.out.println("***********fr_FR************");
        locale = new Locale("fr","FR");
        currencyFormat = NumberFormat.getCurrencyInstance(locale);
        percentageFormat = NumberFormat.getPercentInstance(locale);
        numberFormat = NumberFormat.getNumberInstance(locale);
        formattedPrice = currencyFormat.format(price);
        formattedTax = percentageFormat.format(tax);
        formattedQuantity = numberFormat.format(quantity);
        System.out.println(formattedPrice);
        System.out.println(formattedTax);
        System.out.println(formattedQuantity);

    }
}
