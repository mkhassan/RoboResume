
import java.util.Scanner;
import java.util.ArrayList;


public class RoboResume {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your name, email address");	

		String name = kb.nextLine();
		
		String email = kb.nextLine();

		ArrayList<String> education = new ArrayList<String>();
		ArrayList<String> experience = new ArrayList<String>();
		ArrayList<String> skills = new ArrayList<String>();

		String edu = null;
		String toQuit = "quit";
		int educount = 1;
		int expcount =0;
		int skillscount = 1;

		System.out.println("Enter your educational achievements or quit when done");



		do {

			  
				edu = kb.nextLine();
				education.add(edu);
				
			   
			   educount++;
		} while((educount <= 10 && !(toQuit.equalsIgnoreCase(edu))) );


		
System.out.println("Enter your Experiences:");

 String exp = null;
 
 while(expcount < 10 && !(toQuit.equalsIgnoreCase(exp))){
	 
	 exp = kb.nextLine();
	 experience.add(exp);
	 expcount++;
 }
 
 /**
 do {
	 expcount++;
	 if (educount <= 10) {
		 exp = kb.nextLine();
		 experience.add(exp);
		 
	 }
 } while((toQuit.equalsIgnoreCase(exp)));
 
**/

 System.out.println("Enter your skills:");
String ski = null;





do {

	ski = kb.nextLine();
	skills.add(ski);
	
	skillscount++;
} while(skillscount <20 && !(toQuit.equalsIgnoreCase(ski)));

System.out.println(name);
System.out.println(email);

System.out.println();

System.out.println("Education");
for (int i = 0; i <=education.size() - 2; i++){
   System.out.println(education.get(i));
}
System.out.println();
System.out.println("Experience");
for (int i = 0; i <=experience.size() - 2; i++){
   System.out.println(experience.get(i));
}

System.out.println();
System.out.println("Skills");
for (int i = 0; i <=skills.size() - 2; i++){
   System.out.println(skills.get(i));
}




	}

}
