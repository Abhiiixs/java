public class array {
    public static void main(String args[]) {

        int sum = 0;

        int num[] = new int[5];

        num[0] = 5;
        num[1] = 1;
        num[2] = 3;
        num[3] = 2;
        num[4] = 6;

        for (int i = 0; i <= 4; i++) {

            sum += num[i];

        }

        double avg = sum / 5;

        System.out.println(" avg is  = " + avg);

    }
}
 
