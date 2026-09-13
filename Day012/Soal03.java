import java.util.Scanner;
public class Soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nilai Ujian : ");
        double nilai = input.nextDouble();

        System.out.println("Data diterima: " + nama + " Mendapat Nilai " + nilai );
        System.out.println("AWAS! SISTEM DIRETAS!");
        nilai = 0.0;
        System.out.println("Nilai Akhir " + nama + " sekarang diubah menjadi: " + nilai);
    }
}
