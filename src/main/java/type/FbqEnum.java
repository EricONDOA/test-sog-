package type;

/**
 * Created by Eric on 24/05/2016.
 */
public enum FbqEnum {

    FOO ("Foo", 3, '3'),
    BAR ("Bar", 5, '5'),
    QIX ("Qix", 7, '7');


    private String value;
    private Integer number;
    private char aChar;


    FbqEnum(String value, int number, char aChar) {
        this.value = value;
        this.number = number;
        this.aChar = aChar;
    }

    public String getValue() {
        return value;
    }

    public int getNumber() {
        return number;
    }

    public char getaChar() {
        return aChar;
    }


}
