package GroupPro;
import java.util.*;

class emp{
	//Method Overloading
	public void Employee(String id, String f_name, String l_name, long cnic, long p_no, String email, String post, double sal, long e_no, String doh) {
		Scanner s = new Scanner (System.in);
		System.out.println("\n\t\t\tYour information has been saved in our record");
		System.out.print("\n\t\t\tTo view your entered information press 'v': ");
		char d = s.next().charAt(0);
		System.out.println("\n\t\t\t_____________________________________________________________");
        if(d=='v') {
        	System.out.println("\nID: "+id);
        	System.out.println("\nFirst Name: "+f_name);
        	System.out.println("\nCNIC Number: "+cnic);
        	System.out.println("\nPhone Number: "+p_no);
        	System.out.println("\nEmail Address: "+email);
        	System.out.println("\nPost: "+post);
        	System.out.println("\nSalary: "+sal);
        	System.out.println("\nEmergency Phone Number: "+e_no);
        	System.out.println("\nDate of Hiring: "+doh);
        }
        else {
        	System.out.println("\n\t\t\tERROR OCCURRED!");
        }
        System.out.println("\n\t\t\t_____________________________________________________________");
	}
	//Method Overloading
	public void Employee(String id1, String att, String d_work)
	{
		System.out.println("\n\t\t\tYour information has been saved in our record");
		System.out.println("\n\t\t\tThankyou for inputing today's work");
        System.out.println("\n\t\t\t_____________________________________________________________");

	}
}
    //Hierarchical Inheritance
	class principal extends emp{
		double bp = 35000,da,hra,pf,scf;
		double gross_sal,net_sal;
		
		public void sal_slips() {
			da = 0.97*bp;
			hra = 0.10*bp;
			pf = 0.12*bp;
			scf = 0.001*bp;
			
			gross_sal = bp + da + hra;
			net_sal = gross_sal - pf - scf;
			System.out.println("\n\t\t\t<<<<Your Salary Details>>>>");
			System.out.println("\nBasic Salary: "+bp);
			System.out.println("\nDearness Allowance: "+da);
			System.out.println("\nHRA: "+hra);
			System.out.println("\nPF: "+pf);
			System.out.println("\nStaff Club Fund: "+scf);
			System.out.println("\n\t\t\t_____________________________________________________________");
			System.out.println("\n\t\tGross Salary: "+gross_sal);
			System.out.println("\n\t\tNet Salary: "+net_sal);
		}
		
	}
	class vice_pri extends emp{
		double bp = 25000,da,hra,pf,scf;
		double gross_sal,net_sal;
		
		//Overriding
		public void sal_slips() {
			da = 0.97*bp;
			hra = 0.10*bp;
			pf = 0.12*bp;
			scf = 0.001*bp;
			
			gross_sal = bp + da + hra;
			net_sal = gross_sal - pf - scf;
			System.out.println("\n\t\t\t<<<<Your Salary Details>>>>");
			System.out.println("\nBasic Salary: "+bp);
			System.out.println("\nDearness Allowance: "+da);
			System.out.println("\nHRA: "+hra);
			System.out.println("\nPF: "+pf);
			System.out.println("\nStaff Club Fund: "+scf);
			System.out.println("\n\t\t\t_____________________________________________________________");
			System.out.println("\n\t\tGross Salary: "+gross_sal);
			System.out.println("\n\t\tNet Salary: "+net_sal);
		}
		
	}
	class head_sub extends emp{
		double bp = 20000,da,hra,pf,scf;
		double gross_sal,net_sal;
		
		//Overriding
		public void sal_slips() {
			da = 0.97*bp;
			hra = 0.10*bp;
			pf = 0.12*bp;
			scf = 0.001*bp;
			
			gross_sal = bp + da + hra;
			net_sal = gross_sal - pf - scf;
			System.out.println("\n\t\t\t<<<<Your Salary Details>>>>");
			System.out.println("\nBasic Salary: "+bp);
			System.out.println("\nDearness Allowance: "+da);
			System.out.println("\nHRA: "+hra);
			System.out.println("\nPF: "+pf);
			System.out.println("\nStaff Club Fund: "+scf);
			System.out.println("\n\t\t\t_____________________________________________________________");
			System.out.println("\n\t\tGross Salary: "+gross_sal);
			System.out.println("\n\t\tNet Salary: "+net_sal);
		}
		
	}
	class teacher extends emp{
		double bp = 15000,da,hra,pf,scf;
		double gross_sal,net_sal;
		
		//Overriding
		public void sal_slips() {
			da = 0.97*bp;
			hra = 0.10*bp;
			pf = 0.12*bp;
			scf = 0.001*bp;
			
			gross_sal = bp + da + hra;
			net_sal = gross_sal - pf - scf;
			System.out.println("\n\t\t\t<<<<Your Salary Details>>>>");
			System.out.println("\nBasic Salary: "+bp);
			System.out.println("\nDearness Allowance: "+da);
			System.out.println("\nHRA: "+hra);
			System.out.println("\nPF: "+pf);
			System.out.println("\nStaff Club Fund: "+scf);
			System.out.println("\n\t\t\t_____________________________________________________________");
			System.out.println("\n\t\tGross Salary: "+gross_sal);
			System.out.println("\n\t\tNet Salary: "+net_sal);
		}
		
	}
	class peon extends emp{
		double bp = 5000,da,hra,pf,scf;
		double gross_sal,net_sal;
		
		//Overriding
		public void sal_slips() {
			da = 0.97*bp;
			hra = 0.10*bp;
			pf = 0.12*bp;
			scf = 0.001*bp;
			
			gross_sal = bp + da + hra;
			net_sal = gross_sal - pf - scf;
			System.out.println("\n\t\t\t<<<<Your Salary Details>>>>");
			System.out.println("\nBasic Salary: "+bp);
			System.out.println("\nDearness Allowance: "+da);
			System.out.println("\nHRA: "+hra);
			System.out.println("\nPF: "+pf);
			System.out.println("\nStaff Club Fund: "+scf);
			System.out.println("\n\t\t\t_____________________________________________________________");
			System.out.println("\n\t\tGross Salary: "+gross_sal);
			System.out.println("\n\t\tNet Salary: "+net_sal);
		}
		
	}
public class case_j {
	public static void main (String [] args) {
		System.out.println("\n\t\t\t<<<WELCOME TO HR AND PAYROLL MANAGEMENT>>>>");
		Scanner dh = new Scanner (System.in);
		System.out.println("\nEnter 'a' for New Employee");
		System.out.println("\nEnter 'b' for Daily work");
		System.out.println("\nEnter 'c' for Salary Slips");
		char d = dh.next().charAt(0);
		switch(d) {
		case 'a':
			emp obj = new emp();
			Scanner val = new Scanner (System.in);
			System.out.print("\nID: ");
			String id = val.next();
			System.out.print("\nFirst Name: ");
		    String f_name = val.next();
		    System.out.print("\nLast Name: ");
		    String l_name = val.next();
			System.out.print("\nCNIC Number: ");
			Long cnic = val.nextLong();
			System.out.print("\nPhone Number: ");
			Long p_no = val.nextLong();
			System.out.print("\nEmail Address: ");
			String email = val.next();
			System.out.print("\nPost: ");
			String post = val.next();
			System.out.print("\nSalary: ");
			double sal = val.nextDouble();
			System.out.print("\nEmergency Phone Number: ");
			Long e_no = val.nextLong();
			System.out.print("\nDate of Hiring: ");
			String doh = val.next();
			
			obj.Employee(id, f_name, l_name, cnic, p_no, email, post, sal, e_no, doh);
		
			break;
		case 'b':
			emp obj1 = new emp();
			Scanner val1 = new Scanner (System.in);
			System.out.print("\nID: ");
			String id1 = val1.next();
			System.out.print("\nAttendance: ");
			String att = val1.next();
			System.out.print("\nDaily work: ");
			String d_work = val1.next();
			
			obj1.Employee(id1, att, d_work);
			break;
		case 'c':
			Scanner val2 = new Scanner (System.in);
			System.out.print("\nID: ");
			String id2 = val2.next();
			System.out.print("\nCNIC Number: ");
			Long cnic2 = val2.nextLong();
			System.out.print("\nPhone Number: ");
			Long p_no2 = val2.nextLong();
			System.out.print("\nEmail Address: ");
			String email2 = val2.next();
			System.out.println("\n\t\t\t_____________________________________________________________");
			System.out.println("\nPress 1 for Principal");
			System.out.println("\nPress 2 for Vice Principal");
			System.out.println("\nPress 3 for Head of a subject");
			System.out.println("\nPress 4 for Teacher");
			System.out.println("\nPress 5 for Peon");
			int post_1 = val2.nextInt();
			if(post_1==1) {
				System.out.println("\n\t\t\t_____________________________________________________________");
				double bp = 35000;
		        principal pri = new principal();
		        pri.sal_slips();
			}
			else if(post_1==2) {
				System.out.println("\n\t\t\t_____________________________________________________________");
				double bp = 25000;
		        vice_pri v_pri = new vice_pri();
		        v_pri.sal_slips();
			}
			else if(post_1==3) {
				System.out.println("\n\t\t\t_____________________________________________________________");
				double bp = 20000;
		        head_sub h_sub = new head_sub();
		        h_sub.sal_slips();	
			}
			else if(post_1==4) {
				System.out.println("\n\t\t\t_____________________________________________________________");
				double bp = 15000;
		        teacher teach = new teacher();
		        teach.sal_slips();				
			}
			else if(post_1==5) {
				System.out.println("\n\t\t\t_____________________________________________________________");
				double bp = 5000;
		        peon p = new peon();
		        p.sal_slips();	
			}
			break;
		}
		
	}

}
