#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int min(int tab[],int taille){
    int min = tab[0];
    for(int i = 1; i < taille; i++){
        if(tab[i] < min){
            min = tab[i];
        }
    }
    return min;
}

bool isSorted(int tab[],int taille){
    for(int i = 0; i < taille - 1; i++){
        if(tab[i] > tab[i+1]){
            return false;
        }
    }
    return true;
}
int premiere_occurence(int tab[],int taille,int val){
    for(int i = 0; i < taille; i++){
        if(tab[i] == val){
            return i;
        }
    }
    return -1;
}

int moyenne(int tab[],int taille){
    int somme ;
    for(int i = 0; i < taille; i++){
        somme += tab[i];
    }
    return somme/taille;
}

void nb_occ_pos(int tab[], int taille, int val){
    int nb_occ = 0;
    for(int i = 0; i < taille; i++){
        if(tab[i] == val){
            nb_occ++;
        }
    }
    int occ[nb_occ];
    int j = 0;
    for(int i = 0; i < taille; i++){
        if(tab[i] == val){
            occ[j] = i;
            j ++;
        }
    }
    printf("Nombre d'occurences : %d\n", nb_occ);
    printf("Indice des occurences : [");
    for(int i = 0; i < nb_occ; i++){
        printf(" %d ", occ[i]);
    }
    printf("]");
}



int main(int argc, char* argv[]){
    int taille;
    printf("Saisisser le nombre de valeur que vous voulez saisir : ");
    scanf("%d",&taille);
    int tab[taille];
    int val;
    for(int i = 0; i < taille; i++){
        printf("Saissiser la valeur %d : ",i + 1 );
        scanf("%d",&val);
        tab[i] = val;
    }
    printf("[");
    for(int i = 0; i < taille; i++){
       printf(" %d ", tab[i]);
    }
    printf("]\n");

    printf("Minimum du tableau : %d\n", min(tab,taille));
    printf("Moyenne du tableau : %d\n", moyenne(tab,taille));

    printf("La première occurence est à l'indice : %d\n", premiere_occurence(tab,taille,5));

    nb_occ_pos(tab,taille,5);

    printf("\nLe tableau est trie ? : %d\n", isSorted(tab,taille));


}