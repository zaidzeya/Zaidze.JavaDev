package lesson_ATM;

import java.util.ArrayList;

// ячейка отдельным классом для более удобной работы,
// т.к. у нас куча ячеек и у всех одинаковые функции

public class Cell {
	private final int denomination;
	private ArrayList<Bill> bills;

	public Cell(int denomination) {
		this.denomination = denomination;
		bills = new ArrayList<>();
	}

	public int getDenomination() {
		return this.denomination;
	}

	public Bill getBill() {
		if (bills.size() > 0) {
			Bill bill = bills.get(getLastIndex()); //берём последнюю, сверху
			bills.remove(getLastIndex());
			return bill;
		}
		return null;
	}

	public void setBill(Bill bill) {
		bills.add(bill);
	}

	public int getBalance() {
		return bills.size() * denomination;
	}

	private int getLastIndex() {
		return bills.size() - 1;
	}
}
