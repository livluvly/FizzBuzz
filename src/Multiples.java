public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (i < 1000) {
            boolean multiple3 = i % 3 == 0;
            boolean multiple5 = i % 5 == 0;

            if (multiple3) {
                count += 1;
            }

            if (multiple5) {
                count += 1;
            }
            i++;
        }
        System.out.println(count);
    }
}
