#include <string.h>
#include <stdio.h>
#include <stdlib.h>
int main(){
    char string[100];
    printf("Saissisez une chaine de caractere : ");
    scanf("%s",string);

    int count = 0;
    for(int i = 0; string[i] != '\0'; i++){
        count++;
    }
    printf("%d", count);
}