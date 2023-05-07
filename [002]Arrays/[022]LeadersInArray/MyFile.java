public class MyFile
{
    static void printleaders(int[] arr)
    {
        int currl = arr[arr.length-1];
        System.out.print(currl + " ");
        for(int i=arr.length-2 ; i>=0; i--)
        {
            if(arr[i]>currl)
            {
                currl = arr[i];
                System.out.print(currl + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,10,8,2,6,4,2,3};
        printleaders(arr);    
    }
}