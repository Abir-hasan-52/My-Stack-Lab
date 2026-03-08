package stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    void testIntegerStack() {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.top());
    }

    @Test
    void testStringStack() {
        MyStack<String> stack = new MyStack<>();

        stack.push("DIU");

        assertEquals("DIU", stack.top());
    }

    @Test
    void testPop() {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(5);
        stack.pop();

        assertTrue(stack.isEmpty());
    }
}