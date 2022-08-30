/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdbapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Student {
	String name;
	String ID = "";
	String admissionYear;
	List<String> subject = new ArrayList<>();
	int accountBalance;
	int moneyIn;
	
    private static final String digits = "0123456789"; 
	Random rand = new Random();
	
	Scanner ip = new Scanner(System.in);
	
	public void inputInfo() {
		System.out.println("Enter name: ");
		name = ip.nextLine();
		while(true) {
                    System.out.println("Enter addmission year: ");
                    String admissionYearInput = ip.nextLine();
                    if(setAdmissionYear(admissionYearInput)) {
                        break;
                    }
		}
		System.out.println("Nap tien lan dau: ");
		accountBalance = Integer.parseInt(ip.nextLine());
	}
	
	public String createID() {
		char[] text = new char[5];
		for (int i = 0; i < 5; i++) {
			text[i] = digits.charAt(rand.nextInt(digits.length()));
		}
		ID = this.admissionYear;
		for (int i = 0; i < 5; i++) {
			ID += text[i];
		}
		return ID;
	}
	
	public void subjectList() {
		System.out.println("1. 101 Mathematics\nCost: 200000VND");
		System.out.println("2. 101 English\nCost: 200000VND");
		System.out.println("3. 101 Chemistry\nCost: 200000VND");
		System.out.println("4. 101 Computer Science\nCost: 200000VND");
	}
	
	public void dangKiHoc() {
		subjectList();
		System.out.println("Choose subject (1, 2, 3, 4): ");
		int code = Integer.parseInt(ip.nextLine());
		switch(code) {
		case 1:
			if (accountBalance >= 200000) {
				System.out.println("Dang ki thanh cong!");
				subject.add("101 Mathematic");
				accountBalance -= 200000;
				break;
			} else {
				System.out.println("Khong du tien, vui long nap them!");
				break;
			}
		case 2:
			if (accountBalance >= 200000) {
				System.out.println("Dang ki thanh cong!");
				subject.add("101 English");
				accountBalance -= 200000;
				break;
			} else {
				System.out.println("Khong du tien, vui long nap them!");
				break;
			}
		case 3:
			if (accountBalance >= 200000) {
				System.out.println("Dang ki thanh cong!");
				subject.add("101 Chemistry");
				accountBalance -= 200000;
				break;
			} else {
				System.out.println("Khong du tien, vui long nap them!");
				break;
			}
		case 4:
			if (accountBalance >= 200000) {
				System.out.println("Dang ki thanh cong!");
				subject.add("101 Computer Science");
				accountBalance -= 200000;
				break;
			} else {
				System.out.println("Khong du tien, vui long nap them!");
				break;
			}
		default:
			System.out.println("Subject doesn't Exist!");
			break;
		}
	}
	
	public void showSubject() {
		System.out.println("Danh sach nhung mon da dang ki: ");
		for (int i = 0; i < subject.size(); i++) {
			System.out.println((i + 1) + ": " + subject.get(i));
		}
	}
	
	public void napTien() {
		while (true) {
			System.out.println("Nhap so tien muon nap: ");
			moneyIn = Integer.parseInt(ip.nextLine());
			if (setMoneyIn(moneyIn)) {
				accountBalance += moneyIn;
				break;
			}
		}
		System.out.println("So tien hien tai: " + getAccountBalance());
	}
	
	public void showAccountBalance() {
		System.out.println(getAccountBalance());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getAdmissionYear() {
		return admissionYear;
	}
	public boolean setAdmissionYear(String admissionYear) {
		if (admissionYear.length() == 4) {
			this.admissionYear = admissionYear;
			return true;
		}
		else {
			System.out.println("Nam nhap hoc khong hop le!");
			return false;
		}
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public boolean setMoneyIn(int moneeyIn) {
		if (moneeyIn > 20000 && moneeyIn <= 10000000) {
			this.moneyIn = moneeyIn;
			return true;
		}
		else {
			System.out.println("Khoan tien nap phai nam trong khoang 20000 den 1000000!");
			return false;
		}
	}

	public int getMoneyIn() {
		return moneyIn;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + createID() + ", subject=" + subject + ", accountBalance=" + accountBalance
				+ "]";
	}
	
}
