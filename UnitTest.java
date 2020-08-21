import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HangManClassTest {

    public HangManClassTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class HangManClass.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HangManClass.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HangManClass.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HangManClass instance = new HangManClass();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testRandomGenerator() {
        System.out.println("Random Generator");
        HangManClass instance = new HangManClass();
        instance.guessWord(instance.generateRandomWord());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
