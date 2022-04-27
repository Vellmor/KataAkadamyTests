package JavaCore.Module7.Task_7_2_12;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    protected static ByteArrayOutputStream output;
    private static PrintStream oldOut;
    private static InputStream oldIn;

    @BeforeAll
    static void setUpStreams() {
        oldOut = System.out;
        oldIn = System.in;
    }

    @BeforeEach
    void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    void cleanUp() {
        System.setOut(oldOut);
        System.setIn(oldIn);
    }

    @Test
    void test1() {
        System.setIn(new ByteArrayInputStream("Мама мыла-мыла-мыла раму!".getBytes()));
        Solution.main(new String[]{});
        assertEquals("мыла\nмама\nраму\n", output.toString());
    }

    @Test
    void test2() {
        System.setIn(new ByteArrayInputStream("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.".getBytes()));
        Solution.main(new String[]{});
        assertEquals("consectetur\nfaucibus\nipsum\nlorem\nadipiscing\namet\ndolor\neget\nelit\nmi\n", output.toString());
    }
}