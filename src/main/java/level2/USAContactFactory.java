package level2;

class USAContactFactory implements ContactFactory{
    private String street, city, stateZip, phone;

    public USAContactFactory(String street, String city, String stateZip, String phone) {
        this.street = street;
        this.city = city;
        this.stateZip = stateZip;
        this.phone = phone;
    }

    @Override
    public Address createAddress() {
        return new USAAddress(street, city, stateZip);
    }

    @Override
    public Phone createPhone() {
        return new USAPhone(phone);
    }
}
