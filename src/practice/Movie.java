package practice;

public class Movie {
	private String name;
	private int runTime;
	private String moviRating;
	private int year;
	
	public Movie(String s, int r, String rate,int yr)
	{
		name=s;
		runTime=r;
		moviRating=rate;
		year=yr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public String getMoviRating() {
		return moviRating;
	}

	public void setMoviRating(String moviRating) {
		this.moviRating = moviRating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	public String toString()
	{
		return("Movie name :"+name+
				"\nRating :"+moviRating+
				"\nYear :"+year+
				"\nRuntime :"+runTime+"mins");
		
	}

	public int[] selectionSort(int [] arr)
	{
		//int ar2[]= {78,65,90,3,56,4,9,2,6};
		int index,temp=0;
		for(int  i=0;i<arr.length-1;i++)
		{
			index=i;
			int small=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<small)
				{
					index=j;
					small=arr[j];
					
				}
				
			}
			temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		
		return arr;
	}
	
	public int binSearch(int arr[],int low,int high,int i)
	{
		int mid=(low+high)/2;
		
		System.out.println("mid :"+mid);
		if(arr[mid]==i)
			return mid;
		else if(arr[mid]<i)//search in 2nd half
		{
			return binSearch(arr, mid, high, i);

		}
		else if(arr[mid]>i)
		{
			return binSearch(arr, low, mid, i);

		}

		return -1;
		
	}
}
