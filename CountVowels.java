import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countVowel = 0;

       
        System.out.print("Enter String: ");
        String str = scan.nextLine();

        
        str = str.toUpperCase();

       
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                countVowel++;
            }
        }

        System.out.println("Number of vowels: " + countVowel);
        scan.close();
    }


    private static boolean isVowel(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

}
