import java.util.ArrayList;
import java.util.Scanner;

public class AlternetTask {

    static ArrayList a = new ArrayList();

    public static ArrayList dividor(int x) {

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                a.add(i);
            }
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count = 1;

        while (in.hasNext()) {

            int x = in.nextInt();
            if (x == 0) {
                break;
            }
            int sum = 0;
            int res = 0;
            boolean svr = false;

            for (int i = x; i >= 0; i--) {
                dividor(i);
                if (i == 0) {
                    System.out.printf("Case %d: %d\n", count, -1);
                    count++;
                    break;
                }
                Object ob[] = a.toArray(new Object[a.size()]);
                for (int k = 0; k < ob.length; k++) {
                    sum += (int) ob[k];
                }
                //  System.out.println(sum);
                if (sum == x) {
                    res = i;
                    System.out.printf("Case %d: %d\n", count, i);
                    count++;
                    svr = true;
                    break;
                }
                sum = 0;

                a.clear();
                if (svr == true) {
                    break;
                }
            }

        }
    }

}
