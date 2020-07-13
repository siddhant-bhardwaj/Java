
import java.util.*;
class youtube{
String name;
char like;
String recomend;

void main(){
Scanner obj= new Scanner(System.in);    
System.out.println("Enter your name");
name = obj.nextLine();  
System.out.println("Please leave a comment!");
  recomend = obj.nextLine();  
System.out.println("If you liked the video, then type Y if not type N");  
like= obj.next().charAt(0);
  
  System.out.println("Thank you!");
}

}