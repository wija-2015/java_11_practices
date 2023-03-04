package practice_10;

/**
 * @author Wijdane KHATTAT
 */
public class MemberInner {

    protected String name;
    private static String language="english";

    public int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static String getLanguage() {
        return language;
    }

    public class SecondShippingMode{
        private String description;

        public SecondShippingMode(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
        public void showLanguage(){
            setName("memberInner");
            System.out.println(name);
            System.out.println(getLanguage());
        }
    }
}
