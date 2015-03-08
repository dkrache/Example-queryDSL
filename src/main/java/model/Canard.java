package model;

import javax.persistence.Entity;

@Entity
public class Canard {
	private String name;
	private int age;

	public Canard() {
		super();
	}

	public Canard(final String name, final int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 */
	public void setAge(final int age) {
		this.age = age;
	}
}
