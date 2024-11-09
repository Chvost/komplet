import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Karel", "Pepa"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej číslo:");
        int a = sc.nextInt();

        if (a == 1) {
            names[1] = "X|";
        }

        System.out.println(names[1]);
    }
}