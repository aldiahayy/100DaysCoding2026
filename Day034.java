import java.util.Scanner;
public class Day034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai ujian: ");
        int nilai = sc.nextInt();
        System.out.print("Apakah sudah terdaftar?: ");
        boolean terdaftar = sc.nextBoolean();

        String kategori = "";
        String status = "";
      
        if (nilai >= 80 && nilai <= 100) {
            kategori = "Sangat Baik";
        } else if (nilai >= 70) {
            kategori = "Baik";
        } else if (nilai >= 60) {
            kategori = "Cukup";
        } else {
            kategori = "Kurang";
        }

        if (nilai >= 60 && terdaftar) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }

        System.out.println("\nKategori Nilai : " + kategori);
        System.out.println("Status         : " + status);
    }
}
