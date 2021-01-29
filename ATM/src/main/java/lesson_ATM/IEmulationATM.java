package lesson_ATM;

import java.util.ArrayList;

public interface IEmulationATM {
	ArrayList<Bill> getMoney(int sum);			 //банкомат должен уметь выдавать деньги, на вход требуемая сумма
	int setMoney(ArrayList<Bill> money);			 //банкомат должен уметь принимать деньги
	int getBalance();				 //возможность просмотра остатка денег в банкомате после выдачи
}
