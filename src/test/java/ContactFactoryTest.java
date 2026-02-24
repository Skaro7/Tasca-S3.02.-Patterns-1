import level2.Address;
import level2.ContactFactory;
import level2.SpainAddress;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactFactoryTest {

    @Test
    void testSpainAddressFormat() {
        Address addr = new SpainAddress("Carrer Major 34", "Barcelona", "08001");
        assertEquals("Carrer Major 34, 08001 Barcelona", addr.format());
    }
}
