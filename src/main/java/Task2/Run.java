package Task2;

/**
 * Created by O.Gondar on 28.03.2016.
 */
public class Run {

    public static void main(String[] args) {

        String[] s = {"aaaa", "bbbb", "cccc"};

        Integer[] i = {1111, 2222, 3333, 4444, 5555, 6666, 7777};

        consoleOutput(s);
        consoleOutput(i);

    }

    public static <T extends Comparable> void consoleOutput(T[] t) {

        System.out.println("Finding values for: " + t.getClass().getSimpleName());
        System.out.println("Max is: " + CompareUtils.minMax(t, false).getValue());
        System.out.println("Min is: " + CompareUtils.minMax(t, true).getValue());
        System.out.println("Median is: " + CompareUtils.medium(t).getValue());
        System.out.println("____________________________________________________");

    }

}
