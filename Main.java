// Добавить в проект класс, предназначенный для хранения координат. Добавить в абстрактный класс поле, экземпляр класс координат.
//  Пробросить координаты через конструкторы наследников так, чтобы создавая объекты вы передавали в параметрах имя и аоординаты. 
//  Скорректировать алгоритм заполнения комманд. Кроме имён каждый персонаж должен иметь координаты. 
//  Одна комманда находится с левой стороны другая с правой(у=0 и у=9).
//  В класс лучников добавить метод поиск ближайшего противника. Алгоритм расчёта расстояний реализовать в классе координат.

import units.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int teamcount = 10;
        ArrayList<Unit> team1 = new ArrayList<>();
        ArrayList<Unit> team2 = new ArrayList<>();
        for (int i = 0; i < teamcount; i++) {
            int val = random.nextInt(7);
            switch (val) {
                case 0:
                    team1.add(new Crossbowman(getName(), i,0));
                    team2.add(new Crossbowman(getName(), i,9));
                    break;
                case 1:
                    team1.add(new Mag(getName(), i,0));
                    team2.add(new Mag(getName(), i,9));
                    break;
                case 2:
                    team1.add(new Monk(getName(),i,0));
                    team2.add(new Monk(getName(), i,9));
                    break;
                case 3:
                    team1.add(new Outlaw(getName(), i,0));
                    team2.add(new Outlaw(getName(), i,9));
                    break;
                case 4:
                    team1.add(new Peasant(getName(), i,0));
                    team2.add(new Peasant(getName(), i,9));
                    break;
                case 5:
                    team1.add(new Sniper(getName(), i,0));
                    team2.add(new Sniper(getName(), i,9));
                    break;
                case 6:
                    team1.add(new Spearman(getName(), i,0));
                    team2.add(new Spearman(getName(), i,9));
                    break;
            }
        }
        System.out.println("Команда № 1:");
        for (Unit a : team1){
            a.printShort();

        }
        System.out.println("Команда № 2:");
        for (Unit a : team2){
            a.printShort();
        }

    }


    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}
