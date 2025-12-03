# include <iostream>
using namespace std;
int main() {

  int tab[100];
  int n = 0;
  cout << "Entrez un nombre : ";
  cin >> n;
 
  for (int i = 0; i < n; i++){
    cout << "saisir une valeur  [" << i+1 << "] : ";
    cin >> tab[i];
  }
 
  int min = tab[0];
  for(int i = 1; i < n ; i++){
    if(min > tab[i]){
      min = tab[i];
    }
  }
  cout << "Min = " << min << endl;
 
  int max = tab[0];
  for(int i = 1; i < n ; i++){
    if(max < tab[i]){
      max = tab[i];
    }
  }
  cout << "Max = " << max << endl;
 
  int sum = 0;
  for(int i=0 ; i < n ; i++){
    sum += tab[i];
  }
  cout << "Somme = " << sum << endl;
 
  cout << "Moyenne = " << sum/n << endl;
 
  int pair = 0;
  for(int i = 0; i < n ; i++){
    if(tab[i] % 2 == 0){
      pair++;
    }
  }
  cout << "Paires  = " << pair << endl;
}