import java.util.Scanner;
public class Day033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai ujian: ");
        int nilai = sc.nextInt();
        System.out.print("Apakah sudah terdaftar?: ");
        boolean terdaftar = sc.nextBoolean();

        if (nilai >= 75 && terdaftar) {
            System.out.println("Status : Boleh Mengikuti Ujian");
        }else{
            System.out.println("Status : Belum Boleh Mengikuti Ujian");
        }
    }
}
