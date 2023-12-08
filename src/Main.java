import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        int choice;

        do {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Отметить задачу как выполненную и удалить");
            System.out.println("3. Отобразить текущий список дел");
            System.out.println("0. Выйти");

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Введите новую задачу:");
                    String newTask = scanner.nextLine();
                    toDoList.addTask(newTask);
                    break;
                case 2:
                    System.out.println("Введите задачу как отмеченной:");
                    int index = scanner.nextInt();
                    toDoList.markTaskAsDone(index - 1);
                    break;
                case 3:
                    toDoList.displayTasks();
                    break;
                case 0:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Неправильно набрали Попробуйте снова.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}

/*list.add(1.2);
        list.add(2.2);
        list.add(3.2);
        list.add(4.2);
        for (Double j : list) {
            System.out.print(j + " ");

        }
        list.set(3,3.2);
        System.out.println("------");
        for (Double j: list) {
            System.out.print(j + "\n");

        }*/
/*
        list.add("Alex");
        list.add("Masha");
        list.add("Wlex");
        list.add("sfglex");
        list.add("sdfelex");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));*/
       /* int startValue = 0;
        int finishValue = 10_000;
        int i = 0;
        while (startValue<finishValue){
            startValue = (int)Math.pow(i,2);
            list.add(startValue);
            i++;
        }
        for (Integer j :list) {
            System.out.print(j + " ");
        }
        ArrayList<Integer>listCopy = new ArrayList<>();
        for (Integer j :list) {
            if (i % 2 == 0 || i % 3 == 0){
                listCopy.add(list.indexOf(j));
            }
        }
        System.out.println("\n--------");
        for (Integer j :listCopy) {
            System.out.println(j + "\n ");
        }*/
      /* int startValue = 0;
       int finishValue = 10_000;
       int i = 0;
       while (startValue<finishValue){
           startValue = (int)Math.pow(i,2);
           list.add(startValue);
           i++;
       }
        for (Integer j: list) {
            System.out.println(j);
        }*/
/* list.add(1);
        list.add(5);
        System.out.println(list.get(0));
        System.out.println(list.get(1));*/
