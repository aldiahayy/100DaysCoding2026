import java.util.Scanner;
public class Day017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan poin awal pelanggan: ");
        int poinAwal = sc.nextInt();
        System.out.print("Masukkan poin transaksi baru: ");
        int poinBaru = sc.nextInt();
        System.out.print("Masukkan poin yang ditukarkan: ");
        int poinTukar = sc.nextInt();

        System.out.println("\n--- RIWAYAT PENUKARAN POIN ---");
        System.out.println("Poin Awal\t\t\t : " + poinAwal);
        System.out.println("Setelah Tambah Transaksi (+" + poinBaru + ")\t : " + (poinAwal += poinBaru));
        System.out.println("Setelah Tambah Transaksi (+" + poinTukar + ")\t : " + (poinAwal -= poinTukar));
        System.out.println("Setalah Promo Double Point (*=2) : " + (poinAwal *= 2));
        System.out.println("Point Akhir Pelanggan\t\t : " + poinAwal);
    }
}
