package practice_5;

import java.util.Arrays;

/**
 * @author Wijdane KHATTAT
 */
public class Shop2 {

    public static void main(String[] args) {
        Rating rating = Rating.NOT_RATED;
        switch (rating){
            case NOT_RATED:
                System.out.println("Not rated");
                break;
            case FOUR_STAR:
                System.out.println("Four stars");
                break;
        }

        System.out.println(rating== Rating.NOT_RATED);
        Rating[] ratings = Rating.values();
        System.out.println(Arrays.toString(ratings));
        System.out.println(Rating.valueOf("FOUR_STAR"));
        //System.out.println(rating.name());
        System.out.println(rating.ordinal());
        //System.out.println(rating.);
    }
}
