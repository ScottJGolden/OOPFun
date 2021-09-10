public class BookTester {
    // a tester (AKA driver) exercises parts of a program

    public static void main(String[] args) {
        Book bookOne = new Book();
        System.out.println(bookOne);

        Book bookTwo = new Book("The Order of the Phoenix", "JK Rowling", 600);
        System.out.println(bookTwo); // EVC

        System.out.println(bookTwo); //toString() is called implicitly
        System.out.println(bookTwo.toString()); //called explicitly

        System.out.println(bookTwo.getTitle());
    }
}
