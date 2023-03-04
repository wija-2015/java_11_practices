package practice_10;

import java.math.BigDecimal;

/**
 * @author Wijdane KHATTAT
 */
public class LocalInnerOrder {
    private String order ="order1";
    private static int count = 10;
    public BigDecimal manageTax(BigDecimal price){
        //price = price.multiply(BigDecimal.valueOf(2)); //not compiled
        class OrderTaxManager{
            private BigDecimal calculatTax(){
                return price.multiply(BigDecimal.valueOf(2)).add(BigDecimal.valueOf(1));
            }
            public void showOrderInfo(){
                System.out.println(order);
                System.out.println(count);
            }
        }
        OrderTaxManager orderTaxManager = new OrderTaxManager();
        orderTaxManager.showOrderInfo();
        BigDecimal tax = orderTaxManager.calculatTax();
        return tax;
    }
}
