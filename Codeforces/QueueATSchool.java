import java.util.Scanner;

public class QueueATSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String queue = sc.next();
        
       
        for (int second = 0; second < t; second++) {
            char[] chars = queue.toCharArray();
            int i = 0;
            
            while (i < n - 1) {
                if (chars[i] == 'B' && chars[i + 1] == 'G') {
                    // Swap B and G
                    chars[i] = 'G';
                    chars[i + 1] = 'B';
                    i += 2; 
                } else {
                    i++; 
                }
            }
            
            queue = new String(chars);
        }
        
        System.out.println(queue);
        sc.close();
    }
}