package lesson_ATM.impl;

import lesson_ATM.Bill;
import lesson_ATM.Cell;
import lesson_ATM.IEmulationATM;

import java.util.ArrayList;
import java.util.Arrays;

public class EmulationATM implements IEmulationATM {
	private ArrayList<Cell> cells;
	private ArrayList<Integer> listDenominations = new ArrayList<>();

	public EmulationATM() {
		listDenominations.addAll(Arrays.asList(5000, 2000, 1000, 500, 200, 100));
		cells = new ArrayList<>();
		for (int denomination : listDenominations) {
			cells.add(new Cell(denomination)); //создаём ячейки в банкомате с разными номиналами
		}
	}

	@Override // снимаем деньги
	public ArrayList<Bill> getMoney(int sum) {
		int value;
		ArrayList<Bill> money = new ArrayList<>();
		if (getBalance() >= sum) { //проверяем, что хватит денег в банкомате
			for (Cell cell : cells) {
				value = sum / cell.getDenomination();
				for (int i = 0; i < value; i++) {
					if (cell.getBalance() != 0) { //проверяем наличие денег в ячейке
						money.add(cell.getBill());
						sum = sum - cell.getDenomination();
					}
				}
			}
			if (sum == 0) {
				return money;
			} else {
				setMoney(money); // раскладываем всё обратно
				System.out.println("Денег нет, но вы держитесь!");
			}
		} else {
			System.out.println("Запрашиваемая сумма больше баланса банкомата");
		}
		return null;
	}

	@Override // вносим деньги
	public int setMoney(ArrayList<Bill> money) {
		int remainer = 0;
		for (Bill bill : money) {
			int num = listDenominations.indexOf(bill.getDenomination());
			if (num != -1) {
				cells.get(num).setBill(bill);
			} else {
				System.out.println("Номинал не поддерживается этим банкоматом: " + bill.getDenomination());
				remainer = remainer + bill.getDenomination();
			}
		}
		return remainer;
	}

	@Override // запрашиваем остаток
	public int getBalance() {
		int sum = 0;
		for (Cell cell : cells) {
			sum = sum + cell.getBalance();
		}
		return sum;
	}
}
