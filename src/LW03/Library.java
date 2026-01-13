package LW03;

import java.util.ArrayList;

public class Library {
    private ArrayList<BorrowableItems> borrowableitemsList;

    public Library(){
        borrowableitemsList = new ArrayList<>();
    }
    public void addLibraryItem(BorrowableItems item) {
        borrowableitemsList.add(item);
    }

    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableitemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.gettitle().equalsIgnoreCase(title)) {
                    book.setAvailable(false);
                    System.out.println("Checked out: " + title);
                }
            }
        }
    }

    public void listAvailableItems() {
        System.out.println("Available Library Items:");
        for (BorrowableItems item : borrowableitemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isavailable()) {
                    book.displayinfo();
                }
            }
        }
    }

    public void displayLibraryInfo() {
        int count = 0;
        for (BorrowableItems item : borrowableitemsList) {
            if (item instanceof Book && ((Book) item).isavailable()) {
                count++;
            }
        }

        System.out.println("Total Items in Library : " + borrowableitemsList.size());
        System.out.println("Available Items       : " + count);
        System.out.println();
    }


}
