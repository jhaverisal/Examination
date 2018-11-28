package practice;

public class HousePaint {

	public static void main(String[] args) {
		
		InputHelper input=new InputHelper();
		HousePaintHelper helper=new HousePaintHelper();
		
		double l,w,h, tsa, win_l,win_b,door_l,door_b, tot_winArea,tot_doorArea;
		double paintArea, costPerUnit,tot_cost;
		int numWin,numDoor;
		
		l=input.readDouble("Enter the length of the house:");
		w=input.readDouble("Enter the width of the house:");
		h=input.readDouble("Enter the height of the house:");
		
		tsa= helper.calcFourFaces(l,w,h);
		System.out.println("the tsa of the house is "+tsa+"sq units");
		
		//calculating total area of windows
		numWin=input.readInt("Enter number of windows");
		win_l=input.readDouble("enter the length of window");
		win_b=input.readDouble("enter the breadth of window");
		tot_winArea=numWin*(helper.calcArea(win_l, win_b));
		
		//calculating total area of doors
		numDoor=input.readInt("Enter number of doors");
		door_l=input.readDouble("enter the length of door");
		door_b=input.readDouble("enter the breadth of door");
		tot_doorArea=numDoor*(helper.calcArea(door_b, door_l));
		
		//subtracting area of doors and windows
		paintArea=tsa-tot_doorArea-tot_winArea;
		System.out.println("The total area to be painted is "+paintArea+"sq units");
		
		costPerUnit=input.readDouble("Enter the cost to paint per unit");
		
		//Final cost for painting the house
		tot_cost=paintArea*costPerUnit;
		System.out.printf("The total cost to paint the house is $%6.4f",tot_cost);
		

	}

}
