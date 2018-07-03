package javax.ws.rs.ext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * {@link javax.ws.rs.ext.RuntimeDelegate} unit tests.
 *
 * @author Niklas Mehner
 */
public class RuntimeDelegateTest {

    @Test
    public void testGetInstanceFailsIfNoImplementationAvailable() {
        try {
            RuntimeDelegate.getInstance();
            fail();
        } catch (RuntimeException e) {
            assertEquals(
                         "java.lang.ClassNotFoundException: Provider for javax.ws.rs.ext.RuntimeDelegate cannot be found",
                         e.getMessage());
        }
    }
}
