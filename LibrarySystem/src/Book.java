/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/15/13
 * Time: 3:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book implements LibraryItem {

    private final int loanPeriod = 5;
    private String title;
    private String author;


    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean isBorrowable() {
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String toString() {
        return "Book{" +
                "title=" + title +
                ", author=" + author +
                '}';   //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public int getLoanPeriod() {
        return loanPeriod;
    }
}
