public class swapUsingExOr {
    public static void main(String[] args) {
        int a = 10, b = 20;
        a = a ^ b;
        System.out.println(a);
        b = a ^ b;
        System.out.println(b);
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }

}
