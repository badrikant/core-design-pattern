package com.badri.patterns.structural.adapter.assignment;

/**
 * @author badrikant.soni on 07/12/18,2018
 */
public class PaymentApp {

    public static void pay(int rupees) {

        PaymentAdapter paymentAdapter = new PaymentAdapter();
        System.out.println(paymentAdapter.pay(rupees));
    }

    public static void main(String[] args) {
        pay(70);
    }
}
