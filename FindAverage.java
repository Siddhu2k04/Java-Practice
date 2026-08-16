
public class FindAverage {

    int n=5;
    int[] arr={10,20,30,40,50};
    int sum=0; //declare the sum as 0
    
    void method()
    {
         for(int i =0;i<n;i++)
         {
           sum=sum + arr[i];  //assign the sum of elements 10 20 30 40 50
         }
         System.out.println("sum of the elemnt" +sum);
          System.out.println("avg of te element" + (double)sum/n);//avg=sum/n;

    }
    public static void main(String args[]) //main method
    {
        FindAverage f=new FindAverage();

        f.method(); //call to method
    }
}

