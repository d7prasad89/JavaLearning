package completeReference;

import completeReference.chapter6.Stack;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack;

    @BeforeAll
    void setUp() {
        stack = new Stack();
        for (int i = 0; i<10; i++) {
            stack.push(i);
        }
    }

    @Test
    void push() {
        stack.push(1);
        assertEquals(9, stack.tos);
    }

    @Test
    void pop() {
        int pop = stack.pop();
        assertEquals(9, pop);
    }
}