import java.util.*;
public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c1=0,c2=0,c3=0,c4=0;
        for (int i=0;i<n;i++) {
            int s = sc.nextInt();
            if (s==1) c1++;
            else if (s==2) c2++;
            else if (s==3) c3++;
            else if (s==4) c4++;
        }

        int taxis = c4;

        // Pair 3s with 1s
        taxis += c3;
        c1 = Math.max(0, c1 - c3);

        // Pair 2s
        taxis += c2 / 2;
        c2 = c2 % 2;

        // One 2 left
        if (c2 == 1) {
            taxis += 1;
            c1 = Math.max(0, c1 - 2);
        }

        // Remaining ones
        taxis += (c1 + 3) / 4;

        System.out.println(taxis);
        sc.close();
    }
}
