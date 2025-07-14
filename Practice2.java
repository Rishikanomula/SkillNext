// No two consecutive 1's in a binary str of n digits

import java.util.*;
// public class Practice2 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n value: ");
//         int n = sc.nextInt();
//         int arr[]= new int[n+1];
//         arr[0]=1;
//         arr[1]=2;
//         for(int i=2; i<=n; i++){
//             arr[i]= arr[i-1] + arr[i-2];
//        }
//        System.out.println("The number of no 2 consecutives 1's are: "+arr[n]);
//     }
// }

public class Practice2{
    int n;  //attribute

    Practice2(){    //parameter less constructor 
        n=0;
    }

    Practice2(int n){   //parameterized constructor
        this.n=n;
    }

    int countNCO(){
        int a=1,b=2,c=0;
        if(n==0){ return 1;}
        if(n==1){ return 2;}
        for(int i=2; i<=n; i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        Practice2 obj = new Practice2(n);
        System.out.println(obj.countNCO());
    }
}