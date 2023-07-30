 //Time complexity = O(n)
//Space complexity = O(1) 
 class missing  {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,7};
        int n=arr.length;
        int sum=0;
        int sum_of_natural=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int missing =sum_of_natural - sum;
        System.out.println(missing);;
    }
}
