package Day24_Arrays;

import java.util.Scanner;

public class Uniques2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
    String str = scan.nextLine();
       // String str = "aabccdeeeeeefffffjhhhhi";

        String expectedResult = ""; //"b"

        for (int j = 0; j <= str.length() - 1; j++) { //because we need the frequency of every single character

            char ch1 = str.charAt(j); //a
            int count1 = 0; //1+1 frequency of ch

            for (int i = 0; i <= str.length() - 1; i++) { // used for finding the frequency of ch and assign it
                char each = str.charAt(i);  //executes 5 times, a a b c c
                if (ch1 == each) {
                    count1 += 1;
                }
            }

            if (count1 == 1) { //if it only occured one time
                expectedResult += ch1;
            }
        }

            System.out.print(expectedResult);


        }
    }

