import java.util.Scanner;

public class PiggyBank {

	int menu;
	int money;
	Scanner sc = new Scanner(System.in);

	// �ܾ�
	public PiggyBank(int money) {
		this.money = money;
	}
	// �Ա�
	public void deposit(int inputMoney) {
		money += inputMoney;
	}

	// ���
	public void withdraw(int inputMoney) {
		money -= inputMoney;
	}
	public void showMoney(int money) {
		this.money=money ;
	}
	public void menu(int menu) {
		if (menu == 1) {
			System.out.print("�Աݾ� : ");
			int inputMoney = sc.nextInt();
			deposit(inputMoney);
			System.out.println("���� �ݾ� : " + money);
		} else if (menu == 2) {
			System.out.print("��ݾ� : ");
			int inputMoney = sc.nextInt();
			withdraw(inputMoney);
			System.out.println("���� �ݾ� : " + money);
		} else if (menu == 3) {
			System.out.println("���� �ݾ� : " + money);
		} else if (menu == 4) {
			System.out.println("���α׷� ����");
		} else {
			System.out.println("�ٽ� �Է����ּ���.");
		}
		System.out.println();
	}
}
