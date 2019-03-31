import java.util.Scanner;
import java.util.Random;

public class DnD {
    public static void main(String[] args) {

        Scanner getItGirl = new Scanner(System.in);
        Scanner numOfRolls = new Scanner(System.in);
        Random dFour = new Random();
        Random dSix = new Random();
        Random dEight = new Random();
        Random dTen = new Random();
        Random dTwelve = new Random();
        Random dTwenty = new Random();

        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;

        System.out.println("Please choose your dice... ");
        String user = getItGirl.nextLine();
        System.out.println("How many times would you like to roll?");
        int userIn = numOfRolls.nextInt();

        if (user.equals("D4")) {
            System.out.println("Your D4 results are: ");
            for (int a = 1; a <= userIn; a++) {
                n1 = 1 + dFour.nextInt(4);
                System.out.println(n1);
            }
        }

        else if (user.equals("D6")) {
            System.out.println("Your D6 results are: ");
            for (int b = 1; b <= userIn; b++) {
                n2 = 1 + dSix.nextInt(6);
                System.out.println(n2);
            }
        }

        else if (user.equals("D8")) {
            System.out.println("Your D8 results are: ");
            for (int c = 1; c <= userIn; c++) {
                n3 = 1 + dEight.nextInt(8);
                System.out.println(n3);
            }
        }

        else if (user.equals("D10")) {
            System.out.println("Your D10 results are: ");
            for (int d = 1; d <= userIn; d++) {
                n4 = 1 + dTen.nextInt(10);
                System.out.println(n4);
            }
        }

        else if (user.equals("D12")) {
            System.out.println("Your D12 results are: ");
            for (int e = 1; e <= userIn; e++) {
                n5 = 1 + dTwelve.nextInt(12);
                System.out.println(n5);
            }
        }

        else if (user.equals("D20")) {
            System.out.println("Your D20 results are: ");
            for (int f = 1; f <= userIn; f++) {
                n6 = 1 + dTwenty.nextInt(20);
                System.out.println(n6);
            }
        }

        else{
            System.out.println("That die is not available!!");
        }


    }
}