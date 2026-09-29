public class Day028 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        int c = ++a;
        int d = --c;
        int e = d++;

        System.out.println(a); // output 7
        System.out.println(b); // output 5
        System.out.println(c); // output 6
        System.out.println(d); // output 7
        System.out.println(e); // output 6
    }
}
