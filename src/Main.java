public class Main {
    public static void main(String[] args) {
        // write your code here
        double dog = 8;
        System.out.println(dog);
        var cat = 3.5;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 2;
        System.out.println(dog);
        cat = cat + 2;
        System.out.println(cat);
        paper = paper + 2;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend =19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var boxerBoth = boxerTwo + boxerTwo;
        System.out.println("Вес обоих бойцов " + boxerBoth);
        var boxerDiff = boxerTwo - boxerOne;
        System.out.println("разниц между весами бойцов " + boxerDiff + " кг");


    }
}