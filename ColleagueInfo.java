public class ColleagueInfo {
    public static void main(String[] args) {
        Colleague[] person = new Colleague[5];
        person[0] = new Colleague("Олег", "Директор", "qqq@mail.ru", "89177871333", 30000, 37);
        person[1] = new Colleague("Вадим", "Менеджер", "123ert@mail.ru", "89873334711", 32333, 27);
        person[2] = new Colleague("Игорь", "Главный Инженер", "qqq323@mail.ru", "89273898789", 35000, 47);
        person[3] = new Colleague("Денис", "Гениральный Директор", "qqq222@mail.ru", "89170001133", 115000, 55);
        person[4] = new Colleague("Михаил", "Бэкенд-разработчик", "qqq123@mail.ru", "89873346868", 215000, 41);

        for (int i = 0; i < person.length;i++) {
            if(person[i].getAge()>40){
                person[i].infoPrint();
            }

        }
    }
}

