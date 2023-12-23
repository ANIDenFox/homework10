class Book {
    String title;
    String author;
    int publicationYear;
    boolean available;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = true;
    }

    public void takeInUse() {
        if (available) {
            available = false;
            System.out.println("Книга " + title + " була взято у використання.");
        } else {
            System.out.println("Книга " + title + " недоступна.");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println("Книга " + title + " була повернена.");
    }

    public void displayInformation() {
        System.out.println("Назва: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Дата випуску: " + publicationYear);
        System.out.println("Статус: " + (available ? "доступна" : "вже використовується"));
        System.out.println("----------------------");
    }
}
