import java.util.Stack;

public class ExpressionValidator {

    /**
     * Vérifie si une expression mathématique a des parenthèses, crochets et accolades
     * correctement appariés et imbriqués.
     * @param expression L'expression à vérifier.
     * @return true si l'expression est bien formée, false sinon.
     */
    public static boolean isWellFormed(String expression) {
        // Utilisation de la classe Stack de Java (une pile LIFO)
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            // 1. Si c'est une ouvrante, on l'empile
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // 2. Si c'est une fermante
            else if (c == ')' || c == ']' || c == '}') {
                // S'il n'y a pas d'ouvrante pour correspondre, c'est FAUX
                if (stack.isEmpty()) {
                    return false;
                }

                char lastOpen = stack.pop(); // Récupère et enlève la dernière ouvrante

                // 3. Vérification de la correspondance
                if (c == ')' && lastOpen != '(') {
                    return false;
                }
                if (c == ']' && lastOpen != '[') {
                    return false;
                }
                if (c == '}' && lastOpen != '{') {
                    return false;
                }
            }
            // Ignorer les autres caractères (chiffres, opérateurs, etc.)
        }

        // Si la pile est vide, toutes les ouvrantes ont été appariées.
        // Sinon, il reste des ouvrantes non fermées.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Exemple de l'énoncé 1 (bien formé)
        String expr1 = "7-((x*((x+y))/(j-3)+y)/(4-2.5))";
        // Exemple de l'énoncé 2 (bien formé)
        String expr2 = "7-{[x*[(x+y)/(j-3)]+y]/(4-2.5)}";
        // Exemples mal formés
        String expr3 = "{[()]}}"; // Fermante en trop
        String expr4 = "([)]";   // Mauvaise imbrication
        String expr5 = "((a+b)"; // Ouvrante en trop

        System.out.println("Expression 1 (\"" + expr1 + "\") est bien formée : " + isWellFormed(expr1));
        System.out.println("Expression 2 (\"" + expr2 + "\") est bien formée : " + isWellFormed(expr2));
        System.out.println("Expression 3 (\"" + expr3 + "\") est bien formée : " + isWellFormed(expr3));
        System.out.println("Expression 4 (\"" + expr4 + "\") est bien formée : " + isWellFormed(expr4));
        System.out.println("Expression 5 (\"" + expr5 + "\") est bien formée : " + isWellFormed(expr5));
    }
}