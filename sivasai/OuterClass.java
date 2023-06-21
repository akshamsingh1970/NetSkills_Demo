import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OuterClass {
    class linkedList{
        int num;
        linkedList next;
        linkedList(int n){
            num = n;
            next = null;
        }
    }

    public static void main(String []args){
        int num = (int)(Math.random()*(5)+5);
        OuterClass obj = new OuterClass();
        OuterClass.linkedList lk = obj.new linkedList(num);
        OuterClass.linkedList head = lk;
        OuterClass.linkedList current = head;

        int limit = 5;
        for(int i=1;i<limit;i++){
            num = (int)(Math.random()*(15)+5);
            lk.next = obj.new linkedList(num);
            lk = lk.next;
        }

        while(current != null){
            System.out.println(current.num);
            current = current.next;
        }

        System.out.println();

        current = head;
        OuterClass.linkedList reverseHead = obj.new linkedList(0);
        OuterClass.linkedList prev = null;
        OuterClass.linkedList next;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        reverseHead = prev;

        while(reverseHead != null){
            System.out.println(reverseHead.num);
            reverseHead = reverseHead.next;
        }
        obj.palindrome();
        System.out.println();
        obj.removeDuplicates();
        System.out.println();
        obj.RemoveOddIndices();
        System.out.println();
        obj.DetectAndRemoveLoop();
        System.out.println();
    }

    public void palindrome(){
        OuterClass obj = new OuterClass();
        OuterClass.linkedList linkedList = new linkedList(0);
        OuterClass.linkedList head = linkedList;
        int limit = 5;
        for(int i=0;i<limit;i++){
            int num = (int)(Math.random()*(5)+1);
//            int num = 1;
            linkedList.num = num;
            if(i != limit-1) {
                linkedList.next = obj.new linkedList(0);
                linkedList = linkedList.next;
            }
        }
        OuterClass.linkedList currrent = head;
        String forward = "";
        while(currrent != null){
            forward+=currrent.num;
            currrent = currrent.next;
        }
        StringBuilder sb = new StringBuilder(forward);
        String reverse = "";
        reverse = sb.reverse().toString();
        if(reverse.compareTo(forward) == 0){
            System.out.println(forward+" linked list is palindromic");
        }
        else{
            System.out.println(forward+" linked list is NOT palindromic");
        }
    }

    public void removeDuplicates(){
        OuterClass obj = new OuterClass();
        OuterClass.linkedList linkedList = new linkedList(0);
        OuterClass.linkedList head = linkedList;
        int limit = 10;
        for(int i=0;i<limit;i++){
            int num = (int)(Math.random()*(5)+1);
            linkedList.num = num;
            if(i != limit-1) {
                linkedList.next = obj.new linkedList(0);
                linkedList = linkedList.next;
            }
        }
        OuterClass.linkedList current = head;
        while(current != null){
            System.out.print(current.num+" ");
            current = current.next;
        }

        System.out.println();

        current = head;
        OuterClass.linkedList index = obj.new linkedList(0);
        OuterClass.linkedList temp = obj.new linkedList(0);

        while (current != null) {
            temp = current;
            index = current.next;
            while (index != null) {
                if (current.num == index.num) {
                    temp.next = index.next;
                } else {
                    temp = index;
                }
                index = index.next;
            }
            current = current.next;
        }

        current = head;
        while(current != null){
            System.out.print(current.num+" ");
            current = current.next;
        }
        System.out.println();
    }

    public void RemoveOddIndices(){
        OuterClass obj = new OuterClass();
        OuterClass.linkedList linkedList = new linkedList(0);
        OuterClass.linkedList head = linkedList;
        int limit = 10;
        for(int i=0;i<limit;i++){
            int num = (int)(Math.random()*(45)+5);
            linkedList.num = num;
            if(i != limit-1) {
                linkedList.next = obj.new linkedList(0);
                linkedList = linkedList.next;
            }
        }
        OuterClass.linkedList current = head;
        int idx = 1;
        while(current != null){
            System.out.print(idx+":"+current.num+" ");
            current = current.next;
            idx++;
        }

        System.out.println();

        head = head.next;
        OuterClass.linkedList evenNode = obj.new linkedList(0);
        OuterClass.linkedList oddNode = obj.new linkedList(0);

        if(head != null) {
            evenNode = head;
            oddNode = head.next;
            while (evenNode != null && oddNode != null) {
                evenNode.next = oddNode.next;
                evenNode = evenNode.next;
                if(evenNode != null){
                    oddNode = evenNode.next;
                }
            }
        }

        current = head;
        while(current != null){
            System.out.print(current.num+" ");
            current = current.next;
        }
        System.out.println();
    }

    public void DetectAndRemoveLoop(){
        OuterClass obj = new OuterClass();
        OuterClass.linkedList linkedList = new linkedList(0);
        OuterClass.linkedList head = linkedList;
        int limit = 10;
        int k = 5;

        for(int i=0;i<limit;i++){
            int num = (int)(Math.random()*(45)+5);
            linkedList.num = num;
            if(i != limit-1) {
                linkedList.next = obj.new linkedList(0);
                linkedList = linkedList.next;
            }

        }

        //introducing the loop
        OuterClass.linkedList current = head;
        OuterClass.linkedList temp = head;
        int idx = 1;
        while (idx < k) {
            temp = temp.next;
            idx++;
        }

        OuterClass.linkedList joint_point = temp;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = joint_point;

        current = head;
//        while(current != null){
//            System.out.print(current.num+" ");
//            current = current.next;
//        }
//        System.out.println();

        //removing the loop
        HashMap<OuterClass.linkedList,Boolean> visited = new HashMap<OuterClass.linkedList, Boolean>();
        while(current != null && current.next != null && !(visited.containsKey(current.next))){
            visited.put(temp, true);
            current = current.next;
        }

        temp.next = null;

        current = head;
        while(current != null){
            System.out.print(current.num + " ");
            current = current.next;
        }
        System.out.println();
    }

}
