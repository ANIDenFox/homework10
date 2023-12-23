class Customer {
    private String name;
    private java.util.ArrayList<Task> tasks;

    public Customer(String name) {
        this.name = name;
        this.tasks = new java.util.ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public java.util.ArrayList<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void printTasks() {
        System.out.println("Завдання клієнта " + name + ":");
        for (Task task : tasks) {
            System.out.println("Назва: " + task.getTitle());
            System.out.println("Опис: " + task.getDescription());
            System.out.println("Статус: " + (task.isCompleted() ? "Виконано" : "Не виконано"));
            System.out.println("---------------");
        }
    }
}