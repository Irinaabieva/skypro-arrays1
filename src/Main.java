public class Main {
    public static void main(String[] args) {
        // Задание 1
        int[] arr1 = {1 , 2 , 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        char[] arr3 = {'a', 'b', 'c'};

        // Задание 2
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.println(arr1[i]);
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.println(arr2[i]);
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr1.length - 1) {
                System.out.println(arr3[i]);
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
    }
}