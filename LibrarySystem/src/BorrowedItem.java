import java.text.DateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/15/13
 * Time: 12:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class BorrowedItem {


    public BorrowedItem(User user, LibraryItem item){
        this.setUser(user);
        this.setItem(item);
    }

    public BorrowedItem(User user, LibraryItem item, Date borrowed, Date due){
        this.setUser(user);
        this.setItem(item);
        this.setBorrowed(borrowed);
        this.setDue(due);
    }

    private User user;
    private LibraryItem item;
    private Date borrowed;
    private Date due;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LibraryItem getItem() {
        return item;
    }

    public void setItem(LibraryItem item) {
        this.item = item;
    }

    public Date getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Date borrowed) {
        this.borrowed = borrowed;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    DateFormat formatter = DateFormat.getDateInstance(DateFormat.MEDIUM);

    @Override
    public boolean equals(Object o) {
        boolean eq = false;
        if(o instanceof BorrowedItem)
        {
            BorrowedItem borrowedItem = (BorrowedItem)o;
            eq = borrowedItem.getUser().equals(getUser())
                    && borrowedItem.getItem().equals(getItem());
        }
        return eq;
    }

    @Override
    public String toString() {
        return "BorrowedItem{" +
                "user=" + user +
                ", item=" + item +
                ", borrowed=" + formatter.format(borrowed) +
                ", due=" + formatter.format(due) +
                '}';
    }

    public String print(){
        return this.toString();
    }

}
