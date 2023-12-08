import java.util.LinkedList;

public class ToDoList {
    private LinkedList<String> tasks;

    public ToDoList() {
        tasks = new LinkedList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Задача добавлена: " + task);
    }

    public void markTaskAsDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            String doneTask = tasks.get(index);
            tasks.remove(index);
            System.out.println("Задача выполнена: " + doneTask);
        } else {
            System.out.println("Некорректный индекс задачи.");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список дел пуст.");
        } else {
            System.out.println("Текущий список дел:");
            int taskNumber = 1;
            for (String task : tasks) {
                System.out.println(taskNumber + ". " + task);
                taskNumber++;
            }
        }
    }
}
