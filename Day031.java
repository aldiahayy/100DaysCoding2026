import java.util.Scanner;
public class Day031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();
        System.out.print("Masukkkan nilai tugas: ");
        int nilai = sc.nextInt();
        System.out.print("Apakah sudah terdaftar?: ");
        boolean status = sc.nextBoolean();

        boolean cekUmur = umur >= 17;
        boolean cekNilai = nilai >= 75;

        System.out.println("\nMemenuhi semua syarat : " + (cekUmur && cekNilai && status));
        System.out.println("Memenuhi salah satu syarat : " + (cekUmur || cekNilai || status));
        System.out.println("Belum terdaftar : " + (!status));
    }
}
