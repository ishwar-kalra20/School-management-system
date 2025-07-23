import java.util.Scanner;

class Student
{
	int roll;
	String name;
	int paper1;
	int paper2;
	int paper3;
}

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

class DuplicateRollException extends Exception {
    public DuplicateRollException(String message) {
        super(message);
    }
}

public class School {
	
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		int a=0,ch=0,ns=0,ts=0,dr=0,k=0,dc=0,ur=0,uch=0
				,urecord=0,sch=0,sroll=0;
		String nn,sname;
		int nmp1=0,urecordp1=0,nmp2=0,urecordp2=0,nmp3=0,urecordp3=0;
		Student s1[]=new Student[20];
		
		boolean p=true;
		System.out.println("Welcome Student Management System");
		do
		{
		
		System.out.println("1. Add Student ");
		System.out.println("2. Show Student ");
		System.out.println("3. Delete Student");
		System.out.println("4. Update Student");
		System.out.println("5. Search Student");
		System.out.println("0 EXIT ");
		System.out.print("Enter your choice :");
		try{
		ch = Integer.parseInt(s.nextLine());
		
		switch(ch)
		
		{
		case 1:
			int ro,f=0;
			System.out.print("Number of Student : ");
			ns=Integer.parseInt(s.nextLine());
			for(int i=0;i<ns;i++){
				s1[a]=new Student();
				System.out.println("Student "+(a+1));
				System.out.print("Roll : ");
				
				ro=Integer.parseInt(s.nextLine());
				
				for(int j=0;j<a;j++)
				{
				    if(s1[j].roll==ro)
				    {
				    	throw new DuplicateRollException("Student Roll Allready avialable");
				    }
				    else
				    {
				    	f++;
				    }	
				}
				if(f==a)
				{
					s1[a].roll=ro;
				}
				
				
				System.out.print("Name :");
				s1[a].name=s.nextLine();
				System.out.println("Marks");
				System.out.print("Paper 1 : ");
				s1[a].paper1=Integer.parseInt(s.nextLine());
				System.out.print("Paper 2 : ");
				s1[a].paper2=Integer.parseInt(s.nextLine());
				System.out.print("Paper 3 : ");
				s1[a].paper3=Integer.parseInt(s.nextLine());
				a++;
			}
			System.out.println("Record Save..!");
			break;
		case 2:
		   System.out.println("Roll\t|Name\t|Paper1\t|Paper2\t|Paper3\t|Total");

		   for (int i = 0; i < a; i++) {
			   if (s1[i].roll != 0) {
		       int total = s1[i].paper1 + s1[i].paper2 + s1[i].paper3;
		       System.out.println(s1[i].roll + "\t|" + s1[i].name + 
		    		   "\t|" + s1[i].paper1 + "\t|" + s1[i].paper2 + "\t|"
		    		   + s1[i].paper3 + "\t|" + total);
		   }
		   }
		   System.out.println("All Record Show..!");
			break;
		case 3:
			System.out.print("Delete Record :\nEnter Student Roll :");
			dr=Integer.parseInt(s.nextLine());
			for(int i=0;i<a;i++)
			{
				if(s1[i].roll == dr)
				{
					System.out.println("Roll : "+s1[i].roll);
					System.out.println("Name : "+s1[i].name);
	               System.out.print("Do You really want to delete this record? (y=1/n=0) :");
                   dc=Integer.parseInt(s.nextLine());	
                   if(dc==1)
                   {
                       s1[i].roll= 0;
                       System.out.println("\n...OK RECORD DELETED\n");
                   }
                   else
                   {
                      System.out.println("...OK NO RECORD DELETED");
                   }
				}
			}
			break;
        case 4:
        	System.out.println("\n");
			System.out.print("Update Record:\nEnter Student Roll :");
			ur=Integer.parseInt(s.nextLine());
			 for(int i=0;i<a;i++)
		     {
		    if(s1[i].roll == ur){
		  	 System.out.println("Update");
		 	 System.out.println("1. Name");
		      System.out.println("2. Paper 1");
		     System.out.println("3. Paper 2");
		      System.out.println("4. Paper 3\n");
		  	 System.out.print("Choice : ");
		  	 uch=Integer.parseInt(s.nextLine());
		       switch(uch)
		  	 {
		      case 1:
		       System.out.println("Roll no : "+s1[i].roll
			 +" Current name : "+s1[i].name);
		       System.out.println("Enter new Name : ");
		       nn=s.nextLine();
		       System.out.println("\nDo You really"
		       		+ " want to update this record? (y(1)/n(0) : ");
		       urecord=Integer.parseInt(s.nextLine());
		       if(urecord == 1)
		       {
		    	   String np1 = nn;
		           s1[0].name = np1;
		    	   System.out.print("...ok Name Updated");
		       }
		       else
		       {
		    	   System.out.print("...ok No Name Updated"); 
		       }
		       
		    break;
		     case 2 :
		    	 System.out.println("Roll no : "+s1[i].roll
		    			 +" Current marks : "+s1[i].paper1);
		     System.out.println("Enter new marks : ");
			  nmp1=Integer.parseInt(s.nextLine());
			  System.out.println("\nDo You really"
			+ " want to update this record? (y(1)/n(0) : ");
		   urecordp1=Integer.parseInt(s.nextLine());
		   if(urecordp1 == 1)
	       {
			   s1[i].paper1 = nmp1;
			   System.out.println("...ok Marks Updated");
	       }
		   else{
			   System.out.println("...ok No Marks Updated");
		   }
		   
		   	 break;
		    case 3:
		    	System.out.println("Roll no : "+s1[i].roll
		    			 +" Current marks : "+s1[i].paper2);
		     System.out.println("Enter new marks : ");
			  nmp2=Integer.parseInt(s.nextLine());
			  System.out.println("\nDo You really"
			+ " want to update this record? (y(1)/n(0) : ");
		   urecordp2=Integer.parseInt(s.nextLine());
		   if(urecordp2 == 1)
	       {
			   s1[i].paper2 = nmp2;
			   System.out.println("...ok Marks Updated");
	       }
		   else{
			   System.out.println("...ok No Marks Updated");
		   }
		     break;
		     case 4:
		    	 System.out.println("Roll no : "+s1[i].roll
		    			 +" Current marks : "+s1[i].paper3);
		     System.out.println("Enter new marks : ");
			  nmp3=Integer.parseInt(s.nextLine());
			  System.out.println("\nDo You really"
			+ " want to update this record? (y(1)/n(0) : ");
		   urecordp3=Integer.parseInt(s.nextLine());
		   if(urecordp3 == 1)
	       {
			   s1[i].paper2 = nmp3;
			   System.out.println("...ok Marks Updated");
	       }
		   else{
			   System.out.println("...ok No Marks Updated");
		   }
		   	 break;
		       }	 
		      }
		    }
		break;
        case 5:
	System.out.println("Search :");
	System.out.println("1. Search By Name");
	System.out.println("2. Search By Roll");
	System.out.println(" Choice : ");
	sch=Integer.parseInt(s.nextLine());
	switch(sch)
	{
	case 1:
		System.out.println("Enter name : ");
		sname=s.nextLine();
		boolean found = false;
		for(int i=0;i<a;i++)
		{
		if(sname.equalsIgnoreCase(s1[i].name)){
		System.out.println("Roll\t|Name\t|Paper1\t|Paper2\t|Paper3\t|Total");
		int total = s1[i].paper1 + s1[i].paper2 + s1[i].paper3;
	       System.out.println(s1[i].roll + "\t|" + s1[i].name + 
	    		   "\t|" + s1[i].paper1 + "\t|" + s1[i].paper2 + "\t|"
	    		   + s1[i].paper3 + "\t|" + total);
	       
		}
		
		if (!found) {
			found = true;
	    System.out.println("No User Find...");
		}
			}
	break;
	case 2:
		System.out.println("Enter roll : ");
		sroll=Integer.parseInt(s.nextLine());
		boolean found1 = false;
		for(int i=0;i<a;i++)
		{
		if(sroll == s1[i].roll){
		System.out.println("Roll\t|Name\t|Paper1\t|Paper2\t|Paper3\t|Total");
		int total = s1[i].paper1 + s1[i].paper2 + s1[i].paper3;
	       System.out.println(s1[i].roll + "\t|" + s1[i].name + 
	    		   "\t|" + s1[i].paper1 + "\t|" + s1[i].paper2 + "\t|"
	    		   + s1[i].paper3 + "\t|" + total);
	       
		}
		
	if (!found1) {
		found1 = true;
	    System.out.println("No User Find...");
	}
			}
		break;
	}
	break;
		case 0:
			System.out.println("T H A N K  Y O U !");
			System.out.println("FOR USING SYSTEM");
			p = false;
			break;
		default:
	        System.out.println("WRONG INPUT");
	        break;
}
		}
		catch(ArithmeticException | NumberFormatException e){
			System.out.println("Wrong data "+e);
		}
		catch(Exception e){
			System.out.println("Something Error "+e);
		}
}while (p);

	}
}
