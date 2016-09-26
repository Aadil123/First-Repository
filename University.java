package in.ac.kletech.University;

public class University {
	static final String code1="E030";
	static final String code2="E2410";
	int noStud[]=new int[8];
	static{
		System.out.println("Welcome to KLE Tech. University");
		System.out.println("Code for aided:"+code1);
		System.out.println("Code for Un-aided:"+code2);
	}
	
	School[] s=new School[8];
	
	void createSchool()
	{
		s[0]=new School("121", "ABC", 120, 30);
		s[1]=new School("122", "XYZ", 50, 10);
		s[2]=new School("123", "ABD", 230, 50);
		s[3]=new School("123", "LDD", 30, 10);
		s[4]=new School("125", "DGD", 45, 12);
		s[5]=new School("!26", "LKH", 43, 11);
		s[6]=new School("127", "KJD", 56, 12);
		s[7]=new School("128", "LKF", 221, 60);
	}
	
	void calcStrength()
	{
		for(int i=0;i<s.length;i++)
		{
				noStud[i]=s[i].getiNoOfStud();
		}
	}
}
