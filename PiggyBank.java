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
	public void menu(int menu) {
		if (menu == 1) {
			System.out.print("입금액 : ");
			int inputMoney = sc.nextInt();
			deposit(inputMoney);
			System.out.println("현재 금액 : " + money);
		} else if (menu == 2) {
			System.out.print("출금액 : ");
			int inputMoney = sc.nextInt();
			withdraw(inputMoney);
			System.out.println("현재 금액 : " + money);
		} else if (menu == 3) {
			System.out.println("현재 금액 : " + money);
		} else if (menu == 4) {
			System.out.println("프로그램 종료");
		} else {
			System.out.println("다시 입력해주세요.");
		}
		System.out.println();
	}
}
