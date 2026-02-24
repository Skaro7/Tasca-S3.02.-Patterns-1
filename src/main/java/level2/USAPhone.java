package level2;

public class USAPhone implements Phone {
    private String number;

    public USAPhone(String number) {
        this.number = number;
    }

    @Override
    public String format() {
        return "+1 " + number;
    }
}
