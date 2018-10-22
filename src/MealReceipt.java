import java.util.Scanner;

public class MealReceipt 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.println("TAX AND TIP CALCULATOR");
		System.out.print("Name of Appetiser:  ");
		String ap = user.nextLine();
		System.out.print("Cost of Appetiser:  ");
		String apCostStr = user.nextLine();
		System.out.print("Name of Entree:  ");
		String en = user.nextLine();
		System.out.print("Cost of Entree:  ");
		String enCostStr = user.nextLine();
		System.out.print("Name of Dessert:  ");
		String de = user.nextLine();
		System.out.print("Cost of Dessert:  ");
		String deCostStr = user.nextLine();
		System.out.print("Percent tip as decimal:  ");
		String tipStr = user.nextLine();
		
		double apCost = Double.parseDouble(apCostStr);
		double enCost = Double.parseDouble(enCostStr);
		double deCost = Double.parseDouble(deCostStr);
		double subTot = apCost+enCost+deCost;
		double tax = subTot*0.06;
		double tip = Double.parseDouble(tipStr);
		double tipP = tip*100;
		double tip2 = subTot*tip;
		double tot = subTot+tax+tip2;
		
		System.out.println("Item\t\tPrice");
		System.out.println("\n" + ap + "\t\t" + apCost);
		System.out.println(en + "\t\t" + enCost);
		System.out.println(de + "\t\t" + deCost);
		System.out.println("\nSubtotal\t" + subTot);
		System.out.println("Tax\t\t" + tax);
		System.out.println("Tax\t\t" + tax);
		System.out.println("Tip @ " + tipP + "% \t" + tip2);
		System.out.println("Total\t\t" + tot);
	}

}
