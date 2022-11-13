package org.lubna.fundamentals.week4.oops.practisecode;

public class BookLenderAppTest {
    public static void main(String[] args) {

        Book lionKing = new Book("The Lion King" , "Justine Korman");
        Book harryPotter = new Book("Harry potter" , "JK Rowling");
        Book sherlockHolmes = new Book("Sherlock Holmes" , " A.C. Doyle");
        Book atomicHabits = new Book("Atomic Habits" , "James Clear");
        Book juliusCaesar = new Book("Julius Caesar" , "Shakespeare");


        Person nusayba = new Person("Nusayba" , "Tanzeem");
        nusayba.borrowBook(harryPotter);
        nusayba.borrowBook(sherlockHolmes);
        nusayba.displayBorrowedBooks();
        System.out.println(harryPotter.getOwnerInformation());
        nusayba.returnBook(harryPotter);
        //nusayba.displayBorrowedBooks();

      /*  System.out.println("---------");

        Person lubna = new Person("Lubna" , "Farheen");
        lubna.borrowBook(atomicHabits);
        System.out.println(atomicHabits.bookInformation());
        System.out.println(atomicHabits.getOwnerInformation());
        lubna.returnBook(atomicHabits);

        System.out.println("---------");

        Person Anna = new Person("Anna" , "Berg");
        Anna.borrowBook(lionKing);
        System.out.println(lionKing.bookInformation());
        System.out.println(lionKing.getOwnerInformation());

        System.out.println("---------");
        System.out.println(juliusCaesar.bookInformation());

        System.out.println("---------");
        System.out.println(atomicHabits.bookInformation());*/

        System.out.println("---------");
        System.out.println(harryPotter.bookInformation());
    }
}
