package in.ac.kletech.University;

import in.ac.kletech.University.University;

public class UniversityDemo {
	public static void main(String[] args) {
		University KLETECH=new University();
		KLETECH.createSchool();
		KLETECH.calcStrength();
		
		for(int i=0;i<KLETECH.noStud.length;i++)
		{
			if(KLETECH.noStud[i]<=120)
				System.out.println("No .of students in "+KLETECH.s[i].getsProgramCode()+" is "+KLETECH.noStud[i]);
			else
				System.out.println("School "+KLETECH.s[i].getsProgramCode()+" does not exist");
		}
	}
}
