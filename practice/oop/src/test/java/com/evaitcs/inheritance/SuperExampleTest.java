package com.evaitcs.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperExampleTest {

    @Test
    void testSuperKeywordInConstructor() {
        SuperExample obj = new SubSuperExample("Admin");
        assertEquals("Admin", obj.identify());
    }
}
