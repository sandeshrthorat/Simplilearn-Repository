package company.locker.ltd.com;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileApplication {
	 String path="C:\\Users\\user\\Desktop\\File_Operation\\";
	public void Menu() throws IOException 
	{
		int choice=0;
		while(true) {
	System.out.println("|*********************** WELCOME TO **************************|");
	System.out.println("|                                                             |");
	System.out.println("|   ---------------LockedMe.com ----------------------------  |");
	System.out.println("|                                                             |");
	System.out.println("|            Developed By SANDESH THORAT                      |");
	System.out.println("|                                                             |");
	System.out.println("|*************************************************************|");
	
	System.out.println();		
			
	System.out.println("-------------------------------------------");
	System.out.println("|             CHOICE THE MENU             |");
	System.out.println("|-----------------------------------------|");
	System.out.println("| 1. List all the Files                   |");
	System.out.println("| 2. More Options                         |");
	System.out.println("| 3. Exit                                 |");
	System.out.println("-------------------------------------------");
	System.out.println();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice");
	System.out.println();
	try {
	 choice=sc.nextInt();
	}
	catch(Exception e)
	{     
		 System.out.println("This is  Invalid Choice");
		 System.out.println("Once Again Choose Correct Choice ");
		
		Menu();
	
	   // System.out.println("This is  Invalid Choice");
		//System.out.println(e);
		//System.out.println("Once Again Choose Correct Choice ");
		//Menu();
		//System.out.println("pe");
		//System.exit(0);
	}
	switch (choice) {
	case 1: 
	{  //Display list of files
 	 
 	 File f=new File(path);
 	 File filename[]=f.listFiles();
 	 System.out.println("This Files are Present in Your Folder:\\File_Operation\\");
 	 	for(File ff:filename) 
 	 	{
 		System.out.println(ff.getName());
 	 	}
 	 	break;
	 }
	 
	 case 2: 
	 {
		 subMenu();
	 break;
	 }
  	 
	 case 3: 
	 {  
	 System.out.println("|*****************Thank You For Visiting******************|");
	 System.out.println("|                                                         |");
	 System.out.println("|              Visit Again To LockedMe.com                |");
	 System.out.println("|                                                         |");
	 System.out.println("|*********************************************************|");
		 System.exit(0);
		 
  	}
	 
  	 default:
  		 System.out.println("This is  Invalid Choice");
		 System.out.println("Once Again Choose Correct Choice ");
  		 Menu();
		//throw new IllegalArgumentException("Unexpected value: " + choice);
		
	 
	
		}
	}
	}	
	
public void subMenu() throws IOException {
	int choice=0;
	while(true) {
	System.out.println();
	System.out.println("|*******************************************************|");
	System.out.println("|                  CHOOSE THE OPTION YOU WANT           | ");
	System.out.println("|*******************************************************|");
	System.out.println("|                 1. Create File                        |");
	System.out.println("|                 2. Delete File                        |");
	System.out.println("|                 3. Search File                        |");
	System.out.println("|                 4. <----Back To Main Context          |");
	System.out.println("*********************************************************");
	
	System.out.println("");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice");
	System.out.println();
	try {
	 choice=sc.nextInt();
	}
	catch(Exception e)
	{
		 System.out.println("This is  Invalid Choice For File Operation");
		 System.out.println("Once Again Choose Correct Choice ");
		   subMenu();
		
		//System.out.println(e);
	}
	switch (choice) {
	
	 
	 case 1: 
	 {  //File creation
  	
  	 ArrayList<String> al=new ArrayList<>();
  	 System.out.println("Enter the File Name to Create");
  	 System.out.println();
  	 String filename=sc.next();
  	 String finalfilename=path+filename;
  	 File f=new File(finalfilename);
  	 boolean result=f.createNewFile();
  	 	if(result==false) 
  	 	{
  	 		System.out.println("Your File is Not Created");
  	 	}
  	 	else 
  	 	{
  	 		al.add(filename);
  	 		System.out.println("Your File " +filename+ " is Successfully Created at C:\\Users\\user\\Desktop\\File_Operation ");
  	 	}
  	 	break;
	 }
  	 
	 case 2: 
	 {   // Delete the File
		

  	
  	System.out.println("ENTER FILENAME TO DELETE");
  	 System.out.println();
  	 
  	 String filename=sc.next();
  	 String finalfilename=path+filename;
  	
  	 File f=new File(finalfilename);
  
       if( f.delete())
       {
    	   f.delete();
  		 System.out.println("Your File is Deleted");
  			
  	  }
  	 
  	else 
  	{
  		System.out.println("File is not Found");
  	}
		break;
}	
  
        
  	 	
	 case 3: 
  	 {  //search the File
   	
  	 File f=new File(path);
   	 System.out.println("Enter File Name to Search");
   	 System.out.println();
   	 String filenameserach=sc.next();
   	 File filename[]=f.listFiles();
   	 int flag=0;
   	 for(File ff:filename) 
   	 {
   	 		if(ff.getName().equals(filenameserach))
   	 		{
   			 flag=1;
   			  break;
   	 		}
   	 		else 
   	 		{
   	 		flag=0;
   	 		}
   	 
  	 }
   	 if(flag==1) 
   	 {
   		 System.out.println("File is Available");
   	 }
   	 else 
   	 {
   		 System.out.println("File is Not Available");
   	 }
   	 break;
  } 	 
   	 case 4:{
   		       Menu();
   		 }
   	 default:
   		 
   		 System.out.println("This is  Invalid Choice For File Operation");
		 System.out.println("Once Again Choose Correct Choice ");
		 subMenu();
   		 
    	//throw new IllegalArgumentException("Unexpected Value: " + choice);
   	 }
}
}
}	
	


	