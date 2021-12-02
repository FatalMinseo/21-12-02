import java.util.Scanner;

public class PiggyMenu {

	int menu;
	Scanner sc = new Scanner(System.in);
	PiggyBank bank = new PiggyBank(0);

	public void menu(int menu) {
		if (menu == 1) {
			System.out.print("입금액 : ");
			int inputMoney = sc.nextInt();
			bank.deposit(inputMoney);
			System.out.println("현재 금액 : " + bank.money);
		} else if (menu == 2) {
			System.out.print("출금액 : ");
			int inputMoney = sc.nextInt();
			bank.withdraw(inputMoney);
			System.out.println("현재 금액 : " + bank.money);
		} else if (menu == 3) {
			System.out.println("현재 금액 : " + bank.money);
		} else if (menu == 4) {
			System.out.println("프로그램 종료");
		} else {
			System.out.println("다시 입력해주세요.");
		}
		System.out.println();
	}
}
