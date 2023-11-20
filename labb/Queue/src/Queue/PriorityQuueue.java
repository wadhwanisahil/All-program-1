package Queue;
class Node1{
	int data;
	Node1 next;
	Node1(int data){
		this.data=data;
		this.next=null;
	}
}
public class PriorityQuueue {

    Node1 head;

    public void add(int data) {
        Node1 newNode = new Node1(data);

        if (head == null) {
            head = newNode;

        } else if (head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        } else {

            Node1 temp = head;
            while (temp != null) {

                if (temp.next == null) {
                    if (temp.data >= newNode.data) {
                        newNode.next = temp;

                    } else {
                        temp.next = newNode;
                    }
                    return;

                }

                if (newNode.data >= temp.data && newNode.data <= temp.next.data) {

                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;

                } else {
                    temp = temp.next;
                }

            }
        }
    }

    public int remove(){

        if(head==null){
            return Integer.MIN_VALUE;
        }
        int x=head.data;
        head=head.next;
        return x;
    }

    public void print() {

        if (head == null) {
            return;
        }
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        PriorityQuueue pq = new PriorityQuueue();
        pq.add(6);
        pq.add(3);
        pq.add(5);
        pq.add(1);
        pq.add(2);
        pq.add(4);

        pq.print();
        pq.remove();
        pq.remove();
        pq.print();
    }

}
