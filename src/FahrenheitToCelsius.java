import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Anna Fahrenheitit:");
        double F = Double.parseDouble(reader.nextLine());
        double C = (F - 32.0)/1.80;
        System.out.printf("Celsiusasteet: %6.2f\n", C);

    }
}
