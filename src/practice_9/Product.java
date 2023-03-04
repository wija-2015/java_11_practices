package practice_9;

/**
 * @author Wijdane KHATTAT
 */
public class Product implements Comparable<Product>{

    private String name;
    private int price;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Product o) {
        //return this.name.compareTo(o.getName());  //Ascending sort
        return o.getName().compareTo(this.name);  //Descending sort
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int comparePrices(Product p2){
        if (this.price<p2.price){
            return -1;
        }else if(this.price>p2.price)
            return 1;
        else return 0;
    }
}
