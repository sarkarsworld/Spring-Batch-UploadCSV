package com.simplesolutions.config;

import org.springframework.batch.item.ItemProcessor;

import com.simplesolutions.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

	@Override
    public Customer process(Customer customer) throws Exception {
		return customer;
//        if(customer.getCountry().equals("United States")) {
//            return customer;
//        }else{
//            return null;
//        }
    }

}
