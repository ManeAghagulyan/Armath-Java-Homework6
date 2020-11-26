import java.util.Scanner;

public class Homework6_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input First string");
        String first= scan.nextLine();
        System.out.println("Input second string");
        String second= scan.nextLine();
        System.out.println(hasString(first, second));
    }

    public static boolean hasString(String first, String second) {
        //  method prints image1.a
        if (first.length() > second.length()) {
            return false;
        }
        if (first.length() == second.length()) {
            if(first.equals(second)){
                return true;
            }
            else {
                return false;
            }
        }
        if(!first.equals(second.substring(0,first.length()))) {
            return hasString(first, second.substring(1));
        }
        return true;
    }
}
