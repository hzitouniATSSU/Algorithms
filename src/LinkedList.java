import org.w3c.dom.Node;

public class LinkedList {
    Node head;
    static class Node {
        Node next;

        int value;
        Node (int v){
            this.value =v;
            next=null;
        }
    }
    void mthToLast(int m){
        int length=0;
        Node temp=head;
    while (temp !=null){
        temp=temp.next;
        length++;
    }
    if (length<m)
        return ;

    temp=head;

    for (int i =1;i<length-m+1;i++){
        temp=temp.next;
    }

        System.out.println( m+"th to last element is " + temp.value);

    }
    public void push(int new_value){
        Node new_node=new Node(new_value);
        new_node.next=head;
        head=new_node;
    }
    public void printList(){
        Node n=head;
        while (n!=null){
            System.out.print(n.value +" ->" );
            n=n.next;
        }
    }
    public static void main(String[]args){
        LinkedList list1=new LinkedList();
        list1.push(2);
        list1.push(1);
        list1.push(8);
        list1.push(7);
        list1.push(4);

        list1.printList();
        list1.mthToLast(4);
    }

}
