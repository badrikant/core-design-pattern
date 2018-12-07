package com.badri.patterns.structural.adapter.assignment;

/**
 * @author badrikant.soni on 07/12/18,2018
 */
public class PaymentAdapter {

    public String pay(int rupees) {
        int dollers = 0;

        if (rupees == 70) {
            dollers = 1;
        }

        PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
        String receipt = paymentProcessor.pay(dollers);

        return receipt;
    }
}
