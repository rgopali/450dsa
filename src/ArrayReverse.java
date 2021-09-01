import java.util.Scanner;

import java.util.Scanner;
//Reverse array - brute force method - loops - 0(n)
public class ArrayReverse{
    public static void main(String[] args) {
        String str , reverseStr = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String: ");
        str = in.nextLine();

        for(int i=str.length()-1; i >=0; i--){
            reverseStr += str.charAt(i);
        }
        System.out.println("Reversed string: " + reverseStr);
    }
}