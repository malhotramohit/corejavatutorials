package com.gs.ilp.corejava.Constructor;

public class Account {
	
	long accNum;
	long cheqNum;
	
	Account(long accNumParam , long cheqNumParam){
		accNum =  accNumParam;
		cheqNum = cheqNumParam;
	}

	public static void main(String[] args) {
		Account pierrAc = new Account(54545,434454);
		//Account mohitAc = new Account();

	}
	
}
