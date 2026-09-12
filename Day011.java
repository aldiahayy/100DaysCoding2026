import java.util.Scanner;
public class Day011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Umur: ");
        byte umur = sc.nextByte();
        System.out.print("Masukkan Tinggi Badan: ");
        double tinggiBadan = sc.nextDouble();
        System.out.print("Masukkan Grade: ");
        char grade = sc.next().charAt(0);

        System.out.println("\n===============================================");
        System.out.println("              BIODATA MAHASISWA");
        System.out.println("===============================================");
        System.out.printf("%-15s : %s%n", "Nama",nama);
        System.out.printf("%-15s : %s%n", "NIM", nim);
        System.out.printf("%-15s : %d Tahun%n", "Umur", umur);
        System.out.printf("%-15s : %.2f cm%n","Tinggi Badan", tinggiBadan);
        System.out.printf("%-15s : %c", "Grade", grade);
        System.out.println("===============================================");
    }
}
