package com.badri.patterns.behavioural.templatemethod.assignment.desktop;

import com.badri.patterns.behavioural.templatemethod.assignment.ComputerManufacturer;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class DesktopManufacturer extends ComputerManufacturer {


    public void addHardDisk() {

        System.out.println("Desktop : add hard disk");
    }

    public void addRAM() {

        System.out.println("Desktop : add RAM");
    }

    public void addKeyboard() {

        System.out.println("Desktop : add Keyboard");
    }
}
