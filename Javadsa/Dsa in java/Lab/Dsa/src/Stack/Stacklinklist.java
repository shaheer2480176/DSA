package Stack;

class StackLinkedList {
    private Node top;

    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    // push
    public void push(int value) {

        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack");
    }

    // pop
    public int pop() {
        if(isEmpty()) {
            return -1;
        }
        Node temp = top;
        top = top.next;

        return temp.data;
    }

    // peek
    public int peek(){
        if (isEmpty()) {
            return -1;
        }

        return top.data;
    }

    // check empty
    public boolean isEmpty() {
        return top == null;
    }

    // print stack
    public void printStack() {
        Node current = top;
        System.out.print("Stack elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    //another print function
    public void printStack2(){
        while(!isEmpty()) {

            System.out.println(peek());

            pop();
        }
    }

}
