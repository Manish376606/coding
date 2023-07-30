public class nintydegree {
    public static void main(String[] args) {
        int arr[][]={{1,2,5,6,},{3,4,8,9},{1,2,3,5},{9,8,7,6}};
        int n = arr.length;
        int m=arr[0].length;
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
         }
          // Step 1: Transpose the 2D array
         System.out.println("transpose of this number ");
         for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp =arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;
                
            }
         }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

       // Step 2: Swap the left and right side elements
        System.out.println("swapping two number");
        for(int i=0;i<m;i++){
            int li=0;
            int ri=n-1;
            while(li< ri){
                int temp =arr[i][li];
                arr[i][li]= arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }}

            for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
