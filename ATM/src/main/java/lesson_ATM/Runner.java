package lesson_ATM;

import lesson_ATM.impl.EmulationATM;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args )
	{
		EmulationATM ATM = new EmulationATM();
		ArrayList<Bill> money = new ArrayList<>();
		for (int i = 0; i < 100; i++) { //формируем начальный капитал
			money.add(new Bill(100));
			money.add(new Bill(200));
			money.add(new Bill(500));
			money.add(new Bill(1000));
			money.add(new Bill(2000));
			money.add(new Bill(5000));
		}
		ATM.setMoney(money);
		System.out.println(ATM.getBalance());
		ATM.getMoney(500);
		System.out.println(ATM.getBalance());
		ATM.getMoney(55);
		System.out.println(ATM.getBalance());
		ATM.getMoney(109000);
		System.out.println(ATM.getBalance());
		ArrayList<Bill> myMoney = new ArrayList<>();
		myMoney.add(new Bill(55));
		myMoney.add(new Bill(100));
		myMoney.add(new Bill(100));
		myMoney.add(new Bill(75));
		int remainder  = ATM.setMoney(myMoney);
		System.out.println(remainder);
	}
}
