package com.imooc.animal;

public class Cat extends Animal {
	//属性：体重
	private double weight;
	
	public Cat() {
		
	}
	public Cat(String name,int month,double weight) {
		super(name,month);
		this.setWeight(weight);
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	//方法：跑动
	public void run() {
		System.out.println("小猫快乐的奔跑");
	}
	//方法：吃东西（重写父类方法）
	@Override
	public void eat() {
		System.out.println("猫吃鱼~~");
	}

	//@Override error static修饰无法在子类中被重写
	//Cat类的独有方法
	public static void say() {
		System.out.println("小猫碰胡须");
	}
	public void playBall() {
		System.out.println("小猫玩线球");
	}
}
