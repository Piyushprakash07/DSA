public class recur {
    static void printnum(int n) {
        if (n > 10) {
            return;
        }
        System.out.println(n);
        printnum(n + 1);
    }

    public static void main(String args[]) {
        printnum(1);
    }
}
