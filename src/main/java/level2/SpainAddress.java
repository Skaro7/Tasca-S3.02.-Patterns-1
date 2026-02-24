package level2;

public class SpainAddress implements Address {
    private String street;
    private String city;
    private String postalCode;

    public SpainAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String format() {
        return street + ", " + postalCode + " " + city;
    }
}
