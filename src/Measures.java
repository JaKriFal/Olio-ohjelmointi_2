import java.util.Scanner;
public class Measures {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Weight(g): ");
        double g = Double.parseDouble(reader.nextLine());

        double leiviska = ((g/13.28)/32)/20;

        int leiviskaf = (int)leiviska;

        double naula = (leiviska - leiviskaf)*20;

        int naulaf = (int)naula;

        double luoti = (naula - naulaf) * 32;

        int gprint = (int)g;

        System.out.printf("%d grams is %d leiviskä, %d naula and %6.2f luoti.", gprint, leiviskaf, naulaf, luoti);









    }
}
