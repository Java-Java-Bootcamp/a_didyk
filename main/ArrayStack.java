public class ArrayStack {

    private int[] stack = new int[10];
    private static int count;

    public void push(int a) {
        stack[count] = a;
        count++;
    }

    public int pop() {
        if(count == 0) {
            return -1;
        }
        int a = stack[count - 1];
        count--;
        return a;
    }

}
