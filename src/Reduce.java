public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int step_count = 0;
        while (i > 0) {
            boolean det = i % 2 == 0;
            if(det) {
                 i = i / 2;
            }
            else {
                i -= 1;
            }
            step_count++;
        }
        System.out.println(step_count);
    }
}
