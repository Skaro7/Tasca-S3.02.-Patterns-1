package level2;

public class SpainPhone implements Phone {
    private String phone;

    public SpainPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String format() {
        return "+34 " + phone;
    }
}
