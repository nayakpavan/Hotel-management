/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
//import java.lang.*;
/**
 *
 * @author Mahe
 */
class MyException extends Exception
{   
MyException()
{
super();
}}
public class sample1 
{
public static void check(int i) throws MyException
{
    while(i<1 || i>10){
    throw new MyException();
    }}
public static int Menu() throws IOException{
{
    FileReader fi =new FileReader("restaurant.txt");
        BufferedReader br = new BufferedReader(fi);
        String st=br.readLine();
            System.out.println(st);
    }
ArrayList<String> hm=new ArrayList<String>();
ArrayList<Integer> hm1=new ArrayList<Integer>();
hm.add("");
hm.add("WATER/COLDDRINKS");
hm.add("P/M/V BIRIYANI");
hm.add("P/M/V FRIEDRICE");
hm.add("P/M/V NOODLES");
hm.add("RICE");
hm.add("P/M/G MANCHURIAN");
hm.add("ROTI/NAN");
hm.add("DAL TADKA");
hm.add("P/M/V KADAI");
hm.add("VEG CURRY");
hm1.add(null);
hm1.add(12);
hm1.add(100);
hm1.add(80);
hm1.add(80);
hm1.add(30);
hm1.add(65);
hm1.add(20);
hm1.add(65);
hm1.add(80);
hm1.add(40);
Scanner sc=new Scanner(System.in);
int sum=0;
int temp1=0,temp2;
int COLDDRINK=12, BIRIYANI=100, FRIEDRICE=80,NOODLES=80,RICE=30;
int MANCHURIAN=65,ROTIorNAN=20,DALTADKA=65,VEGKADAI=80,VEGCURRY=40;
int flag=0;
String order="";
while(true){
String ch=" ";
if(ch==" "){
System.out.println("*************HOTEL GOOD FORTUNE (VEG.)*****************");
System.out.println("P-PANNER,M-MUSHROOM,V-VEG.,G-GOBI");
for(int i=1;i<hm.size();i++){
System.out.print(i+"."+hm.get(i));
for(int j=1;j<hm1.size();j++){
System.out.println(": Rs "+hm1.get(i));
break;
}}
System.out.println("");
while(true){
System.out.println("ENTER YOUR CHOICE (NUMBERS ONLY PLEASE!)");
System.out.println("*******************************************************");
int choice=sc.nextInt();
try
{
    check(choice);
}
catch(Exception e)
    {
        System.out.println("ERROR : INVALID INPUT USER EXCEPTION");
        System.out.println("TRY AGAIN!!");
        continue;
    }
System.out.println("ENTER THE QUANTITY");
int quantity=sc.nextInt();

   switch(choice){
    
    case 1 : System.out.println("WATER/COLDDRINK"+"\n");
                        flag=COLDDRINK*quantity;
                        temp1=COLDDRINK;
                        sum=sum+flag;
                        order=order.concat("WATER/COLDDRINK"+"\n");
                        break;
    case 2 : System.out.println("P/M/V BIRIYANI"+"\n");
                        flag=BIRIYANI*quantity;
                            temp1=BIRIYANI;
                        sum=sum+flag;
                        order=order.concat("P/M/V BIRIYANI"+"\n");
                        break;
    case 3 : System.out.println("P/M/V FRIEDRICE"+"\n");
                        flag=FRIEDRICE*quantity;
                        temp1=FRIEDRICE;
                        sum=sum+flag;
                        order=order.concat("P/M/V FRIEDRICE"+"\n");
                        break;
    case 4 : System.out.println("P/M/V NOODLES"+"\n");
                        flag=NOODLES*quantity;
                        temp1=NOODLES;
                        sum=sum+flag;
                        order=order.concat("P/M/V NOODLES"+"\n");
                        break;
    case 5 : System.out.println("RICE"+"\n");
                        flag=RICE*quantity;
                        temp1=RICE;
                        sum=sum+flag;                        
                        order=order.concat("RICE"+"\n");
                        break;
    case 6 : System.out.println("P/M/G MANCHURIAN"+"\n");
                        flag=MANCHURIAN*quantity;
                        temp1=MANCHURIAN;
                        sum=sum+flag; 
                        order=order.concat("P/M/G MANCHURIAN"+"\n");
                        break;
             
    case 7 : System.out.println("ROTI/NAN"+"\n");
                        flag=ROTIorNAN*quantity;
                        temp1=ROTIorNAN;
                        sum=sum+flag;
                        order=order.concat("ROTI/NAN"+"\n");
                        break;
    case 8 : System.out.println("DAL TADKA"+"\n");
                        flag=DALTADKA*quantity;
                        temp1=DALTADKA;
                        sum=sum+flag;
                        order=order.concat("DAL TADKA"+"\n");
                        break;
    case 9 : System.out.println("P/M/V KADAI"+"\n");
                        flag=VEGKADAI*quantity;
                        temp1=VEGKADAI;
                        sum=sum+flag;
                        order=order.concat("P/M/V KADAI"+"\n");
                        break;
    case 10 : System.out.println("VEG CURRY"+"\n");
                        flag=VEGCURRY*quantity;
                        temp1=VEGCURRY;
                        sum=sum+flag;
                        order=order.concat("VEG CURRY"+"\n");
                        break;         
   }
System.out.println("DO YOU WANT TO ORDER SOMETHING ELSE ?");
System.out.println("CONFIRMATION(Y/N): ");
String c1=sc.next();
char ch1=c1.charAt(0);
if(ch1=='y'||ch1=='Y'){
    continue;
}else if(ch1=='n'||ch1=='N'){
System.out.println("PROCESSING................\n\n");
System.out.println("********************HOTEL GOOD FORTUNE (VEG.)********************"+ "");
System.out.println("");
System.out.println("*****************************************************");       
        System.out.println("Your Orders are:\n"+order+" "+temp1+" X "+quantity+" = "+flag);
System.out.println("Total Bill : Rs."+sum);
FileReader fj =new FileReader("RESTAURANT1.txt");
        BufferedReader br1 = new BufferedReader(fj);
        String st1=br1.readLine();
        System.out.println(st1);
        if(ch1=='n'||ch1=='N'){
            return 0;
        }}}} 
else{
  FileReader fj =new FileReader("RESTAURANT1.txt");
    BufferedReader br1 = new BufferedReader(fj);
      String st1=br1.readLine();
       System.out.println(st1);
sc.close();
}}}
    public static void main(String[] args)throws IOException{     
    Menu(); 
    }}
    
 
    

