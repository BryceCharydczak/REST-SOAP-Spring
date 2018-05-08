package com.revature.model;

public class Soap {
	
	
	private String fragrance;
	private String color;
	private int size;
	
	public Soap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Soap(String fragrance, String color, int size) {
		super();
		this.fragrance = fragrance;
		this.color = color;
		this.size = size;
	}

	public String getFragrance() {
		return fragrance;
	}

	public void setFragrance(String fragrance) {
		this.fragrance = fragrance;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Soap [fragrance=" + fragrance + ", color=" + color + ", size=" + size + "]";
	}

	
}