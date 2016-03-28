package Task2;

import java.util.Arrays;

/**
 * Created by O.Gondar on 28.03.2016.
 */
public class CompareUtils {

    public static <T extends Comparable> Unit<T> minMax(T[] a, boolean isSearchForMin) {

        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 0; i < a.length; i++) {

            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];

        }
        return isSearchForMin ? new Unit<T>(min) : new Unit<T>(max);

    }

    public static <T extends Comparable> Unit<T> medium(T[] a) {

        T median;
        if (a == null || a.length == 0) return null;
        Arrays.sort(a);
        median = a[a.length / 2];
        return new Unit<T>(median);

    }

}
