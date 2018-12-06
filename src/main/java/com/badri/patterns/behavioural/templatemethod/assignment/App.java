package com.badri.patterns.behavioural.templatemethod.assignment;

import com.badri.patterns.behavioural.templatemethod.assignment.desktop.DesktopManufacturer;
import com.badri.patterns.behavioural.templatemethod.assignment.laptop.LaptopManufacturer;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class App {

    public static void main(String[] args) {

        ComputerManufacturer laptop = new LaptopManufacturer();
        laptop.buildComputer();

        ComputerManufacturer desktop = new DesktopManufacturer();
        desktop.buildComputer();

    }
}
