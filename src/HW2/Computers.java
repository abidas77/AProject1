package HW2;


public class Computers {

	private double speed;
	private int ram, hdd;
	private String cpuVendor, size;
	
	public Computers()
	{
		speed = 1.5;
		ram = 8;
		hdd = 500;
		cpuVendor = "Intel";
		size = "ATX";
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public String getCpuVendor() {
		return cpuVendor;
	}

	public void setCpuVendor(String cpuVendor) {
		this.cpuVendor = cpuVendor;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String toString() {
		return "Computers [speed=" + speed + ", ram=" + ram + ", hdd=" + hdd
				+ ", cpuVendor=" + cpuVendor + ", size=" + size + "]";
	}
	
	
}
