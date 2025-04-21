package com.ps;
import java.awt.print.Book;
import java.util.Scanner;

public class Main {

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
    public Main(int id, String isbn, String title) {

            this.id = id;
            this.isbn = isbn;
            this.title = title;
            this.isCheckedOut = false;
            this.checkedOutTo = " ";

    }

    public void checkOut(String title){
        this.isCheckedOut = true;
        this.checkedOutTo = "name";
    }

    public void checkIn(){
        this.isCheckedOut = false;
        this.checkedOutTo = " ";

    }

public class BookInventory {
        private static Book[] inventory;
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args){
            formatInventory();
            displayHomeScreen();
        }

        private static void formatInventory(){
            inventory = new Book[20];
            inventory[0] = new Book()
            inventory[1] = new Book()
            inventory[3] = new Book()
            inventory[4] = new Book()
            inventory[5] = new Book()
            inventory[6] = new Book()
            inventory[7] = new Book()
            inventory[8] = new Book()
            inventory[9] = new Book()
            inventory[10] = new Book()
            inventory [11] = new Book()
            inventory[12] = new Book()
            inventory[13] = new Book()
            inventory[14] = new Book()
            inventory[15] = new Book()
            inventory[16] = new Book()
            inventory[17] = new Book()
            inventory[18] = new Book()
            inventory[19] = new Book()
            inventory[20] = new Book()

        }
}

}
