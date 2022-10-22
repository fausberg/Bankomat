import java.util.Scanner;

public class Transaction {
    public static void transfer(CheckList checkList){
        CheckList checkList1 = new CheckList();
        boolean a = true;
        System.out.println("Введите номер карты которую хотите пополнить");
        String otherCard = new Scanner(System.in).nextLine();
        if(otherCard.length() == 19) {
            checkList1 = new CheckList(otherCard);
        }else{
            System.out.println("Неправильно введен номер карты");
            a = false;

        }
        System.out.println("Введите сумму, которую хотите перевести");
        int sum = new Scanner(System.in).nextInt();
        if(a) {
            if (sum <= checkList.getBalance()) {
                checkList1.setBalance(sum);
                checkList.minusBalance(sum);
            } else {
                System.out.println("Недостаточно средств");
            }
        }
    }

    public static void payment(CheckList checkList){
        System.out.println("Введите сумму для оплаты");
        int sum = new Scanner(System.in).nextInt();
        if(sum <= checkList.getBalance()) {
            checkList.minusBalance(sum);
        }else{
            System.out.println("Недостаточно средств");
        }
    }
}
