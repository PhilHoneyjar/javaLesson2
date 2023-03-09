import java.util.Scanner;

public class hometask3 {
    public static void main(String[] args) {
        String myText = getUserText();
        System.out.println(checkPalindrome(myText, getReversedString(myText)));
    }
    public static String getUserText() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to check if it's a palindrome: ");
        String inputText = sc.nextLine();
        sc.close();
        return inputText;
    }
    public static String getReversedString(String givenString) {
        String reversedString = "";
        for (int i = givenString.length() - 1; i >= 0; i--) {
            reversedString += givenString.charAt(i);
        }
        return reversedString;
    }
    public static boolean checkPalindrome(String givenString, String reversedString) {
        return givenString.toLowerCase().equals(reversedString.toLowerCase());
    }
}
