package com.badri.patterns.creational.singleton.handle.clone.method.problem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author badrikant.soni on 03/12/18,2018
 */
public class App {

    public static final String filePath = "/Users/badrikant.soni/Documents/workspace/dev/github/badri/core-design-pattern/dateUtil.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        DateUtil dateUtil1 = DateUtil.getInstance();

        // write dateUtil object to a file
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        objectOutputStream.writeObject(dateUtil1);

        // read dateUtil.ser file and convert it to object
        DateUtil dateUtil2 = null;
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        dateUtil2 = (DateUtil) objectInputStream.readObject();

        objectOutputStream.close();
        objectInputStream.close();

        DateUtil dateUtilcloned = null;
        try {
            dateUtilcloned = (DateUtil) dateUtil1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        // checking if both are pointing to same object in memory
        System.out.println(dateUtil1 == dateUtil2); // false

        System.out.println(dateUtil1 == dateUtilcloned); // CloneNotSupportedException
    }
}
