import java.io.*;
import java.util.Scanner;

public class Io1{
  public static void main(String args[]){
	  try{
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the file name"); 
		  String f = sc.nextLine();
		  FileInputStream fin = new FileInputStream(f);
		  System.out.println("Enter the character to be counted");
		  char ch = sc.next().charAt(0);
		  int count =0;
		  while(fin.read()!='\0')
		   {
			   if(ch==fin.read()){
			   count++;}
		   }
		  System.out.print("File "+f+" has "+count+"instance of letter "+ch);
		  fin.close();
	  }catch(Exception e){
		  System.out.print(e);
	  }
  }
}
	
