# include <iostream>
using namespace std;
int main() {
    int valA,valB;
    cout<<"Entrer deux nombres : ";
    cin>>valA;
    cin>>valB;
    cout<< "Somme = "<< valA + valB <<endl;
    cout<<"Différence = " << valA - valB<<endl;
    cout<<"Produit = " << valA * valB << endl;
    cout << "Quotient = " << (float) valA / valB << endl;
    return 0;
}

