package HW2;


public class School {

	private int stuCount, teaCount, passed, failed;
	private static final int staffCount = 10;
	
	public School()
	{
		stuCount = 10;
		teaCount = 3;
		passed = 6;
		failed = 4;
	}
	
	public School(int stuCount, int teaCount, int passed)
	{
		this.stuCount = stuCount;
		this.teaCount = teaCount;
		this.passed = passed;
		this.failed = this.stuCount - this.passed;
	}
	
	public int getBudget()
	{
		return stuCount*100 + teaCount*1000 - failed*30 + staffCount * 100;
	}
	
	public int getFailed()
	{
		return failed;
	}
	
	public void setAllPassed()
	{
		passed = stuCount;
		failed = 0;
	}
	
	public static int getStaffCount()
	{
		return staffCount;
	}
	
	public void setAllFailed()
	{
		failed = stuCount;
		passed = 0;
	}
	
}
