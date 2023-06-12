package strings;

import java.util.Scanner;

public class Sub_bike 
{
  int bno,pno,d,c,v,t,sum;
  String n; int charge; 
  Scanner sc=new Scanner(System.in);
  void input()
  {
	  System.out.println("enter the bike number\nenter the phone number\nenter the duration for which the bike was park");
	  bno=sc.nextInt();
	  pno=sc.nextInt();
	  d=sc.nextInt();
	  System.out.println("enter the name");
	  n=sc.nextLine();
  }
  void compute()
  {
	  if(d>=1 && d<=5)
	  {
		  c=d*500;
	  }
	  else if(d>=6 && d<=10)
	       {
		  v=d-5; 
		  c=v*200+2500;
		  
	       }
	  else
	  {
		  v=d-10;
		  c=3500+v*100;
	  }
	  charge=c;
  }
  void display()
  {
	  System.out.println("bike no."+bno+" phone no."+pno+" no.of days"+d+"charge"+charge);
	
	  
  } 
}


