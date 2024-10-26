package completeReference.chapter7.accessmodifier;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StackTest {

    Stack stack;
    @BeforeAll
    void setUp() {
        stack = new Stack();
    }

    @Test
    void push() {
        stack.push(2);
        assertEquals(2, stack.stack[0]);
    }


    @Test
    void pop() {
    }
}