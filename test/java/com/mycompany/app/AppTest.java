package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testMain() {
        // Redirect the output to capture the printed message
        String expectedOutput = "Hello World!\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        App.main(new String[]{});

        // Verify the output
        assertEquals(expectedOutput, outputStream.toString());
    }
}
