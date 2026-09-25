import java.util.Scanner;
public class Day024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        int panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = sc.nextInt();

        System.out.println("Luas Persegi Panjang\t : " + (panjang * lebar));
        System.out.println("Keliling Persegi Panjang : " + (2 * (panjang + lebar)));
    }
}
