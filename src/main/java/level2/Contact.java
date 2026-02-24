package level2;

public class Contact {
    private Address address;
    private Phone phone;

    public Contact(ContactFactory factory) {
        this.address = factory.createAddress();
        this.phone = factory.createPhone();
    }

    @Override
    public String toString() {
        return "Address: " + address.format() + " | Phone: " + phone.format();
    }
}
