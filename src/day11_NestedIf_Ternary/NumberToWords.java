package day11_NestedIf_Ternary;
/*
Warmup task:
    1. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
 */
public class NumberToWords {
    public static void main(String[] args) {
        int number = 0;
        String result = "";

        if (number == 0) {
            result = "zero";
        } else if (number == 1) {
            result = "one";
        } else if (number == 2) {
            result = "two";
        } else if (number == 3) {
            result = "three";
        } else if (number == 4) {
            result = "four";
        } else if (number == 5) {
            result = "five";
        } else if (number == 6) {
            result = "six";
        } else if (number == 7) {
            result = "seven";
        } else if (number == 8) {
            result = "eight";
        } else if (number == 9) {
            result = "nine";
        } else{
            result = "Invalid";}
            System.out.println(result);

    }
}
