import java.util.*;
class sample
{
public static void main(String args[])
{
Scanner sc=new Scanner(system.in);
int m=0;flag=0;
m=n/2;
System.out.println("Enter the numbers ");
int n=sc.nextInt();
for(int i=2;i<=m;i++)
{
public static int factor_mul(n){

if (n % 2 != 0)
      return 0;
      int result = 1;
      for (int i = 2; i <= Math.sqrt(n); i++){
         int count = 0, current_sum = 1;
         int current_term = 1;
         while (n % i == 0){
            count++;
            n = n/ i;
            if (i == 2 && count == 1)
               current_sum = 0;
            current_term *= i;
            current_sum *= current_term;
         }
         result *= current_sum;
      }
      if (n >= 2)
         result *= (1 + n);
      return result;
   }
      
      System.out.println("The sum of even factors of the number is ");
      System.out.println(factor_mul(n));
   }
}

