public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Фёдор", "Достоевский");
        Author author2 = new Author("Александр", "Пушкин");

        Book book1 = new Book("Бесы", author1, 1872);
        Book book2 = new Book("Евгений Онегин", author2, 1831);

        System.out.println(book1.getTitle() + " " + book1.getBookAuthor() + " " + book1.getYearOfPublication());
        System.out.println(book2.getTitle() + " " + book2.getBookAuthor() + " " + book2.getYearOfPublication());

        book1.setYearOfPublication(1873);
        System.out.println("Изменённый год публикации первой книги = " + book1.getYearOfPublication());
    }
}