#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "master.h"

int main() {
    int secret_comb[SIZE];
    int user_comb[SIZE];
    int history[20][SIZE]; 
    int attempts = 0;
    int max_attempts = 20;
    int won = 0;

    srand(time(NULL));

    printf("=== JEU MASTER MIND ===\n");
    printf("Trouvez la combinaison de 5 chiffres (entre 1 et 8).\n");
    printf("Vous avez %d tentatives.\n\n", max_attempts);

    random_comb(secret_comb);
    
    while (attempts < max_attempts && !won) {
        printf("\nTentative %d/%d\n", attempts + 1, max_attempts);

        while (!read_comb(user_comb)) {
            printf("Erreur : Entrez exactement 5 chiffres entre 1 et 8 (ex: 12345).\n");
        }

        for(int i = 0; i < SIZE; i++) {
            history[attempts][i] = user_comb[i];
        }

        printf("Votre jeu : ");
        display_comb(user_comb);

        int well = well_placed(secret_comb, user_comb);
        int wrong_place = at_wrong_place(secret_comb, user_comb);

        result(wrong_place, well);

        if (well == SIZE) {
            won = 1;
        } else {
            attempts++;
        }
    }

    printf("\n=============================\n");
    if (won) {
        printf("BRAVO ! Vous avez trouve la combinaison en %d tentatives.\n", attempts + 1);
    } else {
        printf("PERDU ! Vous avez epuise vos 20 tentatives.\n");
        printf("La combinaison secrete etait : ");
        display_comb(secret_comb);
    }

    return 0;
}