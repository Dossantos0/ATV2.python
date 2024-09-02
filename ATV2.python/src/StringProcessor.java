import java.util.Scanner;

public class StringProcessor {

    private String string;
    public StringProcessor(String string) {
        this.string = string;
    }
    public int contarCaracteres() {
        return string.length();
    }
    public String converterMaiusculo() {
        return string.toUpperCase();
    }
    public int contarVogais() {
        int vogais = 0;
        for (int i = 0; i < string.length(); i++) {
            char letra = string.charAt(i);
            if ("aeiouAEIOU".indexOf(letra) != -1) {
                vogais++;
            }
        }
        return vogais;
    }
    public boolean comecaComUNI() {
        return string.toLowerCase().startsWith("uni");
    }
    public boolean terminaComRIO() {
        return string.toLowerCase().endsWith("rio");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();
        StringProcessor processor = new StringProcessor(inputString);
        System.out.println("Número de caracteres: " + processor.contarCaracteres());
        System.out.println("String em maiúsculo: " + processor.converterMaiusculo());
        System.out.println("Número de vogais: " + processor.contarVogais());
        System.out.println("Começa com 'UNI': " + processor.comecaComUNI());
        System.out.println("Termina com 'RIO': " + processor.terminaComRIO());
    }
}