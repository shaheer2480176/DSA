package Linkedlist;

class Node{
    int data;
    Node next;


    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Linkedlist{
    Node head;//head is first node
    public void addfirst(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;//if linkedlist is empty new node will be automatically become head
            return;
        }
         newnode.next=head;
        head=newnode;
    }
    public void addlast(int data){
        Node newnode=new Node(data);
        if (head==null){ //agar khali hai to nayai walai ko head banado
            head=newnode;
            return;
        }
        Node currentnode=head;
        while (currentnode.next!=null){
            currentnode=currentnode.next;
        }
        currentnode.next=newnode;
    }
    public void deletefirst(){

        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        head=head.next;
    }
    public void deletelast(){
        if (head==null){
            System.out.println("The list is empty(KHali)");
            return;
        }
        if (head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node last=head.next;
        while (last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;


    }
    public void deletegreaterthan(int limit){
        while (head!=null&&head.data>limit){
            head=head.next;
        }
        Node currentnode=head;
        while (currentnode!=null&&currentnode.next!=null){
            if (currentnode.next.data>limit){
                currentnode.next=currentnode.next.next;
            }else {
                currentnode=currentnode.next;
            }
        }



    }
    public int search(int value){
        int index=0;
        Node current=head;
        while (current!=null){
            if (current.data==value) {
                return index;
            }
                current=current.next;
                index++;
            }
            return  -1;
        }



    public void printlist(){
        Node currentnode=head;
        while (currentnode!=null){
    System.out.print(currentnode.data+"->");
    currentnode=currentnode.next;
        }
        System.out.println("Null ");

    }



}
public class makinglinkedlist {
    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
        list.addfirst(12);
        list.addlast(13);
        list.deletefirst();
        list.printlist();
        list.deletefirst();
    }
}