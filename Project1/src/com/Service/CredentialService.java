package com.Service;

import java.util.Random;

import com.Model.Employee;

public class CredentialService {


	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*()_+-<>/?";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;

		Random random = new Random();
		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));

		}

		return password;
	}

	public String generateEmailAddress(String Firstname, String Lastname, String department) {
		return Firstname + Lastname + "@" + department + ".abc.com";

	}

	public void showCredentials(Employee employee, String generatedEmail, char[] generatedPassword) {
		// TODO Auto-generated method stub

		System.out.println("Dear "+ employee.getFirstname()+ "your generated credentials are as follows");
		System.out.println("Email    --> " + generatedEmail);
		System.out.print  ("Password --> 1"
		           + "");
		System.out.print(generatedPassword);
		
	}

}
