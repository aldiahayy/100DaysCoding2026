import java.util.Scanner;
public class Soal02 {
    public static void main(String[] args) {
        final String NAMA_KANTIN = "KANTIN KEJUJURAN TI";
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Makanan: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Harga Satuan: ");
        int harga = sc.nextInt();
        System.out.print("Masukkan Jumlah Beli : ");
        int jml = sc.nextInt();

        int totalHarga = harga * jml;

        System.out.println("\n---" + NAMA_KANTIN +"---");
        System.out.println("Anda Memesan " + jml + " porsi " + nama + ".");
        System.out.println("Total yang harus dibayar: Rp " + totalHarga);
        System.out.println("-------------------------");
    }
}
