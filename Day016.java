import java.util.Scanner;
public class Day016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah permen: ");
        int jumlahPermen = sc.nextInt();
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();

        System.out.println("Jumlah Permen : " + jumlahPermen);
        System.out.println("Jumlah Siswa : " + jumlahSiswa);
        System.out.println("Setiap Siswa Mendapatkan : " + (jumlahPermen / jumlahSiswa) + " permen");
        System.out.println("Sisa Permen : " + (jumlahPermen % jumlahSiswa) + " permen");
    }
}
