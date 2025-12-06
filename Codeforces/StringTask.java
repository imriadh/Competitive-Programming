import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
       
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('O'); 
        vowels.add('Y');
        vowels.add('E');
        vowels.add('U');
        vowels.add('I');
        vowels.add('a');
        vowels.add('o');
        vowels.add('y');
        vowels.add('e');
        vowels.add('u');
        vowels.add('i');
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (!vowels.contains(ch)) {
               
                result.append(".").append(Character.toLowerCase(ch));
            }
        }
        
        System.out.println(result.toString());
        sc.close();
    }
}