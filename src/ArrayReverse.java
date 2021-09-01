import java.util.Scanner;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Reverse array - brute force method - loops - 0(n)
//public class ArrayReverse{
//    public static void main(String[] args) {
//        String str , reverseStr = "";
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter String: ");
//        str = in.nextLine();
//
//        for(int i=str.length()-1; i >=0; i--){
//            reverseStr += str.charAt(i);
//        }
//        System.out.println("Reversed string: " + reverseStr);
//    }
//}

// Reverse array using String Builder
//public class ArrayReverse{
//    public static void main(String[] args) {
//        System.out.println(ArrayReverse.reverse("Hi There"));
//
//    }
//
//    public static String reverse(String str){
//        return new StringBuilder(str).reverse().toString();
//    }
//}

// Reverse array using Stream
public class ArrayReverse{
    public static void main(String[] args) {
        System.out.println(ArrayReverse.reverse("Hi There Hello"));

    }

    public static String reverse(String str){
        return Stream.of(str)
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }
}


