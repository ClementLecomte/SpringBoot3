package com.wildcodeschool.wizard.controllers;

import com.wildcodeschool.wizard.models.Gandalf;
import com.wildcodeschool.wizard.models.WizardInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public void start() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        WizardInterface dumbledore = context.getBean("dumbledore", WizardInterface.class);
        WizardInterface gandalf = context.getBean("gandalf", WizardInterface.class);
        context.close();

        System.out.println("");
        System.out.println("******************");
        System.out.println(dumbledore.giveAdvice());
        System.out.println(dumbledore.changeDress());
        System.out.println("******************");
        System.out.println(gandalf.giveAdvice());
        System.out.println(gandalf.changeDress());
        System.out.println("******************");

    }
}
