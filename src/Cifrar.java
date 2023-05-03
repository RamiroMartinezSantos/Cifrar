import java.util.Scanner;

public class Cifrar {
    public void cifrar(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        System.out.println("ESCRIBA LA PALABRA A CIFRAR.");
        String cifrado = scanner.nextLine();

        for (int i = 0; i < cifrado.length(); i++) {
            char c = cifrado.charAt(i);
            if (c >= 'a' && c <= 'm') {
                c += 13;
            } else if (c >= 'n' && c <= 'z') {
                c -= 13;
            } else if (c >= 'A' && c <= 'M') {
                c += 13;
            } else if (c >= 'N' && c <= 'Z') {
                c -= 13;
            }
            result.append(c);
        }
        System.out.println("MENSAJE SIFRADO: "+result);
    }
}
