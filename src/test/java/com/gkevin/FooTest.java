package com.gkevin;

import org.junit.Test;
import static org.junit.Assert.*;
public class FooTest {
    @Test public void testLoop() {
        Foo f = new Foo();
        assertEquals(1000000, f.loop());
    }
}
