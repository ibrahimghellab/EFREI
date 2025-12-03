#include <iostream>
#include <string>
using namespace std;
 
bool palindrome(string& str){
  int n = str.length();
  for(int i = 0; i < n/2; i++){
    if(str[i] != str[n-i-1]){
      return false;
    }
  }
  return true;
 
}
 
bool voyelle(char c){
  if( c == 'a') return true;
  if( c == 'e') return true;
  if( c == 'i') return true;
  if( c == 'o') return true;
  if( c == 'u') return true;
  if( c == 'y') return true;
  return false;
}
 
int main(){
  string str;
  cout << "sasir une chaine : " ;
  cin >> str;
 
  int v = 0;
  for(int i = 0; i < str.length(); i++){
    if(voyelle(str[i])){
      v++;
    }
  }
 
  cout << "il y a " << v << " voyelles " << endl;
 
  for(int i = str.length()-1 ; i >= 0; i--){
    cout << str[i];
  }
  cout << endl;
 
  if(palindrome(str)){
    cout << "c'est un palindrome" << endl;
  } else {
    cout << "c'est pas un palindrome" << endl;
  }
 
  return 0;
}