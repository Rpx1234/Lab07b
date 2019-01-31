//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Start_Lab07b_HexToBinary
{
 public static void main( String args[] )
 {
  Scanner keyboard = new Scanner(in);
  
  out.print("Enter a letter from A to F :: ");
  char letter = keyboard.next().charAt(0);
  HexToBinary test = new HexToBinary(letter);
  out.println(test);  //A

  //add more test cases use the set method!
  
 }
}

class HexToBinary
{
 //attributes
 private char hex;
 
 public HexToBinary()
 {
   setHex(' ');
 }
 
 //default constructor
 public HexToBinary( char Char)
 {
   setHex(Char);
 }
 
 public void setHex(char Char)
 {
   hex = Char;
 }
 
 
 //parameter constructor
 

 //setHex method 
 
 //This method will use a switch to determine the value
 //of binary based on the value of the attribute hex
 //But do not output in this method, instead set binary to
 //the answer and it will be returned.
 public String getBinary()
 {
  String binary="";
  switch(hex)
  {
    case 'A' : binary = "1010"; break; 
    case 'B' : binary = "1011"; break; 
    case 'C' : binary = "1100"; break; 
    case 'D' : binary = "1101"; break; 
    case 'E' : binary = "1110"; break; 
    case 'F' : binary = "1111"; break; 
    default : binary = "ERROR";
  }
  
  
  //use a switch to set the value of variable binary!
  
 
 
  return binary;
 }

 //this should return more than what is provided here
 public String toString()
 {
  return hex + " is " + getBinary() + " in binary";
 }
}
