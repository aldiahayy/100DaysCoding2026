import java.util.Scanner;
public class Day021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variabel final
        final double TAMBAH = 50000;
        final double KURANG = 25000;
        final double KALI = 2;
        final double BAGI = 5;

        // inputan
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan umur: ");
        String umurString = sc.nextLine();
        System.out.print("Masukkan Tinggi Badan: ");
        String tbString = sc.nextLine();
        System.out.print("Masukkan huruf awal nama: ");
        String hurufAwalString = sc.nextLine();
        System.out.print("Masukkan status mahasiswa: ");
        String statusString = sc.nextLine();
        System.out.print("Masukkan saldo awal: ");
        String saldoAwalString = sc.nextLine();
        
        // konversi String ke tipe data primitif
        int umurInt = Integer.parseInt(umurString);
        double tbDouble = Double.parseDouble(tbString);
        char hurufAwal = hurufAwalString.charAt(0);
        boolean status = Boolean.parseBoolean(statusString);
        double saldoAwal = Double.parseDouble(saldoAwalString);

        // mencetak menggunakan printf
        System.out.println("\n===============OUTPUT AWAL===============");
        System.out.printf("%-18s : %s %n", "Nama", nama);
        System.out.printf("%-18s : %d %n", "Umur", umurInt);
        System.out.printf("%-18s : %.2f %n", "Tinggi Badan", tbDouble);
        System.out.printf("%-18s : %c %n", "Huruf Awal Nama", hurufAwal);
        System.out.printf("%-18s : %b %n", "Status mahasiswa", status);
        System.out.printf("%-18s : %.2f %n", "Saldo Awal", saldoAwal);
        System.out.println("===========================================");

        // operator penugasan
        umurInt+=1;

        // menentukan umur ganjil atau genap
        String deteksi = umurInt % 2 == 0 ? "genap" : "ganjil";

        // konversi otomatis dan manual/casting
        double umur = umurInt;
        int tb = (int) tbDouble;

        // konversi umur ke String
        String umurStr = String.valueOf(umur);
        
        // mencetak menggunakan printf
        System.out.println("\n===============OUTPUT KEDUA=============");
        System.out.printf("%-18s : %s %n", "Nama", nama);
        System.out.printf("%-18s : %.2f %n", "Umur", umur);
        System.out.printf("%-18s : %d %n", "Tinggi Badan", tb);
        System.out.printf("%-18s : %c %n", "Huruf Awal Nama", hurufAwal);
        System.out.printf("%-18s : %b %n", "Status mahasiswa", status);
        System.out.printf("%-18s : %s %n", "Deteksi Umur", deteksi);
        System.out.println("==========================================");
        
        // konversi saldo ke String
        System.out.println("\n===============OUTPUT AKHIR===============");
        System.out.printf("%-18s : %s %n", "SaldoAwal", String.valueOf(saldoAwal));
        saldoAwal += TAMBAH;
        System.out.printf("%-18s : %.0f %n", "Setelah ditambah", saldoAwal);
        saldoAwal -= KURANG;
        System.out.printf("%-18s : %.0f %n", "Setelah dikurangi", saldoAwal);
        saldoAwal *= KALI;
        System.out.printf("%-18s : %.0f %n", "Setelah dikali 2", saldoAwal);
        saldoAwal /= BAGI;
        System.out.printf("%-18s : %.0f %n", "Setelah dibagi 5", saldoAwal);
        System.out.println("===========================================");
    }
}
