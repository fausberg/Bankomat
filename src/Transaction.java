import java.util.Scanner;

public class Transaction {
    public void transfer(CheckList checkList) {
        CheckList checkList1 = new CheckList();
        boolean a = true;
        System.out.println("Введите номер карты которую хотите пополнить");
        String otherCard = new Scanner(System.in).nextLine();
        otherCard = examinationCardNumber(otherCard);
        System.out.println("Введите сумму, которую хотите перевести");
        String sum = new Scanner(System.in).nextLine();
        sum = examinationSum(sum);
        int summ = Integer.parseInt(sum);
        if (summ <= checkList.getBalance()) {
            checkList1.setBalance(summ);
            checkList.minusBalance(summ);
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public String examinationCardNumber(String cardNumber) {
        cardNumber = cardNumber.replaceAll(" ", "");
        String regex = "[0-9]+";
        if (!cardNumber.matches(regex) || cardNumber.length() != 16) {
            System.out.println("Неправильно введён номер карты. Введите его снова");
            cardNumber = new Scanner(System.in).nextLine();
            cardNumber = cardNumber.replaceAll(" ", "");
            examinationCardNumber(cardNumber);
        }
        return cardNumber;
    }

    public void payment(CheckList checkList) {
        System.out.println("Введите сумму для оплаты");
        String sum = new Scanner(System.in).nextLine();
        sum = examinationSum(sum);
        int summ = Integer.parseInt(sum);
        if (summ <= checkList.getBalance()) {
            checkList.minusBalance(summ);
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public String examinationSum(String sum) {
        sum = sum.replaceAll(" ", "");
        String regex = "[0-9]+";
        if (!sum.matches(regex)) {
            System.out.println("Неправильно введёна сумма. Введите её снова");
            sum = new Scanner(System.in).nextLine();
            examinationSum(sum);
        }
        return sum;
    }
}
