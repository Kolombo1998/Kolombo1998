package Homework;

public abstract class Animals {
    protected String name;
    protected int canRun;
    protected int canSwim;

    public Animals(String name, int canRun, int canSwim) {
        this.name = name;
        this.canRun = canRun;
        this.canSwim = canSwim;
    }

    abstract boolean swim(int swim);

    abstract boolean run(int run);

}
