public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
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

        var weightFirstFighter = 78.2;
        var weightSecondFighter = 82.7;
        var totalWeight = weightFirstFighter + weightSecondFighter;
        System.out.println("Общая масса бойцов " + totalWeight + "кг");
        var differenceWeight = weightSecondFighter - weightFirstFighter;
        System.out.println("Разница между массами бойцов " + differenceWeight + "кг");

        weightSecondFighter = weightSecondFighter - weightFirstFighter;
        System.out.println(weightSecondFighter);
        differenceWeight = weightSecondFighter % weightFirstFighter;
        System.out.println(differenceWeight);

        var totalHours = 640;
        var workingHours = 8;
        var employee = totalHours / workingHours;
        System.out.println("Всего работников в компании " + employee + " человек");
        var newEmployee = employee + 94;
        var newTotalHours = workingHours * newEmployee;
        System.out.println("Если в компании работает " + newEmployee + " человек, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками");
    }
}