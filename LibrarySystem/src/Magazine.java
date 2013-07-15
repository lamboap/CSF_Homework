/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/15/13
 * Time: 3:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Magazine implements LibraryItem {

    private String title;
    private int issue;

    public Magazine(String title, int issue) {
        this.setTitle(title);
        this.setIssue(issue);
    }

    @Override
    public boolean isBorrowable() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getLoanPeriod() {
        return 0;  // I don't like this.  all magazines should have no loan period
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title=" + title +
                ", issue=" + issue +
                '}';   //To change body of overridden methods use File | Settings | File Templates.
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }
}
