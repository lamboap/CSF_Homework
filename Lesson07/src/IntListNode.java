/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/15/13
 * Time: 7:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntListNode {

    int value;

    IntListNode nextNode;


    public IntListNode() {
        /*

         */
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntListNode getNextNode() {
        return nextNode;
    }


    public void setNextNode(IntListNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return  Integer.toString(value);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntListNode that = (IntListNode) o;

        if (value != that.value) return false;

        return true;
    }




}
