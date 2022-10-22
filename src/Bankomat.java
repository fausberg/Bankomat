import java.util.Scanner;

public class Bankomat {
    public void replenishment(CheckList checkList) {
        System.out.println("Введите сумму на которую хотите пополнить баланс");
        String sum = new Scanner(System.in).nextLine();
        sum = examinationSum(sum);
        int summ = Integer.parseInt(sum);
        checkList.setBalance(summ);
    }

    public void balanceInfo(CheckList checkList) {
        System.out.println(checkList.getBalance());
    }

    public void transfer(CheckList checkList) {
        Transaction transaction = new Transaction();
        transaction.transfer(checkList);
    }

    public void payment(CheckList checkList) {
        Transaction transaction = new Transaction();
        transaction.payment(checkList);
    }

    public String examinationSum(String sum){
        sum = sum.replaceAll(" ","");
        String regex = "[0-9]+";
        if(!sum.matches(regex)){
            System.out.println("Неправильно введёна сумма. Введите её снова");
            sum = new Scanner(System.in).nextLine();
            sum = sum.replaceAll(" ", "");
            examinationSum(sum);
        }
        return sum;
    }

}
