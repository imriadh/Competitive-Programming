

import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            
            
            if (word.length() > 10) {
               
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                int middleCount = word.length() - 2; 
                String abbreviation = firstChar + String.valueOf(middleCount) + lastChar;

                System.out.println(abbreviation);
            } else {
                
                System.out.println(word);
            }
        }
        
        sc.close();
    }
}