package solution;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TestNumericalOperations {
    public static void main(String[] args) {
        List<Long> longList = List.of(1L, 45L, 3L, 0L);
        NumericalOperations<Long> numericalOperations = new NumericalOperations<>(longList);
        System.out.println(numericalOperations.sortNumbers());
        System.out.println(numericalOperations.getMax());
        System.out.println(longList);
    }
}
