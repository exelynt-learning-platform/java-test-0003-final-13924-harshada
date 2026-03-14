public class Pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int num;

            if (i % 2 == 0) {
                num = 0;
            } else {
                num = 1;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = (num == 1) ? 0 : 1; // toggle between 1 and 0
            }

            System.out.println();
        }
    }
}