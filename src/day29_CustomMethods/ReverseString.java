package day29_CustomMethods;

public class ReverseString {
    public static void main(String[] args) {

        // 7. create a method that can reverse any String

        reverse("Marat");
        reverse("Cybertek");
    }

    public static void reverse (String str){
        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }

        System.out.println(result);


    }
}
