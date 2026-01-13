package LW03;

 public class Book extends BorrowableItems {
     private String title;
     private String author;
     private String ISBN;
     private boolean available;

     public Book(String title,String author,String ISBN,boolean available) {
         this.title = title;
         this.author = author;
         this.ISBN = ISBN;
         this.available = available;
     }

     public String gettitle(){
         return title;
     }
     public void settitle(String title){
         this.title = title;
     }
     public String getauthor(){
         return author;
     }
     public void setauthor(String author){
         this.author = author;
     }
     public String getISBN(){
         return ISBN;
     }
     public void setISBN(String ISBN){
         this.ISBN = ISBN;
     }
     public boolean isavailable(){
         return available;
     }
     public void setAvailable(boolean available) {
         this.available = available;
     }

     @Override
     public void displayinfo() {
         System.out.println("title:"+title);
         System.out.println("author:"+author);
         System.out.println("ISBN:"+ISBN);
         System.out.println("available:"+available);
     }
 }
