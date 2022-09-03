import org.junit.jupiter.api.*;
import org.junit.platform.commons.util.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class SortArrayTest {
    SortArray sut;

    @BeforeAll
    static void setup(){
        System.out.println("All tests started");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("Test started");
    }

    @Test
    void sortArrTest() {
        int[] expected = new int[]{-1, 0, 1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(expected, sut.sortArr(new int[]{0, 6, 4, 3, -1, 1, 5, 2}));
    }

    @Test
    void averageArrTest() throws Exception {
        int expected = 5;
        Assertions.assertEquals(expected, sut.averageArr(new int[]{5, 5}));
    }

    @Test
    void divideByZeroTest () {
        int[] input = {};
        var expected = ArithmeticException.class;

        Assertions.assertThrowsExactly(expected, () -> sut.averageArr(input));
    }

    @AfterEach
    void tearThis(){
        System.out.println("Test complited");
    }

    @AfterAll
    static void tear(){
        System.out.println("All tests complited");
    }
}


