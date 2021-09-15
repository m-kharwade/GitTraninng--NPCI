package com.npci.designpatterns.creational;

public class Flower {
	
	String smell;
	String color;
	int petalLength;
	int sepalLegth;
	
	public String getSmell() {
		return smell;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getPetalLength() {
		return petalLength;
	}
	
	public int getSepalLegth() {
		return sepalLegth;
	}

	private Flower(FlowerBuilder flowerBuilder) {
		this.color=flowerBuilder.color;
		this.petalLength=flowerBuilder.petalLength;
		this.sepalLegth=flowerBuilder.sepalLegth;
		this.smell=flowerBuilder.smell;
	}
	
	
	public static class FlowerBuilder{
		String smell;
		String color;
		int petalLength;
		int sepalLegth;
		
		public FlowerBuilder setSmell(String smell) {
			this.smell = smell;
			return this;
		}
		public FlowerBuilder setColor(String color) {
			this.color = color;
			return this;
		}
		public FlowerBuilder setPetalLength(int petalLength) {
			this.petalLength = petalLength;
			return this;
		}
		public FlowerBuilder setSepalLegth(int sepalLegth) {
			this.sepalLegth = sepalLegth;
			return this;
		}
		
		public Flower build() {
			//pass the customer builder reference
			return new Flower(this);
		}
	}
	

}
	
