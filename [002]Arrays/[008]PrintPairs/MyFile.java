public class MyFile
{
    static void printpairs(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {5,1,3,4,2};
        printpairs(arr);    
    }
}