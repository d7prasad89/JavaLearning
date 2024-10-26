package completeReference.chapter7.accessmodifier;

public class Stack {

    private int tos = 0;
     int[] stack = new int[10];

    void push(int i) {
        if(tos == 10) {
            System.out.println("Stack Overflow error");
        } else {
            stack[tos] = i;
            tos ++;
        }
    }

    void pop() {
        if(tos <0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stack[tos]);
            tos --;
        }
    }
}
