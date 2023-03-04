package practice_1;

/**
 * @author Wijdane KHATTAT
 */
//javac -d ..\..\out\ .\Calcul.java
//javac -cp ..\..\out\  -d ..\..\out\ .\CalculShow.java
//java practice_1.CalculShow  (se positionner dans out)
public class CalculShow {
    public static void main(String[] args) {
        System.out.println("Calcul show");
        Calcul calcul = new Calcul();
        int sum = calcul.getSum();
        System.out.println(sum);
    }
}
