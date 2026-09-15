import java.util.Scanner;
public class Day014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tabungan awal: ");
        int tabunganAwal = sc.nextInt();
        System.out.print("Masukkan uang masuk: ");
        int uangMasuk = sc.nextInt();
        System.out.print("Masukkan uang diambil: ");
        int uangAmbil = sc.nextInt();

        System.out.println("==============================");
        System.out.println("        DATA TABUNGAN");
        System.out.println("==============================");
        System.out.println("Tabungan Awal\t: " + tabunganAwal);
        System.out.println("Uang Masuk\t: " + uangMasuk);
        System.out.println("Uang Diambil\t: " + uangAmbil);
        System.out.println("\nJumlah Tabungan  : " + (tabunganAwal + uangMasuk - uangAmbil));
        System.out.println("==============================");
    }
}
