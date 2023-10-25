public class Main {
    public static void main(String[] args) {
        int[] wi = {1, 2, 3};
        System.out.println(wi[0]);
        double[] weight = {1.57, 7.654, 9.986};
        System.out.println(weight[0]);

        int[] w = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
        for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]);
        }

        System.out.println("Задача 2");
        int[] numbers1 = {1, 2, 3};
        double[] numbers2 = {1.57, 7.654, 9.986};
        int[] numbers3 = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
        for (int number1 : numbers1) {
            System.out.print(number1 + ", ");
        }

        System.out.println();
        for (double number2 : numbers2) {
            System.out.print(number2 + ", ");
        }

        System.out.println();
        System.out.println("Задача 3");
        for (int q = numbers1.length - 1; q >= 0; q--) {
            System.out.print(numbers1[q]);

            if (q != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int e = numbers2.length - 1; e >= 0; e--) {
            System.out.print(numbers2[e]);

            if (e != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int t = numbers3.length - 1; t >= 0; t--) {
            System.out.print(numbers3[t]);

            if (t != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        int[]  array = {1, 2, 3};
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}






































