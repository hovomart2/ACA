package week4HomeworkTask3;

public class X86IntelProcessor implements Processor {

    @Override
    public void calculateBinary(long decimal) {
        String result = "";
        long startTime = System.currentTimeMillis();
        int[] binary = new int[70];
        int index = 0;
        while (decimal != 1) {
            if (decimal % 2 == 0) {
                binary[index] = 0;
                index++;
                decimal /= 2;
            } else {
                binary[index] = 1;
                index++;
                decimal /= 2;
            }
        }
        binary[index] = 1;
        for (int i = index; i >= 0; i--) {
            result += binary[i];
        }
        while (System.currentTimeMillis() - startTime < 4000) {

        }
        System.out.println(result);
    }
}
