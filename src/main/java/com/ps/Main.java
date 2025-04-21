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
    public Main(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {

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
    private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args){
            formatInventory();
            displayHomeScreen();
        }

        private static void formatInventory() {
            Book[] inventory = new Book[20];

            inventory[0] = new Book(13434, "ISBN-01", "Berserk: Deluxe Edition", false, " ");
            inventory[1] = new Book(13435, "ISBN-02", "One Piece: Volume 1", false, " ");
            inventory[3] = new Book(13436, "ISBN-03", "Naruto: Volume 1", false, " ");
            inventory[4] = new Book(13437, "ISBN-04", "Naruto Shippuden: Volume 1", false, " ");
            inventory[5] = new Book(13438, "ISBN-05", "Bleach: Volume 1", false, " ");
            inventory[6] = new Book(13439, "ISBN-06", "Sword Art Online: Volume 1", false, " ");
            inventory[7] = new Book(13440, "ISBN-07", "Magic the Gathering - Ravnica - War of the Spark: Book 1", false, " ");
            inventory[8] = new Book(13441, "ISBN-08", "Attack on Titan: Volume 1", false, " ");
            inventory[9] = new Book(13442, "ISBN-09", "One Piece: Volume 2", false, " ");
            inventory[10] = new Book(13443, "ISBN-10", "Death Note: Volume 1", false, " ");
            inventory[11] = new Book(13445, "ISBN-11", "One Punch Man: Volume 1", false, " ");
            inventory[12] = new Book(13446, "ISBN-12", "Full Metal Alchemist: Volume 1", false, " ");
            inventory[13] = new Book(13447, "ISBN-13", "Hunter x Hunter: Volume 1", false, " ");
            inventory[14] = new Book(13448, "ISBN-14", "Slam Dunk: Volume 1", false, " ");
            inventory[15] = new Book(13449, "ISBN-15", "Chainsaw Man: Volume 1", false, " ");
            inventory[16] = new Book(13450, "ISBN-16", "My Hero Academia: Volume 1", false, " ");
            inventory[17] = new Book(13451, "ISBN-17", "Tokyo Ghoul: Volume 1", false, " ");
            inventory[18] = new Book(13452, "ISBN-18", "Vinland Saga: Volume 1", false, " ");
            inventory[19] = new Book(13453, "ISBN-19", "One Piece: Volume 3", false, " ");
            inventory[20] = new Book(13454, "ISBN-20", "One Piece: Volume 4", false, " ");
        }

        }
}

}
