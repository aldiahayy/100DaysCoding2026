import java.util.Scanner;
public class Soal03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka1 = sc.nextInt();
        int angka2 = sc.nextInt();

        angka1 = angka1 + angka2;
        angka2 = angka1 - angka2;
        angka1 = angka1 - angka2;

        System.out.println(angka1);
        System.out.println(angka2);
    }
}
