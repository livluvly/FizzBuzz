public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int count = 0;
        while (i != 0) {
            boolean isEven = i % 2 == 0;
            boolean isOdd = i % 2 == 1;

            if (isEven) {
                i = i / 2;
                count += 1;
            }

            if (isOdd) {
                i = i - 1;
                count += 1;
            }
        }
        System.out.println(count);
    }
}
