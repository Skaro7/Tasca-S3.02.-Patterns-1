package level2;

public class USAAddress implements Address {
    private String street, city, stateZip;

    public USAAddress(String street, String city, String stateZip) {
        this.street = street.trim();
        this.city = city;
        this.stateZip = stateZip;
    }

    @Override
    public String format() {
        return street + ", " + city + ", " + stateZip;
    }
}
