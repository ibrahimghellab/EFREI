public class Main {
    public static void main(String[] args) {

        StackArray p = new StackArray(); // init_stack()

        p.push_stack(5);
        p.push_stack(6);
        p.push_stack(7);

        p.display_stack();

        int val;

        val = p.pop_stack();
        System.out.println("popped value = " + val);
        p.display_stack();

        val = p.pop_stack();
        System.out.println("popped value = " + val);
        p.display_stack();

        val = p.pop_stack();
        System.out.println("popped value = " + val);
        p.display_stack();

        val = p.pop_stack();
        System.out.println("popped value = " + val);
        p.display_stack();
    }
}
