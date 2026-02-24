package level2;

public class SpainContactFactory implements ContactFactory {
    private String street, city, postalCode, phone;

    public SpainContactFactory(String street, String city, String postalCode, String phone) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.phone = phone;
    }

    @Override
    public Address createAddress() {
        return new SpainAddress(street, city, postalCode);
    }

    @Override
    public Phone createPhone() {
        return new SpainPhone(phone);
    }

}
