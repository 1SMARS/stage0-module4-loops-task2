package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        while (power > 0) {

            if (power == 1) {

                System.out.println(power);
            }

            if (power % 2 != 0) {

                System.out.println("too much power");
            }
            else {

                power = power / 2;
            }
        }

        System.out.println("too much power");
    }
}
