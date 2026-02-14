import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
 
        long allSingle = (long) n * a;
        

        long allBulk = ((long) Math.ceil((double) n / m)) * b;
        
       
        long mixedStrategy = ((long) (n / m)) * b + ((long) (n % m)) * a;
        
        // Find min
        long minCost = Math.min(Math.min(allSingle, allBulk), mixedStrategy);
        
        System.out.println(minCost);
        sc.close();
    }
}