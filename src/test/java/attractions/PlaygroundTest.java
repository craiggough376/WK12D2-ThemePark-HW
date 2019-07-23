package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(12, 150.00, 15.00);
        visitor2 = new Visitor(16, 150.00, 5.00);

    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void visitorYoungEnough () {
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void visitorTooOld() {
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
