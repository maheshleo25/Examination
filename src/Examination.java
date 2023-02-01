import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.studentManage.Student;
import com.studentManage.StudentDb;

public class Examination {
	public static void main(String[]arg)throws IOException{
		System.out.println("****************Welcome to Examination Details*******************");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("PRESS 1 FOR ADD STUDENT");
			System.out.println("PRESS 2 FOR DELETE");
			System.out.println("PRESS 3 FOR SHOW DETAILS");
			System.out.println("PRESS 4 FOR UPDATE");
			System.out.println("PRESS 5 FOR exit");
			int c =Integer.parseInt(br.readLine());
			
			if (c==1) {
				//add student
				
				System.out.println("Enter Name:");
				String name=br.readLine();
				
				System.out.println("Enter Total Marks:");
				int marks=Integer.parseInt(br.readLine());
				
				
				System.out.println("Enter Phone_no:");
				int phone_no=Integer.parseInt(br.readLine());
				
				//create an object to store student details
				Student st= new Student(name,marks,phone_no);
				boolean ans= StudentDb.insertStudentToDB(st);
				if(ans){
					System.out.println("Insert StudentData Successfully");
					
				}else {
					System.out.println(" Something went wrong...");
				}
				
				System.out.println(st);
				
				
			}
			else if (c==2) {
				//delete detail
				System.out.println("Enter rollno to delete");
				int rollno=Integer.parseInt(br.readLine());
				boolean dl =StudentDb.deleteStudentDb(rollno);
				if(dl) {
					System.out.println("Deleted data successfully");
				}else {
					System.out.println(".....Something went wrong......");
				}
				
				
			}
			else if (c==3) {
				//show details
				StudentDb.ShowAllDetails(); 
			}
			else if (c==4) {
				System.out.println("Enter the  rollno to change the marks");
				int rollno=Integer.parseInt(br.readLine());
				System.out.println("Enter Changing marks");
				int marks=Integer.parseInt(br.readLine());
				boolean up=StudentDb.updateStudentDt(marks,rollno);
				if(up) {
					System.out.println("Update data successfully");
				}else {
					System.out.println(".....Something went wrong......");
				}
				
				
			}
			else if(c==5) {
				//exit
				break;
			}else {
				
			}
			
		}
		System.out.println("*****THANK YOU ITS ENDED******");

	}

}
