package com.wildcodeschool.wizard.controllers;

import com.wildcodeschool.wizard.models.Gandalf;
import com.wildcodeschool.wizard.models.WizardInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public void start() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        WizardInterface myGandalf = context.getBean("gandalf", WizardInterface.class);
        WizardInterface myDumbledore = context.getBean("dumbledore", WizardInterface.class);
        context.close();

        System.out.println("");
        System.out.println("******************");
        System.out.println(myGandalf.giveAdvice());
        System.out.println(myGandalf.changeDress());
        System.out.println("******************");
        System.out.println(myDumbledore.giveAdvice());
        System.out.println(myDumbledore.changeDress());
    }
}
