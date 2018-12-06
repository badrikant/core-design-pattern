package com.badri.patterns.behavioural.templatemethod.assignment;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public abstract class ComputerManufacturer {

    public void buildComputer(){
        addHardDisk();
        addKeyboard();
        addRAM();
        System.out.println("build computer");
    }

    public abstract void addHardDisk();
    public abstract void addRAM();
    public abstract void addKeyboard();
}
