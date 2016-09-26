package in.ac.kletech.cricket;

public class CricketPlayer {
	private String sName;
	private int iNoOfInnings;
	int iTotalRuns;
	private float fBatavg;
	public CricketPlayer(String sName, int iNoOfInnings, int iTotalRuns, float fBatavg) {
		super();
		this.sName = sName;
		this.iNoOfInnings = iNoOfInnings;
		this.iTotalRuns = iTotalRuns;
		this.fBatavg = fBatavg;
	}

	public int getiTotalRuns() {
		return iTotalRuns;
	}

	public String toString()
	{
		return "Name: "+sName+"		No. of innings: "+iNoOfInnings+"	Total runs: "+iTotalRuns+"		Batting avg: "+fBatavg;
	}
	static void sortPlayers(CricketPlayer[] c)
	{
		CricketPlayer temp=new CricketPlayer(null, 0, 0, 0);
		temp=null;
		for(int i=0;i<c.length;i++)
		{
			for(int j=1;j<=(c.length-1);j++)
			{
				if(c[j-1].iTotalRuns>c[j].iTotalRuns)
				{
					temp=c[j-1];
					c[j-1]=c[j];
					c[j]=temp;
				}
			}
		}
	}
	
	static void printPlayers(CricketPlayer c[],int i)
	{
		System.out.println(c[i-1].toString());
	}
	
	static void printPlayers(CricketPlayer c[])
	{
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i].toString());
		}
	}
}
