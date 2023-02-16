package md.gradledemo.library1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class Library1Test
{
    @Test
    void test()
    {
        assertDoesNotThrow(Library1::method1);
    }
}
