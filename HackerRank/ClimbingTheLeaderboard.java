
import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ClimbingTheLeaderboard {

    public static int binarySearch(ArrayList arr, int first, int last, long key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if ((long) arr.get(mid) > key) {
                first = mid + 1;
            } else if ((long) arr.get(mid) == key) {
                return mid;

            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            return -1;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        HashSet hs = new HashSet();
        ArrayList temp = new ArrayList();

        for (int i = 0; i < n; i++) {

            long x = in.nextLong();
            temp.add(x);
            hs.add(x);

        }
        Collections.sort(temp, Collections.reverseOrder());
        int m = in.nextInt();

        long y[] = new long[m];

        for (int i = 0; i < m; i++) {

            y[i] = in.nextLong();

            hs.add(y[i]);
        }

        ArrayList list = new ArrayList();

        list.addAll(hs);

        Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);
        int count = 0;
        ArrayList res = new ArrayList();
        HashSet gu = new HashSet();

        for (int i = m - 1; i >= 0; i--) {

            if (gu.add(y[i])) {

                res.add((binarySearch(list, 0, list.size() - 1, y[i]) + 1) - count);

                if (binarySearch(temp, 0, temp.size() - 1, y[i]) == -1) {
                    count++;
                }
            } else {
                int kabadi = binarySearch(temp, 0, temp.size() - 1, y[i]);
                if (kabadi == -1) {
                    count--;
                }
                res.add((binarySearch(list, 0, list.size() - 1, y[i]) + 1) - count);
                if (kabadi == -1) {
                    count++;
                }
            }
        }
        for (int i = res.size() - 1; i >= 0; i--) {
            System.out.println(res.get(i));
        }
    }
}
