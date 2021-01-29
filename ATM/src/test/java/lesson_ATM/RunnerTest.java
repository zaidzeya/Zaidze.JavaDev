package lesson_ATM;

import static junit.framework.TestCase.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.Test;

import lesson_ATM.impl.EmulationATM;
import java.util.ArrayList;

public class RunnerTest {
	EmulationATM ATM = new EmulationATM();
	ArrayList<Bill> money = new ArrayList<>();

	@Test
	@DisplayName("Внесение денег")
	public void setMoney() {
		for (int i = 0; i < 100; i++) { //формируем начальный капитал
			money.add(new Bill(100));
			money.add(new Bill(200));
			money.add(new Bill(500));
			money.add(new Bill(1000));
			money.add(new Bill(2000));
			money.add(new Bill(5000));
		}
		assertEquals(0, ATM.setMoney(money)); // 0, все деньги внесены и разложены по ячейкам
	}


	@Test
	@DisplayName("Проверка, что не берём у клиента купюры с номиналом, для которого нет ячеек")
	public void setMoneyWithWrongDenomination() {
		money.add(new Bill(55));
		money.add(new Bill(100));
		assertEquals(55, ATM.setMoney(money)); // не зажёвываем то, что не можем переварить
	}

	@Test
	@DisplayName("Проверка баланса")
	public void getBalance() {
		money.add(new Bill(100));
		money.add(new Bill(200));
		ATM.setMoney(money);
		assertEquals(300, ATM.getBalance()); // всегда можем сказать баланс
	}

	@Test
	@DisplayName("А можно больше нормы? А нельзя")
	public void getMoneyOverNorm() {
		money.add(new Bill(200));
		money.add(new Bill(100));
		ATM.setMoney(money);
		assertEquals(null, ATM.getMoney(500)); // не выдаём лишнего
	}
}
