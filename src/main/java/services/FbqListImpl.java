package services;

import metier.ValidatorRules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import type.Fbq;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eric on 24/05/2016.
 */

@Service
public class FbqListImpl implements IFbqList {

    @Autowired
    private ValidatorRules validatorRules;


    public List<Fbq> calculateALL(Integer number) {
        List<Fbq> results = new ArrayList<Fbq>(number);
        for (int i = 1; i < number; i++) {
            results.add(new Fbq(i, validatorRules.computeNumber(i)));
        }

        return results;
    }
}
