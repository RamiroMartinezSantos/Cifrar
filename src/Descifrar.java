import java.util.Scanner;

public class Descifrar {
    public void descifrar(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        System.out.println("ESCRIBA LA PALABRA A DESCIFRAR.");
        String palabra = scanner.nextLine();

        for(int  i = 0; i < palabra.length();i++){
            char d = palabra.charAt(i);
            if (d >= 'a' && d <= 'm') {
                d += 13;
            } else if (d >= 'n' && d <= 'z') {
                d -= 13;
            } else if (d >= 'A' && d <= 'M') {
                d += 13;
            } else if (d >= 'N' && d <= 'Z') {
                d -= 13;
            }
            result.append(d);
        }
        System.out.println("MENSAJE DESCIFRADO: "+result);
    }
}
