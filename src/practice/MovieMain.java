package practice;

public class MovieMain {
	
	public static void main(String args[])
	{
		Movie m=new Movie("Dayan K sapne",30,"Com",2020);
		//System.out.println(m);
		
		//int ar[]= {3,6,22,98,2,5,20,7,4};
		int ar2[]= {500,324,77,99,8722,78,65,90,333,456,22,5,32,3,56,4,9,2,6};
		
		
		int newar[]=m.selectionSort(ar2);

		for(int i=0;i<newar.length;i++)
			System.out.println("index "+i+"\t elem :"+newar[i]);
		int ind=m.binSearch(newar,0,newar.length-1,6);
		
		System.out.println("the index is"+ind);
		
	}

}
