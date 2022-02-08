public class Program_One {
    public static void main(String[] args) {
        Program1();
        System.out.println("a*(b+(c/d))="+Program2(13,33,46,433));
        System.out.println(Program3(10,2));
        Program4(-1);
        System.out.println(Program5(-277));
        Program6("КОЛОМБО");
    }
    static void Program1() {
        System.out.println("PROGRAM1:");
        byte b1 = 37;
        System.out.println(b1);
        short s1= 8888;
        System.out.println(s1);
        int i1= 32000312;
        System.out.println(i1);
        long l1=12300745013L;
        System.out.println(l1);
        float f1=1237.5f;
        System.out.println(f1);
        double d1=123519.13333;
        System.out.println(d1);
        boolean bool=true;
        System.out.println(bool);
        char c1=33;
        System.out.println(c1);

    }
    static double Program2( double a, double b, double c, double d){
        System.out.println("PROGRAM2:");
    return a*(b+(c/d));
    }
    static boolean Program3(int a,int b){
        System.out.println("PROGRAM3");
        int ares=a+b;
        if (ares>=10&&ares<=20) return true;
        else return false;
    }
    static void Program4(int x){
        System.out.println("PROGRAM4:");
        if(x>=0)
            System.out.println("Число x положительное");
        else
            System.out.println("Число x отрицательное");
    }
    static boolean Program5(int n){
        System.out.println("PROGRAM5");
        if(n<0) return true;
        else return false;
    }
    static void Program6(String name){
        System.out.println("PROGRAM6");
        System.out.println("Hello,"+name);
    }


    }

