public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Початок програмування", "Л. Кенеді", 2000);
        Book book2 = new Book("451 градус по Фаренгейту", "Рей Бредбері",1953 );
        Book book3 = new Book("Книга Кафе на краю світу", "Джон П. Стрелеки", 2019);
        User user1 = new User("Іван", "Вулиця Пса Патрона, 12");
        User user2 = new User("Василь", "Проспект О. Поля, 5");
        book1.displayInformation();
        book2.displayInformation();
        book3.displayInformation();
        user1.borrowBook(book1);
        user1.borrowBook(book2);
        user2.borrowBook(book3);
        user1.displayInformation();
        user2.displayInformation();
        book1.takeInUse();
        book1.returnBook();
        user1.returnBook(book1);
        user1.displayInformation();


        Client client1 = new Client("Іван", "Вулиця Пса Патрона, 12");
        Client client2 = new Client("Василь", "Проспект О. Поля, 5");
        Account account1 = new Account("123456");
        Account account2 = new Account("999999");
        client1.addAccount(account1);
        client2.addAccount(account2);
        account1.deposit(1000);
        account1.withdraw(500);
        account2.deposit(1500);
        account2.withdraw(200);
        account1.transfer(account2, 300);
        client1.printAccountHistory();
        client2.printAccountHistory();


        Customer customer = new Customer("Іван");
        Task task1 = new Task("Приклад завдання 1", "Опис завдання 1", customer);
        Task task2 = new Task("Приклад завдання 2", "Опис завдання 2", customer);
        customer.addTask(task1);
        customer.addTask(task2);
        customer.printTasks();
        task1.setCompleted(true);
        customer.printTasks();


        Product product1 = new Product("Лаптоп", 5, 1200.0, "Склад 1");
        Product product2 = new Product("Смартфон", 10, 600.0, "Склад 2");
        Warehouse warehouse1 = new Warehouse("Склад 1");
        Warehouse warehouse2 = new Warehouse("Склад 2");
        warehouse1.addProduct(product1);
        warehouse2.addProduct(product2);
        warehouse1.printInventory();
        warehouse2.printInventory();
        warehouse1.moveProduct(product1, warehouse2);
        warehouse1.printInventory();
        warehouse2.printInventory();


        Student student1 = new Student("Іван", "Іванов", "Група-1");
        Student student2 = new Student("Петро", "Петров", "Група-2");
        Course mathCourse = new Course("Математика");
        Course physicsCourse = new Course("Фізика");
        student1.addCourse(mathCourse);
        student2.addCourse(physicsCourse);
        System.out.println("Інформація про студента 1:");
        System.out.println("Повне ім'я: " + student1.getFullName());
        System.out.println("Група: " + student1.getGroupNumber());
        System.out.println("Курси: " + student1.getCourses());
        System.out.println("Інформація про студента 2:");
        System.out.println("Повне ім'я: " + student2.getFullName());
        System.out.println("Група: " + student2.getGroupNumber());
        System.out.println("Курси: " + student2.getCourses());
        System.out.println("Інформація про курс математики:");
        System.out.println("Назва курсу: " + mathCourse.getCourseName());
        System.out.println("Студенти: " + mathCourse.getStudents());
        System.out.println("Інформація про курс фізики:");
        System.out.println("Назва курсу: " + physicsCourse.getCourseName());
        System.out.println("Студенти: " + physicsCourse.getStudents());
    }
}