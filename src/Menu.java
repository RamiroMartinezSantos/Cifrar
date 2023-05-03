import java.util.Scanner;

public class Menu {
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        Cifrar cifrar = new Cifrar();
        Descifrar descifrar = new Descifrar();


        System.out.println("--INGRESE LA OPERACION QUE DESEA REALIZAR--");
        System.out.println(" [1] Cifrar un mensaje.");
        System.out.println(" [2] Descifrar un mensaje.");
        int opcion = scanner.nextInt();
        if(opcion == 1){
            cifrar.cifrar();
        }else if(opcion == 2){
            descifrar.descifrar();
        }
    }
}
