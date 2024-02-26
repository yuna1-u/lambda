import java.util.Scanner;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {

        System.out.println(sqrt.apply(new Scanner(System.in).nextDouble()));

    }

    public static UnaryOperator<Double> sqrt = (num) -> Math.sqrt(num);
}