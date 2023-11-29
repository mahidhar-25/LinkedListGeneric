package com.bridgelabz.datastructuregeneric;

public class LinkedListApplication {

    public static void main(String[] args) {

        System.out.println("!!! Welcome the linked list generic problem !!!");

        //initialized a integer link list
        LinkedlistGeneric<Integer> newLinkedList = new LinkedlistGeneric<>();
        // usecase 3
        newLinkedList.insertAtBegin(70);
        newLinkedList.printList();
        newLinkedList.insertAtBegin(30);
        //30 -> 70
        newLinkedList.printList();
        newLinkedList.insertAtBegin(56);
        //56 -> 30 -> 70
        newLinkedList.printList();

        //use case 2
        newLinkedList.insertAtEnd(56);
        //56 -> 30 -> 70 -> 56
        newLinkedList.printList();
        newLinkedList.insertAtEnd(30);
        //56 -> 30 -> 70 -> 56-> 30
        newLinkedList.printList();
        newLinkedList.insertAtEnd(70);
        //56 -> 30 -> 70 -> 56 -> 30 -> 70
        newLinkedList.printList();

        //usecase 4
        newLinkedList.insertByPosition(100 , 3);
        //56 -> 30 -> 70 -> 100 -> 56 -> 30 -> 70
        newLinkedList.printList();
//usecase 5
        System.out.println("deleted item first is : " + newLinkedList.pop());
        //30 -> 70 -> 100 -> 56 -> 30 -> 70
        newLinkedList.printList();
        //usecase 6
        System.out.println("deleted item last is : " + newLinkedList.popLast());
        //30 -> 70 -> 100 -> 56 -> 30
        newLinkedList.printList();
        //usecase 7
        if(newLinkedList.search(100) != null){
            System.out.println("element is present in linked list");
        }
        //usecase 8
        Node<Integer>node = newLinkedList.search(100);
        newLinkedList.insertAfterNode(node , 57);
        newLinkedList.printList();
//usecase 9
        newLinkedList.popByKey(100);
        newLinkedList.printList();

        //usecase 10
        System.out.println("\nOrdered linkedlist : ");
        LinkedlistGeneric<Integer> newOrderedLinkedList = new LinkedlistGeneric<>();

        newOrderedLinkedList.insertByOrder(100);
        newOrderedLinkedList.insertByOrder(40);
        newOrderedLinkedList.printList();
        newOrderedLinkedList.insertByOrder(50);
        newOrderedLinkedList.printList();
        newOrderedLinkedList.insertByOrder(90);
        newOrderedLinkedList.printList();


    }





}
