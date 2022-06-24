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

        if(p1 == null){
            return p2;
        }
        if(p2 == null){
            return p1;
        }
        Node head = new Node(0,0);
        Node temp = head;
        while( p1 != null && p2 !=null){
            if(p1.pow == p2.pow){

                p1.coeff = p1.coeff + p2.coeff;
                temp.next = p1;
                temp = temp.next;
                p1 = p1.next;
                p2 = p2.next;

            }
            else if (p1.pow> p2.pow){
                temp.next = p1;
                temp = temp.next;
                p1 = p1.next;
            }
            else {
                temp.next = p2;
                temp = temp.next;
                p2 = p2.next;

            }
        }
        if(p1 != null){
            temp.next =p1;
        }
        if(p2 !=null){
            temp.next = p2;

        }return head.next;

        }

    public static void main(String[] args) {

    }
}
