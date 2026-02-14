import java.util.*;

class Laptop {
    int price;
    int quality;
    
    Laptop(int price, int quality) {
        this.price = price;
        this.quality = quality;
    }
}

public class Laptops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Laptop> laptops = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            int quality = sc.nextInt();
            laptops.add(new Laptop(price, quality));
        }
        
        // Sort laptops by price in ascending order
        Collections.sort(laptops, (a, b) -> a.price - b.price);
        
        // Check if qualities are in ascending order
        boolean happyAlex = false;
        
        for (int i = 0; i < n - 1; i++) {
            if (laptops.get(i).quality > laptops.get(i + 1).quality) {
                
                happyAlex = true;
                break;
            }
        }
        
        if (happyAlex) {
            System.out.println("Happy Alex");
        } else {
            System.out.println("Poor Alex");
        }
        
        sc.close();
    }
}