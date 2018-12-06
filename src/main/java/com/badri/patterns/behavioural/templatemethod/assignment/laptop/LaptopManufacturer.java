package com.badri.patterns.behavioural.templatemethod.assignment.laptop;

import com.badri.patterns.behavioural.templatemethod.assignment.ComputerManufacturer;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class LaptopManufacturer extends ComputerManufacturer {


    public void addHardDisk() {

        System.out.println("Laptop : add hard disk");
    }

    public void addRAM() {

        System.out.println("Laptop : add RAM");
    }

    public void addKeyboard() {

        System.out.println("Laptop : add Keyboard");
    }
}
