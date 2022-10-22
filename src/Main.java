import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckList checkList = new CheckList();
        work(checkList);
    }

    public static void work(CheckList checkList){
        System.out.println("Введите номер карты");
        String cardNumber = new Scanner(System.in).nextLine();
        User user = new User("Ivan", "Fadeev", cardNumber);
        if (checkList.getCardNumber().equals(user.getCardNumber())) {
            int n = 0;
            while (n == 0) {
                String s = """
                        Если хотите пополнит баланс нажмите 1
                        Если хотите посмотреть баланс нажмите 2
                        Если хотите перевести с карты на карту нажмите 3
                        Если хотите оплатить нажмите 4
                        """;
                System.out.println(s);
                int number = new Scanner(System.in).nextInt();
                switch (number) {
                    case 1 -> Bankomat.replenishment(checkList);
                    case 2 -> Bankomat.balanceInfo(checkList);
                    case 3 -> Transaction.transfer(checkList);
                    case 4 -> Transaction.payment(checkList);
                }
            }
        } else {
            System.out.println("Неправильный номер карты");
            work(checkList);
        }
    }
}