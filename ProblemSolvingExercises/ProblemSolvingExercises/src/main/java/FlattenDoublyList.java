public class FlattenDoublyList {

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    ;

    public static void main(String args[]) {
        //flatten()
    }
}

   /* public static Node flatten(Node head) {
        Node curr=head;Node next=null;
        while(curr!=null){
            if(curr.child!=null){
                next=curr.next;
                curr.next=child;
                child.prev=curr;
                curr=curr.next;
            }
        }
        curr.next=next;
        next.prev=curr;
    }
    return head;
}

    */
