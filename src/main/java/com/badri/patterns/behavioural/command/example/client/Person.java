package com.badri.patterns.behavioural.command.example.client;

import com.badri.patterns.behavioural.command.example.OffCommand;
import com.badri.patterns.behavioural.command.example.OnCommand;
import com.badri.patterns.behavioural.command.example.RemoteControl;
import com.badri.patterns.behavioural.command.example.reciever.Television;

/**
 * @author badrikant.soni on 17/12/18,2018
 */
public class Person {

    public static void main(String[] args) {

        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl();

        OnCommand onCommand = new OnCommand(television);
        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();

        OffCommand offCommand = new OffCommand(television);
        remoteControl.setCommand(offCommand);
        remoteControl.pressButton();
    }
}
