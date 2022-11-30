package add;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(0, "Cat");
        listOfAnimals.add(1, "Dog");
        listOfAnimals.add(2, "Crow");
        listOfAnimals.add(3, "Frog");//3
        listOfAnimals.add(4, "Hen");
        listOfAnimals.add(5, "Horse");//5
        listOfAnimals.add(6, "Mouse");
        listOfAnimals.add(7, "Tiger");//7
        System.out.println("Початковий список");
        System.out.println(listOfAnimals);
        // remove
        listOfAnimals.remove(3);
        listOfAnimals.remove((5 - 1));    // враховуючи одне видалення елемент с індексом 5 став мати індекс 4
        listOfAnimals.remove((7 - 2));    // враховуючи два видалення елемент с індексом 7 став мати індекс 5
        System.out.println("Список після видалення");
        System.out.println(listOfAnimals);
        System.out.println("Розмір після видалення 3, 5 та 7 елементів: " + listOfAnimals.size());
    }
}
