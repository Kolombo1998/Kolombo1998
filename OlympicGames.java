package Homework;

public class OlympicGames {
    public static void main(String[] args) {
        int distanceSwim=80;
        int distanceRun=170;
        Animals[] animals=new Animals[]{

                new Cat("Кот Вася", 96,133),

                new Dog("Кот Алекс",37,89)
        };
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].name + " может бежать " + animals[i].canRun + " км, а дистанция на играх " + distanceRun
                    + " км, в следствие этого он естественно " + (animals[i].run(distanceRun) ? " добежит " : " не добежит "));
            System.out.println(animals[i].name + " может проплыть " + animals[i].canSwim + " км, а дистанция на играх " + distanceSwim
                    + " км, в следствие этого он естественно  " + (animals[i].swim(distanceSwim) ? " доплывет " : " не доплывет "));

        }
    }
}
