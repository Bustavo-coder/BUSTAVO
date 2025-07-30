public class Secretename{

	public static String whoLikesit(int lenght,String [] name){
			String feedBack = "";
		if(lenght == 0)feedBack = "No one Like This";
		else if(lenght == 1)feedBack = name[lenght - lenght] + " likes This";
		else if(lenght == 2)feedBack = name[lenght - lenght] + " and " + name[lenght-1] +  " likes This";
		else if(lenght == 3)feedBack = name[lenght - lenght] + " ," + name[lenght-2] + " and"+ name[lenght-1] + " likes This";
		else feedBack = name[lenght - lenght] + "," + name[lenght-3] + " and " + (lenght - 2) +" other likes This";
		return feedBack;
		

	}

}