public class HOME2 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 1, 0, 0, 1};
        int[] multi = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] fill = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        System.out.println();
        taskOne(arr);
        System.out.println();
        taskTwo(8);
        System.out.println();
        taskThee(multi);
        System.out.println();
        taskFour(fill);

    }

    static void taskOne(int[] arr) {
        //Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("Задание1");
        int arrl = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
            System.out.print(" " + arr[i] + " ");
        }
    }

    //Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
    static void taskTwo(int max) {
        System.out.println("ЗАДАНИЕ2");
        int[] fill = new int[max];
        int y = 0;
        for (int i = 0; i < fill.length; i++) {
            System.out.print(" " + fill[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < fill.length; i++, y = y + 3) {
            fill[i] = y;
            System.out.print(" " + fill[i] + " ");
        }
    }

    static void taskThee(int[] multi) {
        System.out.println("ЗАДАНИЕ3");
        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        for (int i = 0; i < multi.length; i++)
            System.out.print(" " + multi[i] + " ");
        {
            System.out.println();
            for (int i = 0; i < multi.length; i++) {
                if (multi[i] < 6) multi[i] = multi[i] * 2;
                System.out.print(" " + multi[i] + " ");
            }
        }
    }

    static void taskFour(int[][] fill) {
        System.out.println("ЗАДАНИЕ4");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    fill[i][j] = 1;
                }
                System.out.print(fill[i][j] + " ");
            }
            System.out.println();
        }
    }
}







