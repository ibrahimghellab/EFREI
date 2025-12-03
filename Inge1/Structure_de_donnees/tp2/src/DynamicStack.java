public class DynamicStack implements Stack{

    Node head;

    @Override
    public void init_stack() {
        head = null;
    }

    @Override
    public boolean push_stack(int val) {
        head = new Node(val,head);
        return true;
    }

    @Override
    public int pop_stack() {
        if(head == null){
            return -1;
        }
        int value = head.val;
        head = head.next;
        return value;
    }

    @Override
    public int top_stack() {
        if (head == null){
            return -1;
        }
        return head.val;
    }

    @Override
    public void display_stack() {
        Node temp = head;
        System.out.print("[ ");
        while (temp != null){
            System.out.print(" " + temp.val +  " ");
            temp = temp.next;
        }
        System.out.print(" ]");
    }
}
