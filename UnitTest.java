import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HangManClass_ProgramTest {

     public HangManClass_ProgramTest() {
    }

    @Test
    public void tM() {
        System.out.println("main");
        String[] args = null;
        HangManClass.main(args);
        fail("The test case is a prototype.");
    }
    @Test
    public void tTS() {
        System.out.println("toString");
        HangManClass ii = new HangManClass();
        String eR = "";
        String rr = ii.toString();
        assertEquals(eR, rr);    fail("The test case is a prototype.");
    }


    @Test
    public void tRG() {
        System.out.println("Random Generator");
        HangManClass ii = new HangManClass();
        ii.guessWord(ii.generateRandomWord());
        fail("The test case is a prototype.");
    }
}


}
