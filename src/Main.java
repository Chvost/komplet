
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {

        String[] names = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej číslo:");
        int a = sc.nextInt();

        if (a == 1) {
            names[0] = "X";
        } if (a == 2) {
            names[1] = "X";
        } if (a == 3){
            names[2] = "X";
        } if (a == 4) {
            names[3] = "X";
        } if (a == 5){
            names[4] = "X";
        } if (a == 6) {
            names[5] = "X";
        } if (a == 7){
            names[6] = "X";
        } if (a == 8) {
            names[7] = "X";
        } if (a == 9){
            names[8] = "X";
        }
        System.out.println(names[0] + "|" + names[1] + "|" + names[2] + "\n-----" + "\n" + names[3] + "|" + names[4] + "|" + names[5] +  "\n-----" + "\n" + names[6] + "|" + names[7] + "|" + names[8]);




    }
}





