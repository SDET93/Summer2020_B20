package day28_recap;

/*
2. write a program that can count the frequency of a word from an array of string
            Ex:
                arr: {"Java", "C#", "Python", "Java"};
                word: "java"
                output:
                        2
            MUST USE for each loop
 */

public class FrequencyOfWord_Array {
    public static void main(String[] args) {

        String[] arr = {"Java", "C#", "Python", "Java"};
        String word = "java";

        int count = 0;

        for(String each : arr){
            if(!word.equalsIgnoreCase(each)){
                continue;
            }
            count++;
            /* Another approach:
             if(word.equalsIgnoreCase(each)){
               count++:
            }
            */

        }
        System.out.println(count);
    }
}
