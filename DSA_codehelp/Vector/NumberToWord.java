import java.util.*;

public class NumberToWord {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str[] = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        String plus = "";

        System.out.println("Enter the Sentence : ");
        String string = sc.nextLine();

        // System.out.println(pos);
        int pos = string.indexOf(48);
        char ch = string.charAt(pos);
        for (int i = 1; i <= 9; i++) {
            if (pos == i) {
                System.out.println("You got " + str[i - 1] + " Mangoes");
                break;
            } else if (pos > 9) {
                System.out.println("!!! Number Range is from 1 to 9");
                break;
            }
        }
    }
}
