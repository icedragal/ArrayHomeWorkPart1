public class Main {
    public static void main(String[] args) {

        //Task 1
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        double[] doubleArray = {1.57, 6.654, 9.986};

        long[] longArray = {1222222222L, 9999999999L};

        //Task 2
        System.out.println("Задание 2");
        String comma = ", ";
        int intArrayLength = intArray.length;
        int doubleArrayLength = doubleArray.length;
        int longArrayLength = longArray.length;
        for (int i = 0; i < intArrayLength; i++) {
            System.out.print(intArray[i]);
            if (i < intArrayLength - 1) {
                System.out.print(comma);
            }
        }
        System.out.println();
        for (int i = 0; i < doubleArrayLength; i++) {
            System.out.print(doubleArray[i]);
            if (i < doubleArrayLength - 1) {
                System.out.print(comma);
            }
        }
        System.out.println();
        for (int i = 0; i < longArrayLength; i++) {
            System.out.print(longArray[i]);
            if (i < longArrayLength - 1) {
                System.out.print(comma);
            }
        }

        //Task 3
        System.out.println();
        System.out.println("Задание 3");
        for (int i = intArrayLength - 1; i >= 0; i--) {
            System.out.print(intArray[i]);
            if (i > 0) {
                System.out.print(comma);
            }
        }
        System.out.println();
        for (int i = doubleArrayLength - 1; i >= 0 ; i--) {
            System.out.print(doubleArray[i]);
            if (i > 0) {
                System.out.print(comma);
            }
        }
        System.out.println();
        for (int i = longArrayLength - 1; i >= 0; i--) {
            System.out.print(longArray[i]);
            if (i > 0) {
                System.out.print(comma);
            }
        }

        //Task 4
        System.out.println();
        System.out.println("Задание 4");
        for (int i = 0; i < intArrayLength; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i] = intArray[i] + 1;
            }
            System.out.print(intArray[i]);
            if (i < intArrayLength - 1) {
                System.out.print(comma);
            }
        }
    }
}