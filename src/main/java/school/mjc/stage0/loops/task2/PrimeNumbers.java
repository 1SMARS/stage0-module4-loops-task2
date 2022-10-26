package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        
         int i = 0;
        int num;
//        int printToInclusive = 30;

        while (i <= printToInclusive) {

            int counter = 0;
            num = i;

            while (num >= 1) {

                if(i % num == 0) {
                    counter = counter + 1;
                }

                num--;
            }


            if (counter == 2) {
                System.out.println(i);
            }
            i++;

        }
    }
}
