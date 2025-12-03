import java.util.Stack;

public class ExpressionConverter {

    // Détermine la précédence des opérateurs
    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        }
        if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0; // Pour les parenthèses
    }

    /**
     * Convertit une expression infixée en expression postfixée (RPN).
     * @param infix L'expression infixée.
     * @return L'expression postfixée.
     */
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        // Stack pour stocker les opérateurs
        Stack<Character> stack = new Stack<>();

        // Simplification : Supprimer les espaces pour la vérification des caractères
        infix = infix.replaceAll("\\s+", "");

        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                // Si c'est un opérande, ajouter au résultat
                postfix.append(c);
            } else if (c == '(' || c == '[' || c == '{') {
                // Si c'est une ouvrante, l'empiler
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                // Si c'est une fermante, dépiler les opérateurs
                char matchingOpen = (c == ')') ? '(' : (c == ']') ? '[' : '{';

                while (!stack.isEmpty() && stack.peek() != matchingOpen) {
                    postfix.append(stack.pop());
                }

                if (!stack.isEmpty()) {
                    stack.pop(); // Retirer la parenthèse ouvrante correspondante
                }
            } else { // C'est un opérateur
                while (!stack.isEmpty() &&
                        precedence(stack.peek()) >= precedence(c)) {

                    // Empiler l'opérateur courant si l'opérateur au sommet est de 
                    // précédence inférieure, OU dépiler l'opérateur au sommet 
                    // s'il est de précédence supérieure ou égale.
                    postfix.append(stack.pop());
                }
                stack.push(c); // Empiler l'opérateur courant
            }
        }

        // Dépiler les opérateurs restants
        while (!stack.isEmpty()) {
            // Un caractère restant doit être un opérateur, car l'expression est bien formée
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }
}