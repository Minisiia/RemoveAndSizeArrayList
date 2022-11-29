package add;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(0,"Cat");
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
/*        listOfAnimals.remove(3);
        listOfAnimals.remove((5-1));    // враховуючи одне видалення елемент с індексом 5 став мати індекс 4
        listOfAnimals.remove((7-2));    // враховуючи два видалення елемент с індексом 7 став мати індекс 5
        System.out.println(listOfAnimals);
        System.out.println("Розмір після видалення 3, 5 та 7 елементів: " + listOfAnimals.size());*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть скільки видаляти елементів 3, 5 чи 7: ");
        int amountToRemove = scanner.nextInt();
        if (amountToRemove == 3) {
            for (int i = 0; i < 3; i++) {
                listOfAnimals.remove(0);
            }
            System.out.println(listOfAnimals);
            System.out.println("Розмір після видалення 3 елементів: " + listOfAnimals.size());
        }
        if (amountToRemove == 5) {
            for (int i = 0; i < 5; i++) {
                listOfAnimals.remove(0);
            }
            System.out.println(listOfAnimals);
            System.out.println("Розмір після видалення 5 елементів: " + listOfAnimals.size());
        }
        if (amountToRemove == 7) {
            for (int i = 0; i < 7; i++) {
                listOfAnimals.remove(0);
            }
            System.out.println(listOfAnimals);
            System.out.println("Розмір після видалення 7 елементів: " + listOfAnimals.size());
        }
        if ((amountToRemove!=3)&&(amountToRemove!=5)&&(amountToRemove!=7)) System.out.println("Неправильна кількість елементів");
    }
}
