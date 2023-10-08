// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println();

        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println();

        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println();

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println();

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println();

        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Общая масса бойцов " + (boxer1 + boxer2) + " кг" );
        System.out.println("Разница между массами бойцов " + (boxer2 - boxer1) + " кг");

        System.out.println();

        System.out.println("Задача 7");
        System.out.println("Вычитание из большей массы меньшей - " + (boxer2 - boxer1) + " кг");
        System.out.println("С помощью функции остаток от деления - " + (boxer2 % boxer1) + " кг");

        System.out.println();

        System.out.println("Задача 8");
        var hour = 640;
        var hourDay = 8;
        var people = (hour / hourDay);
        System.out.println("Всего работников в компании - " + people + " человек");
        people += 94;
        System.out.println("Если в компании работает " + people + " человек, то всего " +
    (people * hourDay) + " часов работы должно быть поделено между сотрудниками");

        }
    }