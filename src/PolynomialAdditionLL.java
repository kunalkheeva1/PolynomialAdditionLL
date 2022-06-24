public class PolynomialAdditionLL {
    static class Node{
        int coeff, pow;
        Node next = null;
        Node(int coeff, int pow){
            this.coeff = coeff;
            this.pow = pow;
            this.next = null;

        }
    }
        public static Node polynomialAdditionLL(Node p1, Node p2){
        //if null then return the other one
        if(p1 == null){
            return p2;
        }
        if(p2 == null){
            return p1;
        }
        // nodes , one to travel thru
        Node head = new Node(0,0);
        Node temp = head;

        //until they become null
        while( p1 != null && p2 !=null){

            //if they have same power
            if(p1.pow == p2.pow){
                // then add their coefficients
                p1.coeff = p1.coeff + p2.coeff;
                //and update the pointers and move forward
                temp.next = p1;
                temp = temp.next;
                p1 = p1.next;
                p2 = p2.next;

            }
            //if p1.pow is greater then we move to the smaller power of p1
            else if (p1.pow> p2.pow){
                temp.next = p1;
                temp = temp.next;
                p1 = p1.next;
            }
            //if p2 has greater power then we move to the next smaller power
            else {
                temp.next = p2;
                temp = temp.next;
                p2 = p2.next;

            }
        }
        //after the loop if there is any remaining element in any of the list
            //then just update the new list with those elements
        if(p1 != null){
            temp.next =p1;
        }
        if(p2 !=null){
            temp.next = p2;

            //and return head.next
        }return head.next;

        }

    public static void main(String[] args) {

    }
}
