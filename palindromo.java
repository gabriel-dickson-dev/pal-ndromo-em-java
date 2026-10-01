import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==================================");
        System.out.println("   Verificador de Palíndromos     ");
        System.out.println("==================================");
        
        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();     
        String limpa = entrada.replaceAll("\\s+", "").toLowerCase();
        
        // Inverte a string usando StringBuilder
        String invertida = new StringBuilder(limpa).reverse().toString();    
        // Compara a original limpa com a invertida
        if (limpa.isEmpty()) {
            System.out.println("⚠️ Você não digitou nada!");
        } else if (limpa.equals(invertida)) {
            System.out.println("Sim! \"" + entrada + "\"          é um palíndromo.");
        } else {
            System.out.println("Não! \"" + entrada + "\"       não é um palíndromo.");
        }
       scanner.close();
    }
}
