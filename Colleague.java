public class Colleague {
    private String name;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Colleague(String name, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void infoPrint() {
        System.out.println("ФИО: "+name+", Долность:"+post+", Email:"+email+", Телефон:"+phoneNumber+", Зарплата:"+salary+"$, Возраст:"+age+" лет");
    }
}

