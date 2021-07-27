package entity;

public class ParttimeEmployee extends Employee {

	private float work_hours;
	private float price_per_hour;

	public float getWork_hours() {
		return this.work_hours;
	}

	/**
	 * 
	 * @param work_hours
	 */
	public void setWork_hours(float work_hours) {
		this.work_hours = work_hours;
	}

	public float getPrice_per_hour() {
		return this.price_per_hour;
	}

	/**
	 * 
	 * @param price_per_hour
	 */
	public void setPrice_per_hour(float price_per_hour) {
		this.price_per_hour = price_per_hour;
	}

	public void show() {
		// TODO - implement ParttimeEmployee.show
		throw new UnsupportedOperationException();
	}

}