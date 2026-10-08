import java.util.Scanner;
public class Day038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MENU WARTEG CYBER 2077 ===");
        System.out.println("1. Nasi Hologram     (Rp 15000)");
        System.out.println("2. Ayam Goreng Laser (Rp 20000)");
        System.out.println("3. Es Teh Matrix     (Rp 5000)");
        System.out.println("==============================");

        System.out.print("Masukkan nomor pesanan: ");
        int pesanan = sc.nextInt();
        if (pesanan > 0 && pesanan < 4) {

            System.out.print("Masukkan jumlah porsi: ");
            int porsi = sc.nextInt();
            System.out.print("Apakah punya member? (true/false): ");
            boolean member = sc.nextBoolean();

            int totalAwal = 0;
            System.out.println();
            if (pesanan == 1) {
                totalAwal = 15000;
                System.out.println("Menu             : Nasi Hologram");
            } else if (pesanan == 2) {
                totalAwal = 20000;
                System.out.println("Menu             : Ayam Goreng Laser");
            } else {
                totalAwal = 5000;
                System.out.println("Menu             : Es Teh Matrix");
            }
          
            System.out.println("Jumlah           : " + porsi + " porsi");
            totalAwal *= porsi;
            System.out.println("Total Harga Awal : Rp " + totalAwal);
            System.out.println();

            if (totalAwal > 50000) {
                double diskon = totalAwal * 0.10;
                totalAwal -= (int) diskon;
                System.out.println("Selamat! Anda dapat Diskon Belanja Besar 10% (Potongan Rp " + (int) diskon + ")");
            }

            if (member) {
                totalAwal -= 5000;
                System.out.println("Diskon Member diterapkan (Potongan Rp 5000)");
            }
          
            System.out.println("-------------------------------------------");
            System.out.println("Total yang harus dibayar : Rp " + totalAwal);
        } else {
            System.out.println("\nWaduhhh pesanan yang kamu masukkan tidak ada di menu!!!");
        }
    }
}
