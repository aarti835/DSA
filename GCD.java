import java.util.Scanner;

public class Main {
       static void PrimeFactors(int n){
               if(n<=1){
                   return;
               }
               while(n%2==0){
                   System.out.println(2);
                   n/=2;
               }
               while(n%3==0){
                   System.out.println(3);
                   n/=3;
               }
               for(int i=5;i*i<=n;i+=6){
                   while(n%i==0) {
                       System.out.println(i);
                       n/=i;
                   }
                       while(n%(i+2)==0){
                           System.out.println(i+2);
                           n=n/(i+2);
                       }
                   }
               if(n>3){
                   System.out.println(n);
               }
               }
               public static void main(String[] args) {
                   Scanner sc=new Scanner(System.in);
                   System.out.println("Enter the Number");
                   int x=sc.nextInt();
                   Main.PrimeFactors(x);
    }
}

