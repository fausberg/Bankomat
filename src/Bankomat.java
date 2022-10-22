import java.util.Scanner;

public class Bankomat {
    public static void replenishment(CheckList checkList){
        System.out.println("Введите сумму на которую хотите пополнить баланс");
        int sum = new Scanner(System.in).nextInt();
        checkList.setBalance(sum);
    }

    public static void balanceInfo(CheckList checkList){
        System.out.println(checkList.getBalance());
    }
}
