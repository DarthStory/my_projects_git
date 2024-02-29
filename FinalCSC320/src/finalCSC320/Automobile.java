package finalCSC320;

public class Automobile {
	
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	
	public Automobile(String make, String model, String color, int year, int mileage) {
		this.setMake(make);
		this.setModel(model);
		this.setColor(color);
		this.setYear(year);
		this.setMileage(mileage);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		return make + model + color + year + mileage;
	}
}