package practice_10;

/**
 * @author Wijdane KHATTAT
 */
public class OuterStatic {

    private String name;
    private static String language="english";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static String getLanguage() {
        //showOuterInfo();
        return language;
    }

    public static void createShipping(String descrip){
        new ShippingMode(descrip);
    }

    protected static class ShippingMode{

        private String language="fr";
        private String description;

        public ShippingMode(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
        public void showOuterInfo(){
            System.out.println(language);
            //System.out.println(name);
            System.out.println(getLanguage());
        }
    }
}
