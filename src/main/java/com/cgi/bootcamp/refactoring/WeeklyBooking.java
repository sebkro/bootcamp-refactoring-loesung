package com.cgi.bootcamp.refactoring;

import java.util.Objects;

public class WeeklyBooking {

	private int cabins = 0;
	private int caravans = 0;
	private int tents = 0;

	public void addTent() {
		tents += 1;
	}

	public void addCaravan() {
		caravans += 1;
	}

	public void addCabin() {
		cabins += 1;
	}

	public int getCabins() {
		return cabins;
	}

	public WeeklyBooking(int cabins, int caravans, int tents) {
		this.cabins = cabins;
		this.caravans = caravans;
		this.tents = tents;
	}

	public WeeklyBooking() {
	}

	public void setCabins(int cabins) {
		this.cabins = cabins;
	}

	public int getCaravans() {
		return caravans;
	}

	public void setCaravans(int caravans) {
		this.caravans = caravans;
	}

	public int getTents() {
		return tents;
	}

	public void setTents(int tents) {
		this.tents = tents;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) { return true; }
		if (o == null || getClass() != o.getClass()) { return false; }
		WeeklyBooking that = (WeeklyBooking) o;
		return cabins == that.cabins &&
			caravans == that.caravans &&
			tents == that.tents;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cabins, caravans, tents);
	}
}
