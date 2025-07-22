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

// public class Practice2{
//     int n;  //attribute

//     Practice2(){    //parameter less constructor 
//         n=0;
//     }

//     Practice2(int n){   //parameterized constructor
//         this.n=n;
//     }

//     int countNCO(){
//         int a=1,b=2,c=0;
//         if(n==0){ return 1;}
//         if(n==1){ return 2;}
//         for(int i=2; i<=n; i++){
//             c=a+b;
//             a=b;
//             b=c;
//         }
//         return c;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n value: ");
//         int n=sc.nextInt();
//         Practice2 obj = new Practice2(n);
//         System.out.println(obj.countNCO());
//     }
// }

// gold mine  problem 

public class Practice2{
    public static void main(String[] args){
        int m,n, maxgold=0,ci=0,cj=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m and n: ");
        m=sc.nextInt();
        n=sc.nextInt();
        int gm[][] = new int[m][n];
        int gc[][] = new int[m][n];

        for(int i=0;i<m;i++){
            System.out.println("Enter gold amount at row= "+i);
            for(int j=0;j<n;j++){
                gm[i][j]=sc.nextInt();
            }
        }
        //collect gold (right, right up and right down)

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int rg=0,ru=0,rd=0;
                // rg=gm[i][j];
                if(j+1>=0 && j+1<n){
                    rg = gm[i][j+1];
                }
                if((i-1>=0 && i-1<m) && (j+1>=0 && j+1 <n)){
                    ru = gm[i-1][j+1];
                }
                if((i+1>=0 && i+1<m) && (j+1>=0 && j+1 <n)){
                    rd = gm[i+1][j+1];
                }

                gc[i][j] = gm[i][j]+rg+ru+rd;
                if(gc[i][j]>maxgold){
                    maxgold= gc[i][j];
                    ci=i;
                    cj=j;
                }
            }
        }
        System.out.println("Maximum gold collection: "+maxgold);
        System.out.println("At location: "+ci+", "+cj);
    }
}

