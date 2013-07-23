/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/15/13
 * Time: 7:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntLinkedList {
//linkedlist fifo



    private IntListNode headNode;

    public void insert(int value){

        // ask if it's the last item in the list
        if (this.headNode==null){
            //create new IntListNode
            IntListNode intListNode = new IntListNode();
            intListNode.setValue(value);
            headNode = intListNode;
        } else {
            //create method that goes through all elements and makes sure value isn't the same as nodes value

            IntListNode intListNode = new IntListNode();
            intListNode.setValue(value);

            headNode.setNextNode(intListNode);
            headNode = intListNode;  //set to be first

        }

    }

    public void remove(int value){
       IntListNode node = new IntListNode();
        node.setValue(value);

        if(headNode==node){
                headNode = headNode.getNextNode();  //remove the first one
        } else {
            IntListNode previousNode = null;
        //now search through list
            while(headNode.getNextNode()!=null){

                previousNode = headNode;
                IntListNode currentNode = headNode.getNextNode();
                if(currentNode==node){
                    //get currentNodes. next node
                    IntListNode nextNode = currentNode.getNextNode();
                    previousNode.setNextNode(nextNode);
                }
             headNode = currentNode;
            }
        }

    }

    private boolean checkForDuplicate(int value){
        //go through each node check if value is same
        // headNode
        return false;
    }

    public void print(){
        System.out.print("IntLinkedList: [");
        while(headNode!=null){
            System.out.print(headNode);
            headNode = headNode.getNextNode();
            System.out.print(" ");
        }
        System.out.print("]");
    }

}
