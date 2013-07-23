/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/21/13
 * Time: 4:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntStack {
//linkedlist lifo

    private IntListNode headNode;


    public void insert(int value){

        // ask if it's the last item in the list
        if (this.headNode==null){
            //create new IntListNode
            IntListNode intListNode = new IntListNode();
            intListNode.setValue(value);
            headNode = intListNode;
        } else {
            IntListNode intListNode = new IntListNode();
            intListNode.setValue(value);

            IntListNode nextNode = headNode;
            headNode = intListNode;
            headNode.setNextNode(nextNode);

        }
    }

    public void push(int value){
        insert(value);
    }

    /**
     * pop is O(1) constant
     * @return int
     */
    public int pop(){

        int returnVal =  headNode.getValue();
        headNode = headNode.getNextNode();  //the next one is now the head
        return returnVal;
    }

    /**
     * this is O(n) linear progression
     * @return int
     */
    public int size(){
        int count =0;

        for(IntListNode node = headNode;node!=null;node = node.getNextNode()){
            count++;
        }
        return count;
    }


    public void print(){
        System.out.print("IntStack: [");
        while(headNode!=null){
            System.out.print(headNode);
            headNode = headNode.getNextNode();
            System.out.print(" ");
        }
        System.out.print("]");
    }


}
