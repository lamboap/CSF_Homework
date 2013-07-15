import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/15/13
 * Time: 11:48 AM
 * To change this template use File | Settings | File Templates.
 */
public interface LibrarySystem {

    public void addItem(LibraryItem item);

    public String loanItem(User user, LibraryItem item, Date borrowed);

    public boolean returnItem(User user, LibraryItem libItem);

    public void printLibraryItemsForUser(User user);



}
