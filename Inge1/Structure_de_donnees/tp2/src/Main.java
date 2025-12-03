import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Remplace par une autre implémentation si tu veux (DynamicStack, FileStack, etc.)
        Stack p = new DynamicStack();

        // #ifdef __FILE__STACK__  -> en Java, tu ferais:
        // if (p instanceof FileStack) ((FileStack) p).setFile("persistentStack");

        p.init_stack();
        p.push_stack(5);
        p.push_stack(6);
        p.push_stack(7);
        p.push_stack(8);
        p.display_stack();

        // scanf("%*c") : petite pause
        System.out.println("Appuie sur Entrée pour continuer...");
        new Scanner(System.in).nextLine();

        int val = 0; // comme en C, on garde la dernière valeur pour l’afficher si le pop échoue

        Integer r = p.pop_stack();
        if (r != null) val = r;
        System.out.println("popped value = " + val);
        p.display_stack();

        r = p.pop_stack();
        if (r != null) val = r;
        System.out.println("popped value = " + val);
        p.display_stack();

        r = p.pop_stack();
        if (r != null) val = r;
        System.out.println("popped value = " + val);
        p.display_stack();

        // pop qui échoue : on réimprime l’ancienne valeur (comme le commentaire en C)
        r = p.pop_stack(); // devrait retourner null et afficher "pile vide"
        System.out.println("popped value = " + val); // réaffiche l’ancienne valeur
        p.display_stack();
    }
}
