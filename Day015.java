import java.util.Scanner;
public class Day015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan harga barang: ");
        int hargaBarang = sc.nextInt();
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = sc.nextInt();
        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang = sc.nextInt();

        int totalHarga = hargaBarang*jumlahBarang;
        int hargaPerOrang = totalHarga/jumlahOrang;

        System.out.println("\nTotal harga\t: " + totalHarga);
        System.out.println("Harga per orang : " + hargaPerOrang);
    }
}
