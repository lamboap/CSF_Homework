import java.util.LinkedList;


public class IntBST {
    private IntNode rootNode;

    public void printTree() {
        LinkedList<IntNode> queue = new LinkedList<IntNode>();
        queue.add(rootNode);
        System.out.print("BFS of BST:" );

        while(!queue.isEmpty()) {      // breadth first printing  (prints every level completely) vs. depth first searches
            IntNode node = queue.remove();
            System.out.print(node.getValue() + " ");

            if (node.getLeftChild() != null)
                queue.add(node.getLeftChild());
            if (node.getRightChild() != null)
                queue.add(node.getRightChild());
        }
    }

    public void insertValue(int value) {
        //create new node
        IntNode node = new IntNode(value);
        if(rootNode==null){
            rootNode = node;  // first iteration
            return;
        }

        //while currentNode has children

        //



        }
        //


        // TODO: Implement insert value for a binary search tree
        //throw new UnsupportedOperationException("Not implemented!");
    }

    private void setNode(IntNode currNode, IntNode node){

        if(node.getValue()>currNode.getValue()){
            currNode.setRightChild(node);
        } else {
            currNode.setLeftChild(node);
        }


    }


    public boolean search(int value) {
        // TODO: Implement search for a value for a binary search tree
        throw new UnsupportedOperationException("Not implemented!");
        //return false;
    }

    public void remove(int value) {
        // TODO: Optional Challenge HW Question for next Monday
        // To remove, first examine the find the node, then:
        // 1) Node N has no children? Just remove N
        // 2) Node N has one child? Just remove N and replace with the child
        // 3) Node N has two children? A little harder. Either take the in-order successor or predecessor R, swap the values of N and R, then delete R

    }
}
