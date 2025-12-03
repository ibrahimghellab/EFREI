public class StackArray {

    static final int MAX = 100;

    int[] stack;
    int top;

    StackArray() {
        stack = new int[MAX];
        this.top = -1; // pile vide
    }

    void push_stack(int data) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = data;
    }

    int pop_stack() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = stack[top];
        top--;
        return value;
    }

    int top_stack() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    void display_stack() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack (top -> bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
