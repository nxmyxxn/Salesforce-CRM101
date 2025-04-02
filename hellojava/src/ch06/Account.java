package ch06;

public class Account {
	
public static final int MIN_BALANCE = 0;
public static final int MAX_BALANCE = 1000000;
private String acnum;
private String name;
private int balance;


public Account(String acnum, String name, int balance) {	
	this.acnum = acnum;
	this.name = name;
	this.balance = balance;
}

public String getAcnum() { 
	return acnum; 
}
public void setAcnum(String acnum) {
	this.acnum = acnum; 
}


public String getName() { 
	return name;
}
public void setName(String name) {
	this.name = name;
}


public int getBalance() {
	return balance; 
}
public void setBalance(int balance) {
    if (balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
      return;
    }
    this.balance = balance;
  }


}