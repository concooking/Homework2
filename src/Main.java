//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 10;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var boxersWeight = boxerOne + boxerTwo;
        System.out.println(boxersWeight);
        var differenceWeight = boxerTwo - boxerOne;
        System.out.println(differenceWeight);
        var remainderDevision = boxerTwo % boxerOne;
        System.out.println(remainderDevision);
        var timeWork = 640;
        var oneEmployee = 8;
        var numberEmployees = timeWork / oneEmployee;
        System.out.println("Всего работников в компании " + numberEmployees);
        numberEmployees = numberEmployees + 64;
        timeWork = numberEmployees * 8;
        System.out.println("Если в компании работает " + numberEmployees + " человек, то всего " + timeWork + " часов работы может быть поделено между сотрудниками");
    }
}