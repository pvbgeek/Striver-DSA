public class MyFile
{
    static boolean chksorted(int[] arr)
    {
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]<arr[i-1])
            {return false;}
        }
        return true;
    }
    public static void main(String[] args) 
    {
        int[] arry = {1,2,3,4,5,6,7,8,9};
        int[] arrn = {5,1,4,2,3};
        
        System.out.println(chksorted(arry));
        System.out.println(chksorted(arrn));
    }
}