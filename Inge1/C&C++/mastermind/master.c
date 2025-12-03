#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include "master.h"

void display_comb(int comb[]){
    for(int i = 0; i < (SIZE - 1); i++){
        printf("%d - ",comb[i]);
    }
    printf("%d\n",comb[SIZE - 1]);
}


int read_comb(int comb[]){
    int nb_user;
    int temp_comb[SIZE];
    
    int result = scanf("%d", &nb_user);

    // Nettoyage du buffer
    char c;
    while ((c = getchar()) != '\n' && c != EOF);

    if (result != 1) {
        return 0;
    }
    
    if (nb_user <= 0) return 0;
    for(int i = SIZE - 1; i >= 0; i--){
        if (nb_user == 0) return 0; 
    
        int digit = nb_user % 10;
        
        if(digit < 1 || digit > 8) return 0; 
        
        temp_comb[i] = digit;
        nb_user /= 10;
    } 
    
    if (nb_user > 0) return 0;
    
    for (int i = 0; i < SIZE; i++) {
        comb[i] = temp_comb[i];
    }
    return 1;
}

void random_comb(int array[]){
      for (int i = 0; i < SIZE ; i++) {
        array[i] = (rand() % 8) + 1;
    }
}

int well_placed(int comb[], int propos[]){
    int nb_well_placed = 0;
    for(int i = 0; i < SIZE; i++){
        if(comb[i] == propos[i]){
            nb_well_placed++;
        }
    }
    return nb_well_placed;
}

int at_wrong_place(int comb[], int propos[]) {
    int nb_at_wrong_place = 0;
    int copy_comb[SIZE];
    int copy_propos[SIZE];

    for(int i = 0; i < SIZE; i++) {
        copy_comb[i] = comb[i];
        copy_propos[i] = propos[i];
    }

    for (int i = 0; i < SIZE; i++) {
        if (copy_comb[i] == copy_propos[i]) {
            copy_comb[i] = -1;
            copy_propos[i] = -1;
        }
    }

    for (int i = 0; i < SIZE; i++) {
        if (copy_propos[i] != -1) {
            for (int j = 0; j < SIZE; j++) {
                if (copy_comb[j] != -1 && copy_comb[j] == copy_propos[i]) {
                    nb_at_wrong_place++;
                    copy_comb[j] = -1; 
                    break;
                }
            }
        }
    }

    return nb_at_wrong_place;
}

 void result(int x, int y){
    printf("%d presents - %d bien places",x,y);
 }