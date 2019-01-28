package jan28;
import java.util.*;
public class Pass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rd=new Random();
		String un;
		do {
			System.out.print("Enter user name-");
			un=input.next();
		   }while(un.length()<6);
		String pass=(un.substring(0,4)).concat(Integer.toString(rd.nextInt(8999)+1000));
		System.out.println("Your auto-generated password is "+pass);
		
		String accounts[][]=new String[2][2];
		accounts[0][0]=un;
		accounts[0][1]=pass;
		accounts[1][0]="";
		accounts[1][1]="";
		
		System.out.println("Your data is stored in accounts section");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(accounts[i][j]);
			}
			System.out.println();
		}
		System.out.println("Press y to update your password");
		char ch1=(input.next()).charAt(0);
		if(ch1=='y')
		{ 	
			String newun=new String();
			String newpass=new String();
			do{
				System.out.println("Enter your username");
				newun=input.next();
				if(!newun.equals(un))
				{
					System.out.println("Invalid Username!");
				}
			  }while(!newun.equals(un));
			System.out.println("Enter new password");
			newpass=input.next();
			accounts[1][0]=newun;
			accounts[1][1]=newpass;
			
			System.out.println("Your data is stored in accounts section");
			System.out.println("Accounts:-");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(accounts[i][j]);
				}
				System.out.println();
			}
			System.out.println("Press y to delete old enteries");
			char ch2=(input.next()).charAt(0);
			if(ch2=='y')
			{
				accounts[0][0]=newun;
				accounts[0][1]=newpass;
				accounts[1][0]="";
				accounts[1][1]="";
				System.out.println("Accounts:-");
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.print(accounts[i][j]);
					}
					System.out.println();
				}
			System.out.println("GoodBye!");	
			}
			else
			{
				System.out.println("GoodBye!");
				System.exit(0);
			}
			
		}
		else
		{
			System.out.println("GoodBye!");
			System.exit(0);
		}
	}
}
