package practice_11;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.function.*;
import java.util.logging.Logger;
import java.util.logging.LoggingPermission;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Wijdane KHATTAT
 */
public class StreamTest {

    public static void main(String[] args) {
        Stream<String> streams = Stream.of("Red", "Green", "Blue");
        streams.forEach(System.out::println);
        streams.forEach(System.out::println);
        System.out.println("***************** Immutability of stream ******************");
        Product p1 = new Food(1, "Pizza", BigDecimal.valueOf(2), LocalDate.now());
        Product p2 = new Food(2, "Tacos", BigDecimal.valueOf(4), LocalDate.now());
        Product p3 = new Drink(3, "Coka", BigDecimal.valueOf(6));
        Product p4 = new Drink(4, "Pepsi", BigDecimal.valueOf(8));
        List<Product> menu = new ArrayList<>();
        menu.add(p1); menu.add(p2); menu.add(p3);menu.add(p4);
        menu.stream().sorted().filter(p-> p.getPrice().compareTo(BigDecimal.valueOf(4)) > 0).forEach(p -> System.out.println(p.getName()+" "+p.getPrice()));
        System.out.println();
        menu.stream().forEach(e -> System.out.println(e.getPrice()));

        System.out.println("\n************ Functional Interfaces ************");
        Predicate<Product> predicate = p -> p.getId() > 1;
        Function<Product, BigDecimal> function = p -> p.getPrice();
        Consumer<BigDecimal> consumer = bd -> {
            bd.multiply(BigDecimal.valueOf(2));
            System.out.println(bd);
        };
        menu.stream()
                .filter(predicate)
                .map(function)
                .forEach(consumer);
        Supplier<String> supplier = () -> new String("Good thing");
        UnaryOperator<String> textConverter = s -> s.toUpperCase();

        System.out.println("\n************ Primitive Variants of Functional Interfaces  ************");
        int sum1 = Stream.of("ONE","TWO","THREE","FOUR")
                .mapToInt(s->s.length())
                .peek(i->System.out.println(i))
                .filter(i->i>3)
                .sum();
        System.out.println("Sum is "+sum1);


        System.out.println("\n************ Bi-argument of Functional Interfaces ************");
        Predicate<Product> predicate1 = p -> p.getId()>1;
        BiPredicate<Product, String> biPredicate = (p, s) -> p.getName().equals(s);
        System.out.println(biPredicate.test(p1, "Pizza"));
        System.out.println(biPredicate.test(p1, "Coka"));

        BiFunction<Product, BigDecimal, Integer> biFunction = (p, bd) -> p.getPrice().multiply(bd).intValue();
        System.out.println(biFunction.apply(p1, BigDecimal.TEN));



        System.out.println("\n************ Other Intermediate Stream Operations ************");
        Stream.of("A","C","B","D","B","D")
                .distinct()
                .sorted()
                .skip(2)
                .forEach(s -> System.out.println(s));
        System.out.println();
        Stream.of("B","C","A","E","D","F")
                .takeWhile(s->!s.equals("D"))
                .dropWhile(s->!s.equals("C"))
                .limit(2)
                .forEach(s -> System.out.println(s));


        System.out.println("\n************ Other Terminal Stream Operations  ************");
        String[] values = {"RED","GREEN","BLUE"};
        boolean allGreen = Arrays.stream(values).allMatch(s->s.equals("GREEN"));
        boolean anyGreen = Arrays.stream(values).anyMatch(s->s.equals("GREEN"));
        boolean noneGreen = Arrays.stream(values).noneMatch(s->s.equals("GREEN"));
        Optional<String> anyColour = Arrays.stream(values).findAny();
        Optional<String> firstColour = Arrays.stream(values).findFirst();
        System.out.println(allGreen);
        System.out.println(anyGreen);
        System.out.println(noneGreen);
        System.out.println(anyColour);
        System.out.println(firstColour);


        System.out.println("\n************ Join Streams using flatMap Operation ************");
        Order order1 = new Order();
        order1.setProducts(Products.getListOneOfProducts());
        Order order2 = new Order();
        order2.setProducts(Products.getListTwoOfProducts());
        Order order3 = new Order();
        order3.setProducts(Products.getListThreeOfProducts());
        List<Order> orders = new ArrayList<>(3);
        orders.add(order1);orders.add(order2);orders.add(order3);
        double sum2 = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .filter(p -> p.getName().equals("Tea"))
                .mapToDouble(p-> p.getPrice().doubleValue())//mapToInt won't keep decimal point part
                .sum();
        System.out.println(sum2);
        //4.Use the same stream pipeline above to show the result of other operations:count, min, max, average

        System.out.println("\n************ reduce Operation ************");
        List<String> colors2 = List.of("RED","GREEN","BLUE");
        Optional<String> x1 = colors2.stream()
                .reduce((s1,s2)->s1+" ** "+s2);
        if(x1.isPresent()){
            System.out.println(x1);
            System.out.println(x1.get());
        }
        System.out.println();
        String x2 = colors2.stream()
                .reduce("White", (s1,s2)->s1+" ** "+s2);
        System.out.println(x2);
        System.out.println();
        String x3 = colors2.stream()
                .parallel()
                .reduce("White",(s,p)->p+" ** "+s, (s1,s2)->s1+s2);
        System.out.println(x3);
        //Invoking x1.get() without check may throws NoSuchElementException if List is empty

        System.out.println("\n************ Using Basic Collectors ************");
        DoubleSummaryStatistics stats = menu.stream()
                        .collect(Collectors.summarizingDouble(p->p.getPrice().doubleValue()));
        System.out.println(stats);
        System.out.println(stats.getMax());
        String s1 = menu.stream()
                        .collect(Collectors.mapping(p->p.getName(),Collectors.joining(",")));
        System.out.println(s1);
        List<Product> drinks = menu.stream()
                .filter(p->p instanceof Drink).collect(Collectors.toList());
        System.out.println();
        drinks.forEach(d -> System.out.println(d.getName()));
        System.out.println();

        System.out.println("\n************ Grouping/Partitioning of the Stream Content ************");
        Map<Boolean, List<Product>> productTypes = menu.stream()
                        .collect(Collectors.partitioningBy(p->p instanceof Drink));
        productTypes.entrySet().forEach(entry -> {
            System.out.println("partition key : "+entry.getKey());
            entry.getValue().stream().forEach(p -> System.out.println(p.getName()));
        });
        System.out.println();
        Map<Integer, List<Product>> productGroups = menu.stream()
                        .collect(Collectors.groupingBy(p->p.getId()));
        productGroups.entrySet().forEach(entry -> {
            System.out.println("group key : "+entry.getKey());
            entry.getValue().stream().forEach(p -> System.out.println(p.getName()));
        });

        System.out.println("\n************ Parallel/Sequential Stream Processing ************");
        System.out.println("show list element");
        colors2.stream().forEach(color -> System.out.println(color));
        System.out.println("\nSequential Stream");
        colors2.stream().forEach(color -> System.out.println(color));
        System.out.println("\nParalel Stream method 1");
        colors2.parallelStream().forEach(color -> System.out.println(color));
        System.out.println("\nParalel Stream method 2");
        colors2.stream().parallel().forEach(color -> System.out.println(color));


    }
}
