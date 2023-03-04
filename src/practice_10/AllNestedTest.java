package practice_10;


import java.math.BigDecimal;

/**
 * @author Wijdane KHATTAT
 */
public class AllNestedTest {

    public static void main(String[] args) {

        /*System.out.println("************** Static nested class ***************");
        OuterStatic.ShippingMode shippingMode= new OuterStatic.ShippingMode("firstShipping");
        System.out.println(shippingMode.getDescription());
        shippingMode.showOuterInfo();*/


        System.out.println("\n************** Member inner class ***************");
        MemberInner memberInner = new MemberInner();
        MemberInner.SecondShippingMode secondShippingMode = memberInner.new SecondShippingMode("secondShipping");
        System.out.println(secondShippingMode.getDescription());
        secondShippingMode.showLanguage();

        System.out.println("\n************** Local inner class ***************");
        LocalInnerOrder order = new LocalInnerOrder();
        System.out.println(order.manageTax(BigDecimal.valueOf(2)));

        /*System.out.println("\n************** Anonymuous inner class ***************");
        Order order1 = new Order() {
            @Override
            public BigDecimal getDiscount() {
                System.out.println(orderName);
                return BigDecimal.TEN;
            }

            public void showMsg(){
                System.out.println("msg");
            }
        };
        System.out.println(order1.getDiscount());*/

    }
}
