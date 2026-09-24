import java.util.Scanner;
public class Day023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi: ");
        int sisi = sc.nextInt();

        System.out.println("Luas Persegi\t : " + (sisi * sisi));
        System.out.println("Keliling Persegi : " + (4 * sisi));
    }
}
