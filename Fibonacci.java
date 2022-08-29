public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("printing fibonacci series");
        printFibonacci(5);
    }
    static void printFibonacci(int howMany) {
        int n1 = 0, n2 = 1, n3, i;
        System.out.print(n1 + " " + n2);
        for (i = 2; i < howMany; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
