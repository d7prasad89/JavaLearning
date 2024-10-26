package completeReference.chapter6;

public class Stack {
    int[] stack = new int[10];
    public int tos;

    public Stack() {
        tos = -1;
    }

    public void push(int i) {
        if(tos == 9) {
            System.out.println("Stack is Full");
        }
        stack[++tos] = i;
    }

    public int pop() {
        if(tos == -1) {
            System.out.println("Stack is empty");
        }
        return stack[tos--];
    }

}
