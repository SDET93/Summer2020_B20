package Office_Hours.Practice_07_08_2020;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = -999999999;

       /* for (int i = 1; i <= 5; i++) {

            System.out.println("Enter a number");
            int n = scan.nextInt(); // 5 5 4 4 3

            if (n > max) {
            max = n;
            }
        }

        */
        int j = 1;
        while (j <= 5) {
            System.out.println("Enter a number");
            int n = scan.nextInt(); // 5 5 4 4 3

            if (n > max) {
                max = n;

            }
            j++;
        }

            System.out.println("max: " + max);


    }
}