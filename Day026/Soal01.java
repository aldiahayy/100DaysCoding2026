import java.util.Scanner;
public class Soal01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama\t\t: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM\t\t: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Kelas\t\t: ");
        char kelas = sc.next().charAt(0);
        System.out.print("Masukkan Umur\t\t: ");
        int umur = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Prodi\t\t: ");
        String prodi = sc.nextLine();
        System.out.print("Masukkan IPK\t\t: ");
        double ipk = sc.nextDouble();
        System.out.print("Status Keaktifan\t: ");
        boolean status = sc.nextBoolean();

        System.out.println("===== BIODATA SEDERHANA =====");
        System.out.printf("%-18s : %s%n", "Nama", nama);
        System.out.printf("%-18s : %s%n", "Nim", nim);
        System.out.printf("%-18s : %c%n", "Kelas", kelas);
        System.out.printf("%-18s : %d%n", "Umur", umur);
        System.out.printf("%-18s : %s%n", "Prodi", prodi);
        System.out.printf("%-18s : %.2f%n", "IPK", ipk);
        System.out.printf("%-18s : %b%n ", "Status Aktif", status);
        System.out.println("=============================");
    }
}
