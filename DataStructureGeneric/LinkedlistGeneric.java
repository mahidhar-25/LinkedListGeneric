

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

    public void insertAtEnd(T val){
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

 @desc : Inserts a new element with the specified value at the position specified of the linked list of given type T.

 @param val The value to be inserted of type T.
 @param position the position to be inserted of type integer

 @return No explicit return value.

 */
    public  void insertByPosition(T val , int position){
        Node<T> latestNode = new Node<T>(val);
        Node<T> nextNode = null;
        latestNode.next = null;

        if(head == null){
            head = latestNode;
        }else if(position==0){
            Node<T> temp = head;
            head = latestNode;
            latestNode.next = temp;
        }else{
            Node<T> last = head;
            int counter=1;
            while(last.next != null){
                if(counter == position){
                    nextNode = last.next;
                    break;
                }
                counter++;
                last = last.next;
            }
            if(position > counter){
                System.out.println("your entered position " + position + " is more than the linked list size");
                System.out.println("So we are adding at last");
            }
            last.next = latestNode;
            latestNode.next = nextNode;
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

        newLinkedList.insertAtEnd(56);
        //56 -> 30 -> 70 -> 56
        newLinkedList.printList();
        newLinkedList.insertAtEnd(30);
        //56 -> 30 -> 70 -> 56-> 30
        newLinkedList.printList();
        newLinkedList.insertAtEnd(70);
        //56 -> 30 -> 70 -> 56 -> 30 -> 70
        newLinkedList.printList();

        newLinkedList.insertByPosition(100 , 3);
        //56 -> 30 -> 70 -> 100 -> 56 -> 30 -> 70
        newLinkedList.printList();
    }

}

