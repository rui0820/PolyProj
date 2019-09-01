package com.imooc.animal;

public class Master {
	/*
	 * 喂宠物
	 * 喂猫咪：吃完东西后，主人会带着去玩线球
	 * 喂狗狗：吃完东西后，主人会带着狗狗去睡觉
	 */
	//方案一：编写方法，传入不同类型的动物，调用各自的方法
	public void feed(Cat cat) {
		cat.eat();
		cat.playBall();
	}
	public void feed(Dog dog) {
		dog.eat();
		dog.sleep();
	}
	//方案二：编写方法传入动物的父类，方法中通过类型转换，调用指定子类的方法
	public void feed2(Animal obj) {
		obj.eat();
		if(obj instanceof Cat) {
			Cat temp = (Cat)obj;
			temp.playBall();
		}else if(obj instanceof Dog){
			Dog temp = (Dog)obj;
			temp.sleep();
		}
	}
	/*
	 * 饲养何种宠物
	 * 空闲时间：养狗狗
	 * 空闲时间不多：养猫咪
	 */
	//方案一：
	public Dog hasManyTime() {
		System.out.println("主人休闲时间比较充足，适合养狗狗");
		return new Dog();
	}
	public Cat hasLittleTime() {
		System.out.println("主人平时比较忙碌，适合养猫");
		return new Cat();
	}
	//方案二：
	public Animal raise(boolean isManyTime) {
		if(isManyTime) {
			System.out.println("主人休闲时间比较充足，适合养狗狗");
			return new Dog();
		}else {
			System.out.println("主人平时比较忙碌，适合养猫");
			return new Cat();
		}
	}
}
