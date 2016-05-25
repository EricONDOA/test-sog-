package type;

/**
 * Created by Eric on 24/05/2016.
 *
 */
public class Fbq {

    private int number;
    private String stringValue;

    public Fbq(int number, String value) {
        this.number = number;
        this.stringValue = value;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getValue() {
        return stringValue;
    }

    public void setValue(String value) {
        this.stringValue = value;
    }

    @Override
    public String toString() {
        return "[number=" + number + ", ==> " + stringValue + "]";
    }
}
