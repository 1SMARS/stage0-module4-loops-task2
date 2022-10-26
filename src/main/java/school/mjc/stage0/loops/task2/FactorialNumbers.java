package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
        int fact = 1;

        while (i <= printToInclusive) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);

    }
}
