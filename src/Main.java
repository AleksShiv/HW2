public class Main {
    public static void main(String[] args) {
        tasck1();
        tasck4();
        tasck5();
        tasck6();
        tasck8();
    }
    private static void tasck1() {
        System.out.println("Задача 1");
        double dog = 8;
        System.out.println(dog);
        var cat = 3.5;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача 2");

        dog = dog + 2;
        System.out.println(dog);
        cat = cat + 2;
        System.out.println(cat);
        paper = paper + 2;
        System.out.println(paper);

        System.out.println("Задача 3");

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }
    private static void tasck4() {
        System.out.println("Задача 4");
        var friend =19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
    }
    private static void tasck5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
    }
    private static void tasck6() {
        System.out.println("Задача 6");
        double boxerOne = 78.2;
        double boxerTwo = 82.7;
        double boxerBoth = boxerTwo + boxerTwo;
        System.out.println("Вес обоих бойцов " + boxerBoth);
        double boxerDiff = boxerTwo - boxerOne;
        System.out.println("разница между весами бойцов " + boxerDiff + " кг");

        System.out.println("Задача 7");
        double boxerMinus = boxerTwo - boxerOne;
        System.out.println("Вес первого бойца меньше чем второго на " + boxerMinus + " кг");
        double boxerBalance = boxerTwo % boxerOne;
        System.out.println("Вес второго бойца больше чем первого на " + boxerBalance + " кг");
    }
    private static void tasck8() {
        System.out.println("Задача 8");
        var workTime = 640;
        var workTimeOne = 8;
        var peopleWork = workTime / workTimeOne;
        System.out.println("Всего работников в компании "+ peopleWork + " человек");

        var workPeoplePlus = peopleWork + 94;
        var workHours = workPeoplePlus * workTimeOne;
        System.out.println("Если в компании работает " + workPeoplePlus + " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками");
    }
}