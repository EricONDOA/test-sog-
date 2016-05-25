package metier;

import org.springframework.stereotype.Component;
import type.FbqEnum;

/**
 * Created by Eric on 24/05/2016.
 */

@Component
public class ValidatorRules {

    public ValidatorRules() {
    }

    public String computeNumber(Integer value) {
        StringBuilder result = new StringBuilder();

        if (value != 0 && value > 0) {

            for (FbqEnum fbqEnum : FbqEnum.values()) {
                checkMultiplicationRule(fbqEnum, result, value);
            }

            String sValue = value.toString();

            for (int i = 0; i < sValue.length(); i++) {

                char pos = sValue.charAt(i);

                for (FbqEnum fbqEnum : FbqEnum.values()) {
                    checkPresenceRule(fbqEnum, result, pos);
                }
            }

        }
        if (result.toString().isEmpty()) {
            result.append(value);
        }

        return result.toString();
    }

    /**
     * This method calculates if the number(value) is divisible by 3,5 or 7
     */
    private void checkMultiplicationRule(FbqEnum fbqEnum, StringBuilder result, Integer value) {
        if (value % fbqEnum.getNumber() == 0) {
            result.append(fbqEnum.getValue());
        }

    }


    /**
     * This method check if  3, 5 or 7 is present in the number
     */
    private void checkPresenceRule(FbqEnum fbqEnum, StringBuilder result, char value) {
        if (value == fbqEnum.getaChar()) {
            result.append(fbqEnum.getValue());
        }

    }

}
