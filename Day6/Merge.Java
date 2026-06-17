
public class Merge{
    public static void main(String[] args) {
        int arr1[]={3,5,7};
        int arr2[]={1,2,4,6,9,11};

        int n = arr1.length;
        int m = arr2.length;

        int resultantArr[]=new int[n+m];
        int k=0;
        int i=0;
        int j=0;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                resultantArr[k]=arr1[i];
                k++;
                i++;
            }
            else{
                resultantArr[k]=arr2[j];
                k++;
                j++;
            }
        }

        while (i < n) resultantArr[k++] = arr1[i++];

        
       


        for(int item : resultantArr){
            System.out.print(" " + item + " ");
        }


    }   
}