import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class BankAccountstest {

    public static int Menu(){
        Scanner entrada = new Scanner(System.in);
        int option;
        System.out.println("[1] Saldo");
        System.out.println("[2] Retirar");
        System.out.println("[3] Depositar");
        System.out.println("[0] Salir");
        option = entrada.nextInt();
        return option;
    }

    public static void main(String[] args) throws IOException {
        int option = 0;
        int valTemp = 0;
        BankAccountstest account =  new BankAccountstest();

        do {
           option = Menu();
           if(option == 1) {
               System.out.println("tu saldo es: " + account.getbalance);
           }
            if (option == 2){
                System.out.println("Cantidad que desea retirar: " );
            }
        }while (option != 0);
        System.out.println("La opcion seleccionada es = " + option);
    }

}
