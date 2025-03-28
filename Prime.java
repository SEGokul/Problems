import java.util.Scanner;

class Prime {

    
    public static boolean isPrime(int num) {
        if (num == 2) {
            return true; 
        } else if (num < 2 || num % 2 == 0) {
            return false; 
        }

 
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

   
    public static void PrimeRange(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");  
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
       
        PrimeRange(num);
    }
}
