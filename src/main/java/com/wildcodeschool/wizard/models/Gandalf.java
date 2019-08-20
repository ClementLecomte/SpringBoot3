package com.wildcodeschool.wizard.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gandalf")
public class Gandalf implements WizardInterface {

    private Outfit outfit;

    @Autowired
    public Gandalf (Outfit myOutfit) {
        outfit = myOutfit;
    }

    @Override
    public String giveAdvice() {
        return "All we have to decide is what to do with the time that is given us.";
    }

    @Override
    public String changeDress() {
        return outfit.dress();
    }
}
