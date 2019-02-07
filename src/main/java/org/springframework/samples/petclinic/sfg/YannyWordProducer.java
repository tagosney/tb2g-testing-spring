package org.springframework.samples.petclinic.sfg;

import org.springframework.stereotype.Component;

/**
 * Created by jt on 2019-02-07.
 */
@Component
public class YannyWordProducer implements WordProducer {
    @Override
    public String sayWord() {
        return "Yanny";
    }
}
