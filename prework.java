import java.util.Scanner;

public class Main {

    Scanner input=new Scanner(System.in);

    public void checkPalindrome()
    {
        System.out.println("Enter the number to check for palindrome:");
        int userInput=input.nextInt();
        int res,rem,num;
        res=0;
        num=userInput;
        while(num > 0)
        {
            rem=num%10;
            num=num/10;
            res=(res*10)+rem;

        }

        if(userInput==res)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }

    public  void patternPrint()
    {
        System.out.println("Enter the number to print the pattern");
     int n=input.nextInt();
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<n-i;j++)
         {
             System.out.print("*");

         }
         System.out.println();
     }
    }

    public  void primeNumber()
    {
        System.out.println("Enter the number to check the prime:");
        int num=input.nextInt();
        int cnt=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                cnt+=1;
                break;
            }
        }
        if(cnt>0)
        {
            System.out.println("Number is not a prime number");
        }
        else
        {
            System.out.println("Number is prime number");
        }
    }

    public void  fibonacci()
    {
        System.out.println("Enter the number upto which you want to print the Fibonacci  series:");
        int num=input.nextInt();
        int a,b,c,i;
        i=a=0;
        b=1;
        System.out.print(a+",");
        System.out.print(b);
        while(i<num-2)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(",");
            System.out.print(c);

            i+=1;
        }
        System.out.println();

    }

    public static void main(String[] args) {

       Main obj=new Main();
       int choice = 0;
       Scanner sc=new Scanner(System.in);
       do {
           System.out.println("Select the particular operations from the following:\n"+"1. Find palindrome of number.\n"

                   + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                   + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

           choice=sc.nextInt();

           switch (choice)
           {
               case 0:
                   break;
               case 1:
                   obj.checkPalindrome();
                   break;
               case 2:
                   obj.patternPrint();
                   break;
               case 3:
                   obj.primeNumber();
                   break;
               case 4:
                   obj.fibonacci();
                   break;
               default:
                   System.out.println("Invalid option6");

           }

       }while (choice!=0);
        System.out.println("Exited Successfully!!!");

        sc.close();



    }
}