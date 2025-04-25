import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args){
        int[] A={1,2,3,4};
        int[] B={10,15,20};
        int len=A.length+B.length;
        int[] C=new int[len];
        int[] D=new int[len];

        // System.out.println("Copying first A elements in C then B elements in C: ");
        System.arraycopy(A,0, C,0, A.length);
        System.arraycopy(B,0, C, A.length, B.length);
        // System.out.println(Arrays.toString(C));

        // System.out.println("Copying first B elements in D then A elements in D: ");
        System.arraycopy(B,0, D,0, B.length);
        System.arraycopy(A,0, D, B.length, A.length);
        // System.out.println(Arrays.toString(D));

        for(int i:C){
            System.out.print(i+" ");
        }
            System.out.println();
        for(int j:D){
            System.out.print(j+" ");
        }

    }
}
