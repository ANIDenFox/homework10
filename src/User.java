class User {
    String name;
    String address;
    Book[] borrowedBooks;

    public User(String name, String address) {
        this.name = name;
        this.address = address;
        this.borrowedBooks = new Book[3]; // Maximum number of borrowed books
    }

    public void borrowBook(Book book) {
        for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i] == null) {
                borrowedBooks[i] = book;
                System.out.println("Книга " + book.title + " була запозичено користувачем " + name);
                return;
            }
        }
        System.out.println("Відвідувач " + name + " вже позичив максимальну кількість книг.");
    }

    public void returnBook(Book book) {
        for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i] == book) {
                borrowedBooks[i] = null;
                System.out.println("Книга " + book.title + " була повернуто користувачем " + name);
                return;
            }
        }
        System.out.println("Відвідувач " + name + " не позичав цю книгу.");
    }

    public void displayInformation() {
        System.out.println("Ім'я: " + name);
        System.out.println("Адрес: " + address);
        System.out.println("Позичені книжки:");
        for (Book book : borrowedBooks) {
            if (book != null) {
                System.out.println("- " + book.title);
            }
        }
        System.out.println("----------------------");
    }
}
