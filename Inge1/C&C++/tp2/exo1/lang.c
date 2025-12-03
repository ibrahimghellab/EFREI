#include <stdio.h>
#include <stdlib.h>
int main(int argc, char* argv[]){
    if(argc != 4){
        printf("Erreur arg");
        return -1;
    }


    printf("%s/%s/%s",argv[1],argv[2],argv[3]);

}