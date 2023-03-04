package practice_3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Wijdane KHATTAT
 */
public class BigDecimalNumeric2 {
    public static void main(String[] args) {
        //3.2
        //1.Primitives Vs BigDecimal
        double price = 1.88;
        double rate = 0.065;
        price -= price*rate;
        System.out.println(price);
        price = Math.round(price*100)/100.0;
        System.out.println(price);

        BigDecimal price2 = BigDecimal.valueOf(1.88);
        BigDecimal rate2 = BigDecimal.valueOf(0.065);
        price2 = price2.subtract(price2.multiply(rate2))
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println(price2);
        BigDecimal bd=BigDecimal.valueOf(2.565).setScale(2, RoundingMode.DOWN);
        bd=BigDecimal.valueOf(1.6).setScale(1, RoundingMode.UP);
        System.out.println(bd);

        System.out.println("\n*****************************");
        Locale locale = Locale.FRANCE; //new Locale("fr","FR") //Locale.forLanguageTag("fr-FR)
        System.out.println(locale);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
        percentFormat.setMaximumFractionDigits(2);
        System.out.println(currencyFormat.format(price));
        System.out.println(percentFormat.format(rate));

        locale = Locale.UK;
        System.out.println(locale);
        currencyFormat = NumberFormat.getCurrencyInstance(locale);
        percentFormat = NumberFormat.getPercentInstance(locale);
        percentFormat.setMaximumFractionDigits(2);
        String priceTxt = currencyFormat.format(price);
        String rateTxt = percentFormat.format(rate);
        System.out.println(priceTxt);
        System.out.println(rateTxt);

    }
}
