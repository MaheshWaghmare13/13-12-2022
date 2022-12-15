public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1, n3, num = 20;
        int sum = 0;
        System.out.println(+n1);
        System.out.println(+n2);

        for (int i = 3; i <= num; i++) {
            n3 = n1 + n2;
            sum = sum + n3;
            System.out.println(+n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println("sum=" + sum);

        double avg = (float) sum / 20;
        System.out.println("Average=" + avg);

    }
}
