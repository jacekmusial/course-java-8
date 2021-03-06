package org.codefx.courses.java8.optional;

import org.codefx.courses.java8.optional.CustomerSearch.Customer;

import java.util.Optional;

import static org.codefx.courses.java8.optional.CustomerSearch.ANONYMOUS;

public class CustomerLogin {

	private final CustomerSearch search;
	private final Login login;

	public CustomerLogin(CustomerSearch search, Login login) {
		this.search = search;
		this.login = login;
	}

	// locate the customer and, if they are found, log them in
	public void logInCustomerIfExists(int id) {
		throw new RuntimeException("Not yet implemented.");
	}

	// locate the customer and, if they are found, log them in;
	// otherwise log in CustomerSearch.ANONYMOUS
	public void logInCustomerOrAnonymous(int id) {
		throw new RuntimeException("Not yet implemented.");
	}

	// locate the customer and, if they are found, log them in;
	// otherwise log in Customer::determineReplacement
	public void logInCustomerOrReplacement(int id) {
		throw new RuntimeException("Not yet implemented.");
	}

	// locate the customer and, if they are found, log them in;
	// otherwise throw an IllegalArgumentExcpetion
	public void logInCustomerOrThrowIllegalArgumentException(int id) {
		throw new RuntimeException("Not yet implemented.");
	}

	// locate the customer and, if they are found, log them in;
	// otherwise throw an IllegalArgumentExcpetion
	public void logInCustomerOrLogFailedAttempt(int id) {
		throw new RuntimeException("Not yet implemented.");
	}

}
