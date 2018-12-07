package com.badri.patterns.structural.adapter.assignment;

/**
 * @author badrikant.soni on 07/12/18,2018
 */
public class PaymentProcessorImpl implements PaymentProcessor {
    public String pay(int dollers) {
        return "payment done in dollers";
    }
}
