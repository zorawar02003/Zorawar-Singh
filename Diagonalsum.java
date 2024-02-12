public class Diagonalsum {
    public static int diagonalsum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum=sum+arr[i][j];
                }
                else if(i+j==arr.length-1){
                    sum=sum+arr[i][j];

                }

            }

        }
        

        return sum;
    }
    public static int sum(int arr[][]){
        int x=0;
        for(int i=0;i<arr.length;i++){
            x=x+arr[i][i];
            if(i!=arr.length-i-1)
            x=x+arr[i][arr.length-i-1];
            
        }
        return x;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
        {5,6,7,8},
       {9,10,11,12},
       {13,14,15,16}
      };
       int x=diagonalsum(arr);
       System.out.println(x);

       System.out.println(sum(arr));
    }
}
