
import java.util.*;

class LinkedList{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    LinkedList(){
        head = null;
    }

    void add(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
        }else{
            Node t = head;
            while(t.next != null){
                t = t.next;
            }

            t.next = node;
        }
    }

    void remove(int data){
        if(head != null) {
            if(head.data == data){
                Node t = head;
                head = head.next;

                t = null;
            }else{
                Node t = head;

                while(t.next != null && t.next.data != data){
                    t = t.next;
                }

                if(t.next != null && t.next.data == data){
                    Node temp = t.next;
                    t.next = t.next.next;

                    temp = null;
                }
            }
        }
    }

    void display(){
        Node t = head;

        while(t != null){
            System.out.print(t.data);
            t = t.next;

            if(t != null){
                System.out.print(" -> ");
            }
        }

        System.out.println();
    }

    //TODO: Question 2: Reverse Linked List
    void reverse(){
        Node p, q, r;

        p = q = head;
        r = null;

        while(q != null){
            q = p.next;

            p.next = r;
            r = p;
            p = q;
        }

        head = r;
    }

    Boolean isPalindrome(){
        String forward = "", backward = "";

        Node t = head;
        while(t != null){
            forward = forward + t.data;
            backward = t.data + backward;
            t = t.next;
        }
        System.out.println(forward + " " + backward);
        // return forward == backward;          //! return false , == compares reference
        return forward.equals(backward);     //* return true, compares values
    }
}

class Main{
    public static void main(String args[]){
        LinkedList head = new LinkedList();
        
        Scanner sc = new Scanner(System.in);

        System.out.print("How many nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter: ");
        while(n != 0){
            head.add(sc.nextInt());
            n--;
        }

        head.display();
        head.remove(3);
        head.display();
        head.reverse();
        head.display();
        if(head.isPalindrome()){
            System.out.println("yes its palindrome");
        }else{
            System.out.println("no its not palindrome");
        }
    }
}
