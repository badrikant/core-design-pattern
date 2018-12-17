package com.badri.patterns.behavioural.command.example;

/**
 * @author badrikant.soni on 17/12/18,2018
 */
public class RemoteControl {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
    }
}
