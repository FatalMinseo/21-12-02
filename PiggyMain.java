import java.util.Scanner;

public class PiggyMain {

	public static void main(String[] args) {

		PiggyBank bank = new PiggyBank(0);
		PiggyMenu menu = new PiggyMenu();
		// 0을 다른 금액으로 바꾸면 사용하기 전 금액
		System.out.println("현재 금액 : " + bank.money);
		Scanner sc = new Scanner(System.in);

		int num = 0;
		while (num != 4) {
			System.out.println("[1] 입금 [2] 출금 [3] 잔액조회 [4] 종료");
			System.out.print("메뉴 선택 : ");
			num = sc.nextInt();
			menu.menu(num);
		}
		sc.close();
	}
}
