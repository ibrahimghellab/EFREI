import java.util.Stack;

public class Calculator {

    /**
     * Effectue une opération binaire simple.
     */
    private static double applyOp(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new UnsupportedOperationException("Division par zéro.");
                return a / b;
        }
        return 0;
    }

    /**
     * Évalue une expression postfixée.
     * ATTENTION : Cette implémentation suppose des opérandes numériques à UN SEUL chiffre.
     * Pour supporter des nombres à plusieurs chiffres, l'analyse lexicale serait plus complexe.
     * @param postfix L'expression postfixée.
     * @return Le résultat de l'évaluation.
     */
    public static double evaluatePostfix(String postfix) {
        Stack<Double> stack = new Stack<>();

        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push((double)(c - '0'));
            } else {
                double op2 = stack.pop();
                double op1 = stack.pop();

                double result = applyOp(op1, op2, c);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String infixExpr = "((1+2)*(5-(3-4)))/(6+7)";

        System.out.println("--- Conversion Infixe -> Postfixe ---");
        String postfixExpr = ExpressionConverter.infixToPostfix(infixExpr);
        System.out.println("Infixe : " + infixExpr);
        System.out.println("Postfixe : " + postfixExpr);

        System.out.println("\n---  Évaluation Postfixe ---");
        try {
            double result = evaluatePostfix(postfixExpr);
            System.out.println("Résultat de l'évaluation : " + result);
        } catch (Exception e) {
            System.err.println("Erreur lors de l'évaluation : " + e.getMessage());
        }
    }
}