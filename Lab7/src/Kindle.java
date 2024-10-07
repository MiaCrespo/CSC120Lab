public class Kindle {
    //the 2 int data items
    private int totalPages;    // total # of pages in the book
    private int currentPage;   // current page the reader is on

    // the constructor that initializes the total pages and makes current page 1
    public Kindle() {
        totalPages = 0;
        currentPage = 1;
    }

    // first turnPages method to add current page by 1
    public void turnPages() {
        if (currentPage < totalPages) {
            currentPage++;
        }
    }
    public Kindle(int numberOfPages){
        totalPages = numberOfPages;
        currentPage = 1;
    }

    // another turnPages method to turn pages by a specific amount
    public void turnPages(int numberOfPages) {
        if (currentPage + numberOfPages > totalPages) {
            System.out.println("You were on                : " + toString());
            System.out.println("Turning " + numberOfPages + " pages would take you past the last page.");
            currentPage = totalPages; // Set to the last page if it exceeds
            System.out.println("You are now on             : " + toString());
        } else {
            currentPage += numberOfPages;
        }
    }

    // toString method for outputting the current page and total pages
    public String toString() {
        return "Page " + currentPage + " of " + totalPages;
    }
}
