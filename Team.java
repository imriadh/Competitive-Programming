
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int problemsToSolve = 0;
        
        for (int i = 0; i < n; i++) {
            int petya = sc.nextInt();
            int vasya = sc.nextInt();
            int tonya = sc.nextInt();
            
            
            int sureFriends = petya + vasya + tonya;
            
            
            if (sureFriends >= 2) {
                problemsToSolve++;
            }
        }
        
        System.out.println(problemsToSolve);
        sc.close();
    }
}