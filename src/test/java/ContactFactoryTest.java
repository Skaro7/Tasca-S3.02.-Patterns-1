import level2.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactFactoryTest {

    @Test
    void testSpainContact() {
        ContactFactory factory = new SpainContactFactory(
                "Carrer Major 34", "Barcelona", "08001", "123456789"
        );
        Contact contact = new Contact(factory);
        assertEquals("Address: Carrer Major 34, 08001 Barcelona | Phone: +34 123456789",
                contact.toString());
    }

    @Test
    void testSpainAddressFormat() {
        Address address = new SpainAddress("Carrer Major 34", "Barcelona", "08001");
        assertEquals("Carrer Major 34, 08001 Barcelona", address.format());
    }

    @Test
    void testUSAContact() {
        ContactFactory factory = new USAContactFactory(
                " 154 5th Avenue", "New York", "NY 10001", "987654321"
        );
        Contact contact = new Contact(factory);
        assertEquals("Address: 154 5th Avenue, New York, NY 10001 | Phone: +1 987654321",
                contact.toString());
    }

    @Test
    void testUSAPhoneFormat() {
        Phone phone = new USAPhone("212555000");
        assertEquals("+1 212555000", phone.format());
    }
}

