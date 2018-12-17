package com.badri.patterns.behavioural.command.example;

import com.badri.patterns.behavioural.command.example.reciever.Television;

/**
 * @author badrikant.soni on 17/12/18,2018
 */
public class OffCommand implements Command {

    Television television;

    public OffCommand(Television television) {
        this.television = television;
    }

    public void execute() {

        television.off();

    }
}
