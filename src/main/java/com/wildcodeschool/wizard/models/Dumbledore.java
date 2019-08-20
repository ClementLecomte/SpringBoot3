package com.wildcodeschool.wizard.models;

public class Dumbledore implements  WizardInterface {


    @Override
    public String giveAdvice() {
        return "It matters not what someone is born, but what they grow to be.";
    }

    @Override
    public String changeDress() {
        return null;
    }
}
