package in.ac.kletech.University;

public class School {
	private String sProgramCode;
	private String sSchoolCoordinaator;
	private int iNoOfStud;
	private int iNoOfStaff;
	public School(String sProgramCode, String sSchoolCoordinaator, int iNoOfStud, int iNoOfStaff) {
		super();
		this.sProgramCode = sProgramCode;
		this.sSchoolCoordinaator = sSchoolCoordinaator;
		if(iNoOfStud>120)
			System.out.println("Error. Intake exceeded. School could not be created");
		else
			this.iNoOfStud = iNoOfStud;
		this.iNoOfStaff = iNoOfStaff;
	}
	public int getiNoOfStud() {
		return iNoOfStud;
	}
	public String getsProgramCode() {
		return sProgramCode;
	}
	
	
}
