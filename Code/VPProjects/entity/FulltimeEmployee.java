package entity;

public class FulltimeEmployee extends Employee {

	private float basic_salary;
	private float coefficients_salary;

	public float getBasic_salary() {
		return this.basic_salary;
	}

	/**
	 * 
	 * @param basic_salary
	 */
	public void setBasic_salary(float basic_salary) {
		this.basic_salary = basic_salary;
	}

	public float getCoefficients_salary() {
		return this.coefficients_salary;
	}

	/**
	 * 
	 * @param coefficients_salary
	 */
	public void setCoefficients_salary(float coefficients_salary) {
		this.coefficients_salary = coefficients_salary;
	}

	public void show() {
		// TODO - implement FulltimeEmployee.show
		throw new UnsupportedOperationException();
	}

}