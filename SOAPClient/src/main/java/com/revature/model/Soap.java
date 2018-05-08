package com.revature.model;

public class Soap {
	
	private String fragrance;
	private String color;
	private int size;
	
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((fragrance == null) ? 0 : fragrance.hashCode());
		result = prime * result + size;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Soap other = (Soap) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (fragrance == null) {
			if (other.fragrance != null)
				return false;
		} else if (!fragrance.equals(other.fragrance))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Soap [fragrance=" + fragrance + ", color=" + color + ", size=" + size + "]";
	}
	public Soap(String fragrance, String color, int size) {
		super();
		this.fragrance = fragrance;
		this.color = color;
		this.size = size;
	}

	public Soap() {
		super();
	}
}
