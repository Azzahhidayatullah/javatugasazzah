import java.util.Scanner;
import java.util.Random;

public class azzah5 {
    public static void main(String[] args) {
        int[] validPins = {2000, 4000, 6000, 7000, 8000, 9000, };
        Random random = new Random();
        int secretPin = validPins[random.nextInt(validPins.length)];
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;
        
        System.out.println("Tebak PIN 4 digit");
        System.out.println("Mulai tebak!");
        
        while (true) {
            System.out.print("Masukkan tebakan Anda: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < 2000 || guess > 9000) {
                System.out.println("Tebakan harus 4 digit (2000-9000)");
            } else if (guess == secretPin) {
                System.out.println("Selamat! Anda berhasil menebak PIN " + secretPin + " dalam " + attempts + " percobaan.");
                break;
            } else {
                System.out.println("Tebakan Anda salah. Coba lagi.");
            }
        }
        
        scanner.close();
    }
}






