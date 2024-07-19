package ca.ucalgary.ensf380;

public class MyBook {
    public static void main(String[] args) {
        // Create Publisher
        Publisher oxfordPress = new Publisher("Oxford University Press", "Oxford, UK");

        // Create Author
        Author hamzaKhurram = new Author("Hamza Khurram", "123 Main St, Calgary, AB", 30);

        // Create Book
        Book prideAndPrejudice = new Book("1122334455", 350);

        // Assign Series
        Series classicLiterature = new Series();
        classicLiterature.setSeriesName("Classic Literature");

        // Link Book to Series and Author
        Novel prideAndPrejudiceNovel = new Novel("1122334455", 350);
        prideAndPrejudiceNovel.setTheAuthor(new Author[]{hamzaKhurram});
        prideAndPrejudiceNovel.setMySeries(classicLiterature);

        // Print Scenario Details
        System.out.println("Publisher: " + oxfordPress.getName());
        System.out.println("Book Title: Pride and Prejudice");
        System.out.println("ISBN: " + prideAndPrejudice.getIsbn());
        System.out.println("Pages: " + prideAndPrejudice.getPages());
        System.out.println("Series: " + classicLiterature.getSeriesName());
        System.out.println("Author: " + hamzaKhurram.getName());
    }
}
