package practice_10;

import java.math.BigDecimal;

/**
 * @author Wijdane KHATTAT
 */
public interface Order {

    public String orderName="order1";
    public BigDecimal getDiscount() ;
}

class OrderChild implements Order{
    @Override
    public BigDecimal getDiscount() {
        return BigDecimal.ONE;
    }
}
