package GroupPro;
import java.util.*;

  class teacher_att{
	  public void att(String t_name) {
		  Scanner val1 = new Scanner (System.in);
		  System.out.println("\n\t\t\t__________________________________");
		 
		  System.out.print("\nEnter number of days teacher was present (out of 30 days): ");
		  int p_days = val1.nextInt();
		  int T_days = 30;
		  double T_att = 100 * p_days / T_days;
		  System.out.print("\nPercentage of Attendace of "+t_name+" is: "+T_att+"%");
  
	  }
	  
  }
  class  student_att{
	  public void att(String s_name) {
		  Scanner val2 = new Scanner (System.in);
		  System.out.println("\n\t\t\t__________________________________");
		  System.out.print("\nEnter number of days student was present: ");
		  int p_days = val2.nextInt();
		  int T_days = 30;
		  double T_att = 100 * p_days / T_days;
		  System.out.print("\nPercentage of Attendace of "+s_name+" is: "+T_att+"%");
	  }
  }
public class attendance {

	public static void main(String[] args) {
		Scanner dh = new Scanner (System.in);
		System.out.println("\nPress a for Teachers Attendance Record");
		System.out.println("\nPress b for Students Attendance Record");
		char d = dh.next().charAt(0);
	
		switch(d) {
		case 'a':

			teacher_att obj1 = new teacher_att();
			System.out.println("\n\t\t\t__________________________________"); 
			System.out.println("\n\t\t\t<<<TEACHER ATTENDANCE RECORD>>>");
			System.out.print("\nEnter Teacher's ID: ");
			String t_id = dh.next();
			System.out.print("\nEnter Teacher's Name: ");
			String t_name = dh.next();
			System.out.print("\nEnter Subject of Teacher: ");
			String t_sub = dh.next();
			obj1.att(t_name);
		break;

		case 'b':
			
			student_att obj2 = new student_att();
			System.out.println("\n\t\t\t__________________________________"); 
			System.out.println("\n\t\t\t<<<STUDENT ATTENDANCE RECORD>>>");
			System.out.print("\nEnter Student's ID: ");
			String s_id = dh.next();
			System.out.print("\nEnter Student's Name: ");
			String s_name = dh.next();
			System.out.print("\nEnter Student's Father Name: ");
			String f_name = dh.next();
			obj2.att(s_name);
		break;
		
		default:
			System.out.println("\n\t\t<<<SYSTEM ERROR!>>>");
		break;
		}
	 }	
  }


