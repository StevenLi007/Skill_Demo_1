import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testSubtract() {
        int difference = SkillDemo.subtract(5, 3);
        assertEquals(2, difference);
    }
}