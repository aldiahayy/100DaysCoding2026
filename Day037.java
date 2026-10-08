import java.util.Scanner;
public class Day37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kode Energi: ");
        int kode = input.nextInt();

        if (kode > 0) {
            System.out.println("Kode Diterima (Energi Positif).");

            if (kode % 2 == 0) {
                System.out.println("Berhasil! Pintu Brankas Utama Terbuka, dokumen rahasia diamankan!");
            } else {
                System.out.println("JEBAKAN! Pintu terbuka tapi menyemprotkan Gas Beracun!");
            }
        } else if (kode < 0) {
            System.out.println("HACKER TERDETEKSI (Energi Negatif).");
          
            if (kode % 2 == 0) {
                System.out.println("Peringatan! Alarm Level 1 Berbunyi!");
            } else {
                System.out.println("Peringatan Kritis! Pintu ruangan terkunci, Robot Penjaga dikerahkan!");
            }
        } else {
            System.out.println("Sistem brankas dimatikan. Harap mulai ulang.");
        }
    }
}
