import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckList checkList = new CheckList();
        int start = 1;
        while (start == 1) {
            System.out.println("Добро пожаловать");
            work(checkList);
        }
    }

    public static void work(CheckList checkList) {
        System.out.println("Введите номер карты");
        System.out.println("Введите пин-код");
        String cardNumber = new Scanner(System.in).nextLine();
        String PIN = new Scanner(System.in).nextLine();
        User user = new User("Ivan", "Fadeev", cardNumber, PIN);
        if (checkList.getCardNumber().equals(user.getCardNumber()) && checkList.getPIN().equals(user.getPIN())) {
            int n = 0;
            while (n == 0) {
                String possibility = """
                        Если хотите пополнит баланс нажмите 1
                        Если хотите посмотреть баланс нажмите 2
                        Если хотите перевести с карты на карту нажмите 3
                        Если хотите оплатить нажмите 4
                        """;
                System.out.println(possibility);
                int number = new Scanner(System.in).nextInt();
                Bankomat bankomat = new Bankomat();
                switch (number) {
                    case 1 -> bankomat.replenishment(checkList);
                    case 2 -> bankomat.balanceInfo(checkList);
                    case 3 -> bankomat.transfer(checkList);
                    case 4 -> bankomat.payment(checkList);
                    default -> System.out.println("Такой операции нет");
                }
                System.out.println("Вы хотите продолжить? Введите да или нет");
                String endWork = new Scanner(System.in).nextLine();
                boolean examination = true;
                while (examination) {
                    if (endWork.equalsIgnoreCase("нет")) {
                        n = 1;
                        examination = false;
                    } else if (endWork.equalsIgnoreCase("да")) {
                        examination = false;
                    } else {
                        System.out.println("Введено неверное слово. Введите снова да или нет");
                        endWork = new Scanner(System.in).nextLine();
                    }
                }
            }
        } else {
            System.out.println("Неправильный номер карты или пароль");
            work(checkList);
        }
    }
}