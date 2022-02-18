import java.util.Arrays;

public class ArraysSolution 
{

	//search method
	public static int search(int array[],int key) 
	   {
		  for(int n=0;n<array.length;n++)
		  {
			  if(array[n]==key)
				  return n;
		  }
		  return -1;
	   }	
	
	
public static void main(String[] args)
 {
	
	//creation and implementation of 1d array
	int[] a1=new int[6];//1d array
	
	//static values
	a1[0]=4;
	a1[2]=5;
	int count=1;
	int count1=1;
	//dynamic values
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=count;
		count++;
	}
   for(int j=0;j<a1.length;j++)
   {
	   System.out.print(a1[j] +" ");
   }
   System.out.println();
   
   
   //creation and implementation of 2d array
   System.out.println("2D array");
   int[][]a2=new int[3][4];
   for(int k=0;k<a2.length;k++)
   {
	   for(int l=0;l<a2[k].length;l++)
	   {
	   a2[k][l]=count1;
	   count1++;
	   }
   }
   for(int k=0;k<a2.length;k++)
   {
	   for(int l=0;l<a2[k].length;l++)
	   {
	   System.out.print(a2[k][l]+ " ");
	   }
	  System.out.println();
   }
   //sorting arrays(quick sort usually used)
   int a3[]=new int[] {3,62,55,6,5,1,8};
   
   for(int m=0;m<a3.length;m++)
   {
   System.out.print(" "+a3[m]);
   }
   System.out.println();
   Arrays.sort(a3);
   System.out.println("Sorted array");
   for(int m=0;m<a3.length;m++)
   {
   System.out.print(" " +a3[m]);
   }
   
   //Search (linear search usually used)
   System.out.println();
  int indexValue=search(a3,11);
 if(indexValue==-1)
 {
	 System.out.println("No such element found");
 }
 else
 {
	System.out.println("Element is found is at index "+indexValue); 
 }
   
 }

}
