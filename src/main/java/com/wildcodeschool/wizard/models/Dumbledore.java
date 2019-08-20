package com.wildcodeschool.wizard.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dumbledore")
public class Dumbledore implements  WizardInterface {

    private Outfit outfit;

    @Autowired
    public Dumbledore (Outfit myOutfit) {
        outfit = myOutfit;
    }

    @Override
    public String giveAdvice() {
        return "It matters not what someone is born, but what they grow to be.";
    }

    @Override
    public String changeDress() {
        return outfit.dress();
    }
}
