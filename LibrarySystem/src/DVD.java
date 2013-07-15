/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/15/13
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class DVD implements LibraryItem {

    private final int loanPeriod = 10;
    private String title;
    private String director;

    public DVD(String title, String director) {
        this.title = title;
        this.director = director;
    }

    @Override
    public boolean isBorrowable() {
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }


    @Override
    public int getLoanPeriod() {
        return loanPeriod;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "title=" + title +
                ", director=" + director +
                '}';   //To change body of overridden methods use File | Settings | File Templates.
    }

}
