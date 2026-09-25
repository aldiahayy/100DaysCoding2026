import java.util.Scanner;
public class Day025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PHI = 3.14;
        System.out.print("Masukkan jari-jari: ");
        int r = sc.nextInt();
        
        System.out.println("Luas Lingkaran\t   : " + (PHI * r * r));
        System.out.println("Keliling Lingkaran : " + (2 * PHI * r));
    }
}
