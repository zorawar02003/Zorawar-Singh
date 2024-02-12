import java.util.Scanner;

public class largest {
    public static void largest(int m[][]){
        int k=Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                if(m[i][j]>k){
                    k=m[i][j];
                     
                }
            }
        }
        System.out.println(k);
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
         Scanner sc=new Scanner(System.in);

         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
         }

         largest(matrix);
    }
}
