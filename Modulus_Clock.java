import java.util.*;

public class Modulus_Clock
{
	    public static void main(String[] args)
	    {
            Scanner userinput = new Scanner(System.in);
            int hours, minutes, newhours, total, hourslater, minuteslater, newhourslater, totaltwo, totalthree, modclock, futureHour;

            System.out.print("Hours of the start time ");
            hours = userinput.nextInt();
            System.out.print("Minutes of the start time ");
			minutes = userinput.nextInt();

			System.out.print("Hours later ");
            hourslater = userinput.nextInt();
            System.out.print("Minutes later ");
			minuteslater = userinput.nextInt();

			futureHour = hours + hourslater;
			total = minutes + minuteslater;
			totaltwo = total % 60;



            if (futureHour == 0){
               futureHour = 12;
		   }

		   System.out.print("Final time is ");
		   System.out.print(futureHour);
		   System.out.print(":");
		   System.out.print(totaltwo);
		    System.out.print(" ");












	 }

}