package Homework;

public class Dog extends Animals {
    public Dog(String name, int canRun, int canSwim) {
        super(name, canRun, canSwim);

    }

    @Override
    boolean swim(int swim) {
        if (canSwim >= swim) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean run(int run) {
        if (canRun >= run) {
            return true;
        } else {
            return false;
        }
    }
}
