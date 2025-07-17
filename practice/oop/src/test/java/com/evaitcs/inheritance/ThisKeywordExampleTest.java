package com.evaitcs.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ThisKeywordExampleTest {

    @Test
    void testThisKeywordSetsField() {
        ThisKeywordExample obj = new ThisKeywordExample("Alice");
        assertEquals("Alice", obj.getName());
    }
}
