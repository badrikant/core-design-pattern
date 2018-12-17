package com.badri.patterns.behavioural.command.example;

import com.badri.patterns.behavioural.command.example.reciever.Television;

/**
 * @author badrikant.soni on 17/12/18,2018
 */
public class OnCommand implements Command {

    Television television;

    public OnCommand(Television television) {
        this.television = television;
    }

    public void execute() {

        television.on();

    }
}
