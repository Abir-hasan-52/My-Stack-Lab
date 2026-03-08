package stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    void testPush() {
        MyStack stack = new MyStack();
        stack.push(5);

        assertEquals(1, stack.getSize());
    }

    @Test
    void testTop() {
        MyStack stack = new MyStack();
        stack.push(10);

        assertEquals(10, stack.top());
    }

    @Test
    void testPop() {
        MyStack stack = new MyStack();
        stack.push(20);
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test
    void testIsEmpty() {
        MyStack stack = new MyStack();

        assertTrue(stack.isEmpty());
    }
}