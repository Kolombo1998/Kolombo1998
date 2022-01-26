public class Main {
    public static void main(String[] args) {
        taskOne();
        System.out.println("a*(b+(c/b))=" + taskTwo(7, 15, 8, 10));
        System.out.println(taskThree(13, 4));
        taskFour(-17);
        System.out.println(taskFive(20));
        taskSix("Николай!");
        taskSeven(1877);

    }

    static void taskOne() {
        byte b1 = 13;
        System.out.println(b1);
        short s1 = 123;
        System.out.println(s1);
        int i1 = 12345;
        System.out.println(i1);
        long l1 = 12345678L;
        System.out.println(l1);
        float f1 = 123.0f;
        System.out.println(f1);
        double d1 = 123.123;
        System.out.println(d1);
        boolean bool = false;
        System.out.println(bool);
    }

    static double taskTwo(double a, double b, double c, double d) {
        System.out.println("taskTwo");
        return a * (b + (c / d));

    }

    static boolean taskThree(int x, int y) {
        System.out.println("taskThree");
        int summa = x + y;
        if (summa >= 10 && summa <= 20) return true;
        else return false;
    }

    static void taskFour(int n){
        System.out.println("taskFour");
        if (n >= 0) System.out.println(n+ "положительное");
        else System.out.println(n+ "отрицательно");
    }static boolean taskFive(int m){
        System.out.println("taskFive");
        if(m<0) return true;
        else return false;

    }static void taskSix(String name){
        System.out.println("taskSix");
        System.out.println("Привет"+name);
    }static void taskSeven(int year){
        System.out.println("taskSeven");
        if(!(year%4==0)||(year%100==0)&&(year%400==0))
            System.out.println(year+"год не весокосный");
        else System.out.println(year+"год весокосный");
    }


}


