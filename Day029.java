import java.util.Scanner;
public class Day029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai pertama: ");
        int nilai1 = sc.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        int nilai2 = sc.nextInt();

        System.out.println("Nilai pertama lebih kecil dari nilai kedua : " + (nilai1 < nilai2));
        System.out.println("Nilai pertama lebih besar dari nilai kedua : " + (nilai1 > nilai2));
    }
}
