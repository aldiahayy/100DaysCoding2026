import java.util.Scanner;
public class Soal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username\t:");
        String username = input.nextLine();
        System.out.print("Masukkan umur\t\t:");
        int umur = input.nextInt();
        System.out.print("Masukkan tinggi Badan\t:");
        double tinggiBadan = input.nextDouble();
        System.out.print("Masukkan Gol. Darah\t:");
        char darah = input.next().charAt(0);
        System.out.print("Apakah Akun Privat?\t:");
        boolean status = input.nextBoolean();
        
        System.out.println("\n=== PROFILE FACEGRAM ===");
        System.out.println("Username\t: " + username);
        System.out.println("Umur\t\t: " + umur);
        System.out.println("Tinggi Badan\t: " + tinggiBadan);
        System.out.println("Gol. Darah\t: " + darah);
        System.out.println("Akun Privat\t: " + status);
        System.out.println("========================");
    }
}
