public class HOMELESSONS {
    public static void main(String[] args) {
        int[] minMax = {17, 14, 22, 47, 40, 215, 13, 1, 3};
        int[] checkBalance = {3, 3, 1, 4, 1, 2};
        taskFive(minMax);
        System.out.println(taskSix(checkBalance));

    }

    //Задать одномерный масив и найти в нем
// минимальный и максимальный элементы
    static void taskFive(int[] minMax) {
        int max = minMax[0];
        int min = minMax[0];
        for (int i = 0; i < minMax.length; i++) {
            if (minMax[i] < min) {
                min = minMax[i];
            } else if (minMax[i] > max) {
                max = minMax[i];
            }


        }
        System.out.println(min + " " + max);
    }
//Написать метод, в каторый передается не пустой одномерный масив,
// метод должен вернуть true

    static boolean taskSix(int[] checkBalance) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < checkBalance.length; i++) {
            leftSum += checkBalance[i];
        }
        for (int i = 0; i < checkBalance.length; i++) {
            rightSum += checkBalance[i];
            if (rightSum == leftSum - rightSum) {
                return true;
            }
        }return false;
    }
}


