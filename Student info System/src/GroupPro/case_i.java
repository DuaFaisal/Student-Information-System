package GroupPro;
import java.util.*;
class s_f {
double mt_f;
double ec_f;
double l_f;
int c;

s_f(int c ,double mt_f, double ec_f, double l_f){
this.mt_f = mt_f;
this.ec_f = ec_f;
this.l_f = l_f;
this.c = c;
int d = 0;
double T = 0;
String [] Stu = {"Ukasha","Areeb","Taseer","Zahir","Haseeb"};
long [] Stu_Id = {24621, 56789, 12345, 98765, 17246};

do {

for(int h = 0; h < Stu_Id.length; h++ ) {


System.out.println(" \t <<< STUDENT FEE VOUCHER >>> \n");
System.out.println(" \t_______________________________ \n");

        System.out.println(" \t <<< BANK COPY >>>");
System.out.println(" Student Name -> "+Stu[d]+" \n");
System.out.println(" "+Stu[d]+" Id Is ->"+Stu_Id[h]+" \n");
System.out.println(" Student Class -> "+c+" \n");
System.out.println(" Monthly Tuition Fees -> Rupees: "+mt_f+" \n");
System.out.println(" Extra Curriculum Activity Fees -> Rupees: "+ec_f+" \n");
System.out.println(" Laboratory Fees -> Rupees: "+l_f+" \n");
T = mt_f + ec_f + l_f;
System.out.println(" "+Stu[d]+" Total Fees Is -> Rupees: "+T);
System.out.println("\t << NOTE >> \r\n"+"*) Due Date Is -->  10 Oct, 2020 \r\n"+"*) Ater Due Date Fees Will Be -> Rupees: "+(T+500));
System.out.println(" \t_______________________________ \n");

// NARROW TYPE CASTING
long m = (long) mt_f;
long e = (long) mt_f;
long l = (long) mt_f;

    System.out.println(" \t <<< STUIDENT COPY >>>");
System.out.println(" Student Name -> "+Stu[d]+" \n");
System.out.println(" "+Stu[d]+" Id Is ->"+Stu_Id[h]+" \n");
System.out.println(" Student Class -> "+c+" \n");
System.out.println(" Monthly Tuition Fees -> Rupees: "+m+" \n");
System.out.println(" Extra Curriculum Activity Fees -> Rupees: "+e+" \n");
System.out.println(" Laboratory Fees -> Rupees: "+l+" \n");
T = m + e + l;
System.out.println(" "+Stu[d]+" Total Fees Is -> Rupees: "+T);
System.out.println("\t << NOTE >> \r\n"+"*) Due Date Is -->  10 Oct, 2020 \r\n"+"*) Ater Due Date Fees Will Be -> Rupees: "+(T+500));
System.out.println(" \t_______________________________ \n");


    System.out.println(" \t <<< SCHOOL COPY >>>");
    System.out.println(" Student Name -> "+Stu[d]+" \n");
    System.out.println(" "+Stu[d]+" Id Is ->"+Stu_Id[h]+" \n");
    System.out.println(" Student Class -> "+c+" \n");
    System.out.println(" Monthly Tuition Fees -> Rupees: "+m+" \n");
System.out.println(" Extra Curriculum Activity Fees -> Rupees: "+e+" \n");
System.out.println(" Laboratory Fees: Rupees: "+l+" \n");
T = m + e + l;
System.out.println(" "+Stu[d]+" Total Fees Is -> Rupees:"+T);
System.out.println("\t << NOTE >> \r\n"+"*) Due Date Is -->  10 Oct, 2020 \r\n"+"*) Ater Due Date Fees Will Be -> Rupees: "+(T+500));
System.out.println(" \t_______________________________ \n");


d++;
}
}
while ( d < Stu.length );
}

}
class Student{  
int rollno;  
String name;  
double fee;  
Student(int rollno,String name,double fee){  
this.rollno =rollno;  
this.name =name;  
this.fee =fee;
}
public void display_info() {
System.out.println(" Candidate Name: "+name);
System.out.println(" Candidate's Roll No: "+rollno);
System.out.println(" Amount you deposited is:  "+fee);
System.out.println("\t __________________________________________________ \n");
}
}
class annual_fees{
void fees_structure(){
   System.out.println("\t\t <<<<<< FEES CRITERIA >>>>>> \n");
System.out.println("1 Monthly Tuition Fee (Full Fee Category) Rs. 3,200/- \n" );
System.out.println("\"2 Monthly Tuition Fee (Sibling Fee Category) Rs. 2,400/- \n");
System.out.println("\"3 Admission Fee (At the time of admission for all student categories) Rs. 2,500/-  \n");
System.out.println("\"4 Security Deposit (Refundable) Rs. 2,500/- \n");
System.out.println("\"5 Annual Subscription Fee (Per Academic year for all student categories) Rs. 2,500/- \n");
System.out.println("\"6 Admission Processing Fee (At the time of admission for all student categories) Rs. 200/- \n");
System.out.println("\t __________________________________________________ \n");
}
}
public class case_i {
	public static void main (String [] args) {
		Scanner dh = new Scanner (System.in);
		System.out.println("\nEnter 1 if you are a management member");
		System.out.println("\nEnter 2 if you are a parent");
		char d = dh.next().charAt(0);
		
		switch(d) {
		case '1' :
			System.out.print("\nEnter the school management password: ");
			String password = dh.next();
			
			if(password.equals("@admin01")) {
				System.out.println(" Enter The Class ->  ");
				int cll = dh.nextInt();
				System.out.println(" \tNote: \r\n"+" *) Monthly Tuition Fees From Class 1 To 5 --> Rupees: 2000 \r\n"+" *) Monthly Tuition Fees From Class 6 To 8 --> Rupees: 2500 \r\n"+" *) Monthly Tuition Fees From Class 9 To 10 --> Rupees: 3000 \r\n");

				System.out.println(" Enter Student's Tuition Monthly Fees ->  ");
				double m = dh.nextDouble();
				System.out.println(" Enter Student's Extra Curriculum Activity Fees ->  ");
				double e = dh.nextDouble();
				System.out.println(" Enter Student's Laboratory Fees ->  ");
				double l = dh.nextDouble();

				s_f d1 = new s_f(cll,m,e,l);

				System.out.println(" Write \" Sent\" & Press \" Enter\" To Sent The Vouchers To The Students Via Email:  ");
				String sent = dh.next();

				String enter = (sent.equalsIgnoreCase("sent")) ? "<<< \" VOUCHERS HAS BEEN SENT TO THE STUDENTS SUCCESSFULLY \" >>>":" \" EXIT \"";
				System.out.println(enter);
				System.out.println(" \t_______________________________ \n");
			}
			else {
				System.out.println("\nYour password is incorrect!");
			}
			
				break;
			
		case '2' :
			System.out.println(" \t\t <<<<< WELCOME TO THE ONLINE FEES PAYMENT >>>>> \n");
			Scanner info = new Scanner (System.in);
			System.out.println("\t\t The Annual Fees Structure of Our School is =>");
			annual_fees fees = new  annual_fees();
			fees.fees_structure();

			System.out.println("\t\t Enter the Student Name: ");
			String student1 = info.next();

			   System.out.println("\t\t Enter the Student's Roll NO: ");
			   int roll_no = info.nextInt();
			   
			   System.out.println("\t\t Enter the amount you deposited : ");
			   double amount = info.nextInt();
			   
			   Student s1= new Student(roll_no, "student1", amount);
			s1.display_info();

			System.out.println("\t\t <<<<< THANKYOU FOR YOUR PAYMENT >>>>> \n");

			break;
			
			default:
				System.out.println(" System Error !");
		}
		
	}

}
