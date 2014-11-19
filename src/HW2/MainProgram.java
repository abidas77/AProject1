package HW2;


public class MainProgram {

	public static void main(String[] args)
	{
		Area area = new Area();
		Computers computer = new Computers();
		Fruits fruit = new Fruits(true, "pear", 1.00, 5.50, 10);
		Instruments instrument = new Instruments();
		School school = new School();
		
		System.out.println(area.getAreaCirlce());
		System.out.println(area.getAreaCube());
		System.out.println(area.getAreaRectangle());
		System.out.println(area.getHeight());
		System.out.println(Area.getPI());
		
		System.out.println(computer.getCpuVendor());
		System.out.println(computer.getHdd());
		System.out.println(computer.getRam());
		System.out.println(computer.getSize());
		System.out.println(computer.toString());
		
		System.out.println(fruit.isFresh());
		System.out.println(fruit.getCost());
		System.out.println(fruit.getWeight());
		System.out.println(fruit.getType());
		System.out.println(fruit.getQuantity());
		
		System.out.println(instrument.isPlaying());
		instrument.play();
		System.out.println(instrument.isPlaying());
		instrument.chooseSong("Fur Elise");
		System.out.println(instrument.isTuned());
		instrument.tune();
		System.out.println(instrument.isTuned());
		
		System.out.println(school.getBudget());
		System.out.println(school.getFailed());
		school.setAllFailed();
		System.out.println(school.getFailed());
		school.setAllPassed();
		System.out.println(school.getFailed());
		System.out.println(School.getStaffCount());
		
	}
}
