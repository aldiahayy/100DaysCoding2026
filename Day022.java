import java.util.Scanner;
public class Day022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        int a = sc.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = sc.nextInt();
        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("Dengan variabel tambahan:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        c = a;
        a = b;
        b = c;
        
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Tanpa variabel tambahan:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
