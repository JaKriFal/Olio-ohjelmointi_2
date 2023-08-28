import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Anna ensimmäisen sivun pituus");
        double A = Double.parseDouble(reader.nextLine());
        System.out.println("Anna toisen sivun pituus");
        double B = Double.parseDouble(reader.nextLine());
        double C = Math.sqrt(Math.pow(A,2) + Math.pow(B,2));
        System.out.printf("Hypotenuusa: %6.2f", C);



    }
}
