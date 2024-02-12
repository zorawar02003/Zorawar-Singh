public class spiralmatrix {
    public static void printSpiral(int arr[][]){
        int startrow=0;
        int startcol=0;
        int endrwo=arr.length-1;
        int endcol=arr[0].length-1;
        
        while(startrow<=endrwo && startcol<=endcol){
          //top
          
            for(int j=startcol;j<=endcol;j++){
               System.out.print(arr[startrow][j]+" ");
           }
            //right
            for(int i=startrow+1;i<=endrwo;i++){
               
                System.out.print(arr[i][endcol]+" ");
            }
           //bottom
           for(int j=endcol-1;j>=startcol;j-- ){
            if(startrow==endrwo){
                break;
            }
            System.out.print(arr[endrwo][j]+" ");

           }
           //left
           for(int i=endrwo-1;i>=startrow+1;i--){
            if(startcol==endcol){
                break;
            }
            System.out.print(arr[i][startcol]+" ");

           }


          startcol++;
          startrow++;
          endcol--;
          endrwo--;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                    {9,10,11,12},
                   };
     
                    
                    printSpiral(arr);
    }
}
