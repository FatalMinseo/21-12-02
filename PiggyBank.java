import java.util.Scanner;

public class PiggyBank {

	int menu;
	int money;
	Scanner sc = new Scanner(System.in);

	// 잔액
	public PiggyBank(int money) {
		this.money = money;
	}
	// 입금
	public void deposit(int inputMoney) {
		money += inputMoney;
	}

	// 출금
	public void withdraw(int inputMoney) {
		money -= inputMoney;
	}
	public void showMoney(int money) {
		this.money=money ;
	}
}
