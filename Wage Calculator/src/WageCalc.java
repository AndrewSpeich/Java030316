import java.text.DecimalFormat;
import java.util.*;

public class WageCalc {

	public static void main(String[] args) {
	
			double hours;
			double wageperh;
			String employee;
			String dailyWage;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("please type the name of the worker.");
			employee = input.next();
			System.out.println("please type the number of hours the worker has worked.");
			hours = input.nextDouble();
			System.out.println("please type the Wage of the worker.");
			wageperh = input.nextDouble();
			
			
			dailyWage = String.format("%.2f", (hours * wageperh));
			
			if(hours > 40){
				dailyWage = String.format("%.2f", ((hours -40) * (wageperh*1.5))+(40*wageperh) +0.005);
			}
			
			System.out.println(employee + " " + "$"+dailyWage);
			
	}

}
