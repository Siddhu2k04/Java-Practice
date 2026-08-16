//creating the array class main take input from user and print the array of element

import java.util.Scanner; //package contain the input classes

class main
{
    int i;
    //int ar[]={1,2,3,4,5}; 
    int arr[] = new int[5];
    Scanner sc=new Scanner(System.in);//used for input
   //nt n= sc.nextInt();
    main(){

    for(i=0;i<5;i++)//loop iteration for the user input
    {
         System.out.println("enter the value of array "+i);//it prints the iteration the default values like  0 1 2 3 4
         arr[i] = sc.nextInt(); //assign the integer element given by user to the arr[]
    }
    System.out.println("array elements are:");
    for(i=0;i<5;i++)//loop iteration for the print array of elements
    {
        System.out.println(arr[i]);
    }
    }
    public static void main(String args[])
    {
        main m= new main();
    }
}

