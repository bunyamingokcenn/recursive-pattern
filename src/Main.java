import java.util.Scanner;

public class Main {

    public static void pattern(int number, int tempNumber, boolean decreasing) {
        // Değeri yazdır
        System.out.print(tempNumber + " ");

        if (tempNumber <= 0) {
            decreasing = false; // Değer sıfır veya negatife düştüğünde artmaya başla
        }

        if (decreasing) {
            pattern(number, tempNumber - 5, decreasing);
        } else {
            if (tempNumber < number) {
                pattern(number, tempNumber + 5, decreasing);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Desen başlangıç sayısı giriniz: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        } else {
            pattern(number, number, true);
        }
    }
}
