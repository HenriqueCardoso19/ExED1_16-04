import java.util.Scanner;
import java.util.Stack;

public class InversorPalavras {
    
    public static String inverterPalavras(String input) {
        StringBuilder resultado = new StringBuilder();
        Stack<Character> pilha = new Stack<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            // Se for um espaço ou o final da string, inverte a pilha
            if (c == ' ' || i == input.length() - 1) {
                while (!pilha.isEmpty()) {
                    resultado.append(pilha.pop());
                }
                
                // Adiciona o espaço ou caractere final ao resultado
                resultado.append(c);
            } else {
                // Adiciona o caractere à pilha
                pilha.push(c);
            }
        }
        
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a frase que deseja inverter:");
        String input = scanner.nextLine();
        scanner.close();
        
        String resultado = inverterPalavras(input);
        System.out.println("Frase invertida: " + resultado); 
    }
}
