
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {

        String[] names = {" ", " ", " ", " "};
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej číslo:");
        int a = sc.nextInt();

        if (a == 1) {
            names[0] = "X";


        } if (a == 2) {
                names[3] = "X";

            }
        System.out.println(names[0] + "|" + names[1] + "|" + "\n-----" + "\n" + names[2] + "|" + names[3] + "|");




    }
}





