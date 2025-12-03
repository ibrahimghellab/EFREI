public class StackLinkedList {

    Node top;

    StackLinkedList() {
        this.top = null;
    }

    void push_stack(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    int pop_stack() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = top.val;
        top = top.next;
        return value;
    }

    int top_stack() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.val;
    }

    void display_stack() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack (top -> bottom):");

        Node temp = top;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
