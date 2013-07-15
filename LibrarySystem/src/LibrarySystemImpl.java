import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/15/13
 * Time: 11:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class LibrarySystemImpl implements LibrarySystem {

    List<LibraryItem> libraryItemList = new ArrayList<LibraryItem>();
    List<BorrowedItem> borrowedItems = new ArrayList<BorrowedItem>();


    private boolean hasOverdueItems(List<BorrowedItem> userBorrowed){

        boolean hasOverdue = true;

        if(userBorrowed.size()==0){
            return true;
        }

        // loop through user's borrowed Items check if overDue  convert dueDate to calender
        for(BorrowedItem borrowedItem: userBorrowed){

                Calendar now = Calendar.getInstance();
                //compare with borrowed items due date
                Date dueDate = borrowedItem.getDue();
                Calendar dueCalender = Calendar.getInstance();
                dueCalender.setTime(dueDate);
                if (now.after(dueCalender)){
                    hasOverdue = true;
                }
                }


        return hasOverdue;
    }

    public List<BorrowedItem> getUsersBorrowedItems(User user){

        // loop through get sublist of user
        List<BorrowedItem> usersBorrowed = new ArrayList<BorrowedItem>();
        for(BorrowedItem item: borrowedItems){
            if (item.getUser().equals(user)){
                usersBorrowed.add(item);
            }
        }

        return usersBorrowed;
    }


    @Override
    public void addItem(LibraryItem item) {

        libraryItemList.add(item);  // allow duplicates

    }

    @Override
    public String loanItem(User user, LibraryItem item, Date borrowed) {

        // check if LibraryItem is borrowable (interface)
        if(!item.isBorrowable()){
            return "not borrowable";
        }
        // check user's borrowed items for overdue
        if(hasOverdueItems(getUsersBorrowedItems(user))){
            return "return items!";
        }

        //create BorrowedItem add to list
        Calendar cal = Calendar.getInstance();
        Date borrowedDate = cal.getTime();
        cal.add(Calendar.DATE,item.getLoanPeriod());
        Date dueBack = cal.getTime();

        BorrowedItem borrowedItem = new BorrowedItem(user, item, borrowedDate, dueBack);

        borrowedItems.add(borrowedItem);

        String borrowedString = "details about borrowed item:" + borrowedItem.toString();

        return borrowedString;

    }

    @Override
    public boolean returnItem(User user, LibraryItem libItem) {

        //search borrowedItems by user for item and remove it.
        BorrowedItem item = new BorrowedItem(user,libItem);
        return borrowedItems.remove(item);


    }

    @Override
    public void printLibraryItemsForUser(User user) {
        List<BorrowedItem> borrowedItemList = getUsersBorrowedItems(user);
        for(BorrowedItem item: borrowedItemList){
            //call print on each item
            System.out.println(item.print());
        }
    }
}
