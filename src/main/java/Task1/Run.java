package Task1;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Oleg on 27.03.2016.
 */
public class Run {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        TestExecution.performActorTest("Task1.MyClassesForTesting.Actor");

    }
}
