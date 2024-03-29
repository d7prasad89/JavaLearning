package generics.buffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {
    private CircularBuffer buffer = new CircularBuffer(2);

    @Test
    public void shouldPollableElement() {
        assertTrue(buffer.offer(1));
        assertEquals(1, buffer.poll());
        assertNull(buffer.poll());
    }

    @Test
    public void shouldNotofferWhenBufferIsFull(){
        assertTrue(buffer.offer(1));
        assertTrue(buffer.offer(2));
        assertFalse(buffer.offer(3));
    }

    @Test
    public void shouldNotPollWhenBufferIsEmpty() {
        assertNull(buffer.poll());
    }

    @Test
    public void shouldRecycleBuffer() {
        assertTrue(buffer.offer(1));
        assertTrue(buffer.offer(2));
        assertEquals(1, buffer.poll());
        assertTrue(buffer.offer(3));
        assertEquals(2, buffer.poll());
        assertEquals(3, buffer.poll());
        assertNull(buffer.poll());
    }
}