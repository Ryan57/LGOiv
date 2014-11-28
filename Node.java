/**
 * Created by Ryan on 11/10/2014.
 */
public class Node {

    Node previousNode = null,
             nextNode = null;

    int index = 0;

    Object obj = null;

    Node(){

    }//.

    Node(Object obj){
        this.obj=obj;
    }//..

    public void add(Object obj){
        if(previousNode == null && nextNode==null){
            this.obj = obj;
        }if(nextNode == null) {
            nextNode = new Node(obj);
            nextNode.index = index+1;
            nextNode.previousNode = this;
        }
    }//..

    public int size(){
        if(nextNode != null) {
            return 1+nextNode.size();
        }
        return 1;
    }//..

    public void removeAt(int index){

    }//..

    public Node get(int nodeAt){
        Node nodeToGet = null;
        if(index == nodeAt){
            nodeToGet = this;
        }else if(index > nodeAt){
            nodeToGet = previousNode.get(nodeAt-1);
        }else if(index < nodeAt){
            if(nextNode != null) {
                nodeToGet = nextNode.get(nodeAt + 1);
            }else{
                System.out.println("Index " + nodeAt + " not in list!");
            }
        }
        return nodeToGet;
    }//..

}// Node
