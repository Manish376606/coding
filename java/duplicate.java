class duplicate{
    public static void main(String[] args) {
        int arr[]= {1,2,6,3,4,5,5,6};
        int n=arr.length;
        for(int i=0; i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i] +"is duplicate number in series");
                }
            }
        }

    }
}