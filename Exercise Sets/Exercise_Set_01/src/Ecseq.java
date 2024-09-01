
public class Ecseq {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int multiple = 7 * i;

            if (i % 2 == 0) {
                System.out.println("\t" + multiple);
            } else {
                System.out.println(multiple);
            }
        }
        
    }
}
