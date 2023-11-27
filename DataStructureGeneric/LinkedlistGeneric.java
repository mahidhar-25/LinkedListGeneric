

package DataStructureGeneric;


public class LinkedlistGeneric<T> {

    Node<T> head;
    //initialization of a node
    /*
    @desc : Class node is a generic class it contains and data and a next pointer of type T which we initialize

     */
    class Node<T>{
        T data;
        Node<T> next;
        /*
        @desc : constructor initializing node with value d of type T(object)
        @param - T(Type object primitive) - data
        @return : no return
         */
        Node(T data){
            this.data = data;
            next = null;
        }
    }

/*

 @desc : Inserts a new element with the specified value at the end of the linked list of given type T.

 @param val The value to be inserted of type T.

 @return No explicit return value.

 */

    public void insert(T val){
        Node<T> latestNode = new Node<T>(val);
        latestNode.next = null;
        if(head == null){
            head = latestNode;
        }else{
            Node<T> last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = latestNode;
        }
    }

    /*

 @desc : Inserts a new element with the specified value at the beginning of the linked list of given type T.

 @param val The value to be inserted of type T.

 @return No explicit return value.

 */

    public void insertAtBegin(T val){
        Node<T> latestNode = new Node<T>(val);
        latestNode.next = null;
        if(head == null){
            head = latestNode;
        }else{
            Node<T> last = head;
            head = latestNode;
            head.next = last;
        }
    }


    /*

        @desc :  This method traverses the linked list and prints each element.

        @param :  None.

        @return :  No explicit return value.
 */
    public void printList()
    {
        Node<T> currNode = head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("!!! Welcome the linked list generic problem !!!");

        //initialized a integer link list
        LinkedlistGeneric<Integer> newLinkedList = new LinkedlistGeneric<>();

        newLinkedList.insertAtBegin(70);
        newLinkedList.printList();
        newLinkedList.insertAtBegin(30);
        //30 -> 70
        newLinkedList.printList();
        newLinkedList.insertAtBegin(56);
        //56 -> 30 -> 70
        newLinkedList.printList();
    }

}

