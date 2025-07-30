import java.util.Scanner;
public class Secrettest{
	public static void main (String [] args){

		Scanner input = new Scanner(System.in);	
		Secretename feedback = new Secretename();
		System.out.println("Put the ammount of People That Like This");
		int getLenght = input.nextInt();
		String [] peopleWHOLIKES = new String [getLenght];

		for(int count = 0; count < peopleWHOLIKES.length; count++){
		System.out.println("Enter The Names Of Peoples Who click on like button");
		peopleWHOLIKES[count] = input.next();
		}

		String objectStore = feedback.whoLikesit(getLenght,peopleWHOLIKES);
		System.out.println(objectStore);

}

}