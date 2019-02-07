package org.springframework.samples.petclinic.sfg;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 2019-02-07.
 */
@Service
public class HearingInterpreter {

    private final WordProducer wordProducer;

    public HearingInterpreter(WordProducer wordProducer) {
        this.wordProducer = wordProducer;
    }

    public String getWord(){
        return wordProducer.sayWord();
    }
}
