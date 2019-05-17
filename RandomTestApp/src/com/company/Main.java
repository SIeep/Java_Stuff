package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = -0;
        String myName = "Brandon";
        System.out.println(myName);
        String[] nicknames = {
                "Thug Nasty",
                "Slim Shady",
                "Lil Bambi",
                "B-Rad"
        };

        for (String name : nicknames) {
            System.out.printf("Hi, my name is %s but you can call me %s if you'd like!%n", myName, nicknames[i]);
            i++;
        }

        Dog dog = new Dog("fido");
        System.out.printf("I would also like you to know that I do NOT have a dog named %s", dog.getName());
    }
}
