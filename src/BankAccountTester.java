import java.util.Arrays;
import java.util.Scanner;

public class BankAccountTester {
    static void main(String[] args) {
        //инициализация метода
        BankAccount harrysChecking = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        int exit = 1;
        //цикл работы программы
        while (exit != 0) {
            System.out.println("Если вы хотите внести деньги, нажмите 1");
            System.out.println("Если вы хотите снять деньги, нажмите 2");
            System.out.println("Если вы хотите отобразить сумму на счете, нажмите 3");
            System.out.println("Для отображения предстоящей суммы по вкладу нажмите 4");
            //цикл обработки введенного числа
            while (true) {
                int inp = scanner.nextInt();
                //внесение денежных средств
                if (inp == 1) {
                    System.out.println("Введите сумму взноса:");
                    int deposit = scanner.nextInt();
                    harrysChecking.deposit(deposit);
                    System.out.println("Вы внесли: " + deposit);
                    System.out.println("Ваш текущий баланс: " + harrysChecking.getBalance());
                    break;
                }
                //снятие денежных средств
                else if (inp == 2){
                    System.out.println("Введите сумму вывода:");
                    int withdraw = scanner.nextInt();
                    harrysChecking.withdraw(withdraw);
                    System.out.println("Вы сняли: " + withdraw);
                    System.out.println("Ваш текущий баланс: " + harrysChecking.getBalance());
                    break;
                }
                //вывод счета
                else if (inp == 3){
                    System.out.println("Ваш текущий баланс: " + harrysChecking.getBalance());
                    break;
                }
                //вывод ожидаемых накоплений через n месятцев
                else if (inp == 4){
                    System.out.println("Введите количество месятцев:");
                    int range = scanner.nextInt();
                    System.out.println("Ваш текущий баланс: " + harrysChecking.getBalance());
                    System.out.println("Через 6 месятцев сумма на вашем счету составит: " + harrysChecking.getWillbalance(range));
                    break;
                }
                //обработка неправильного запроса
                else System.out.println("Введите корректное число!");
            }
            //подтверждение продолжения работы
            System.out.println("Для продолжения работы нажмите 1");
            int inp2 = scanner.nextInt();
            if (inp2 !=1){break;}

        }

    }
}
