# include <iostream>
using namespace std;

int carre(int n){
    return n*n;
}

int main() {
    int a;
    cout<<"Entrer un nombre : ";
    cin>>a;
    cout <<"Le carré de " << a << " est "<<carre(a)<<endl;
    return 0;
}