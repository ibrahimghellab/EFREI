public class StaticStack implements Stack{
    final static int MAX_ELEMENT = 100;
    int[] stack;
    int nb_elem;

    @Override
    public void init_stack() {
        nb_elem = 0;
        stack = new int[MAX_ELEMENT];
    }

    @Override
    public boolean push_stack(int val) {
        if(nb_elem == MAX_ELEMENT){
            return false;
        }
        stack[nb_elem] = val;
        nb_elem++;
        return true;
    }

    @Override
    public int pop_stack() {
        if(nb_elem == 0){
            return -1;
        }
        int val = stack[nb_elem -1];
        nb_elem--;
        return val;
    }

    @Override
    public int top_stack() {
        if(nb_elem == 0){
            return -1;
        }
        return stack[nb_elem -1];

    }

    @Override
    public void display_stack() {
        System.out.print("[");
        for(int i = 0 ; i < nb_elem; i++){
            System.out.print(" "+stack[i]  + " ");
        }
        System.out.print("]");
    }
}
