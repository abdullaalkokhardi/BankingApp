package com.eibfs.bankingapp;

import java.time.LocalDate;

import com.eibfs.bankingapp.dto.Account;
import com.eibfs.bankingapp.dto.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		account.setAccountNumber("AD001");
		account.setAccountHolderName("abdulla");
		account.setAccountType("saving");
		account.setAddress("abu dhabi");
		account.setBalance(50000);
		account.setContactNumber("0501234567");
//		account.setAccountCreated(LocalDate.now());
		account.setActive(true);
		System.out.println(account);
		System.out.println(account.toString());
		
		Customer customer = new Customer();
		customer.setCustomerID("123546");
		customer.setCustomerName("Abdulla");
		customer.setCustomerNumber("0501234567");
		customer.setCustomerEmail("abdulla@email.com");
		System.out.println(customer);
		
		
	}

}
