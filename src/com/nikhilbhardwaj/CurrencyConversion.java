package com.nikhilbhardwaj;

import java.text.DecimalFormat;
import java.util.Scanner;

/** Currency Conversion By Nikhil Bhardwaj **/

public class CurrencyConversion {

	static Scanner sc = new Scanner(System.in); // Scanner Class for Getting Input From User

	// Per 1 Unit Amount in INR
	double USD = 67.5;
	double INR = 1.0;
	double GBP = 90.0;
	double AUD = 153.0;
	double JPY = 60.0;
	double EUR = 81.0;

	static double amount = 0.0;
	double amountinINR = 0.0;
	static double amountChanged = 0.0;

	//Method to Convert Currencies
	double convert(String sourceCurrency, double amount, String destCurrency) {

		switch (sourceCurrency) {
		case "USD":
			amountinINR = amount * USD;
			break;

		case "INR":
			amountinINR = amount * INR;
			break;

		case "GBP":
			amountinINR = amount * GBP;
			break;

		case "AUD":
			amountinINR = amount * AUD;
			break;

		case "JPY":
			amountinINR = amount * JPY;
			break;

		case "EUR":
			amountinINR = amount * EUR;
			break;

		default:
			System.out.println("Please Enter a Valid Source Currency Unit.!");
			System.exit(0);
			break;
		}

		switch (destCurrency) {
		case "INR":
			amountChanged = amountinINR / INR;
			break;

		case "USD":
			amountChanged = amountinINR / USD;
			break;

		case "GBP":
			amountChanged = amountinINR / GBP;
			break;

		case "AUD":
			amountChanged = amountinINR / AUD;
			break;

		case "JPY":
			amountChanged = amountinINR / JPY;
			break;

		case "EUR":
			amountChanged = amountinINR / EUR;
			break;

		default:
			System.out.println("Please Enter a Valid Destination Currency Unit.!");
			System.exit(0);
			break;
		}

		return amount;
	}

	public static void main(String[] args) {

		System.out.println("Country Units");
		System.out.println("-----------------------------");
		System.out.println("|USD |INR |GBP |AUD |JPY| EUR|");
		System.out.println("-----------------------------");
		System.out.println("Enter Source Currency Unit:");
		String sourceCurrency = sc.nextLine();

		System.out.println("Enter Destination Currency:");
		String destCurrency = sc.nextLine();

		System.out.println("Enter Currency Amount:");
		amount = sc.nextDouble();

		CurrencyConversion obj = new CurrencyConversion();

		obj.convert(sourceCurrency, amount, destCurrency);

		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);

		System.out.println(amount + " " + sourceCurrency + " is Equal to " + df.format(amountChanged) + " " + destCurrency);

	}

}
