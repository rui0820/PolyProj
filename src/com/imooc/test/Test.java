package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {

	public static void main(String[] args) {
		//Animal one = new Animal();
		/*
		 向上转型、隐式转型、自动转型 
		 父类引用指向子类实例
		 可以调用子类重写父类的方法以及父类派生的方法
		 无法调用子类独有方法
		 注意：父类中的静态方法无法被子类重写，所以向上转型后，只能调用到父类原有的静态方法
		 小类转型为大类
		 */
		
		Animal two = new Cat();
		two.say();//父类方法
		Animal three = new Dog();
		
		//one.eat();
		two.eat();
		two.setMonth(2);
		two.getMonth();
		//two.run();
		three.eat();
		System.out.println("-----------");
		/*
		 * 向下转型、强制类型转换
		 * 子类引用指向父类对象，此处必须进行强转，可调用子类特有的方法
		 * 必须满足转型条件才能进行转换
		 * instanceof运算符：返回true/false
		 */
		if (two instanceof Cat) {
			Cat temp = (Cat) two;
			temp.eat();
			temp.getWeight();
			temp.run();
			System.out.println("two可以转换为Cat类型");
		}
		if(two instanceof Dog) {
			Dog temp = (Dog)two;
			temp.eat();
			temp.getSex();
			temp.sleep();
			System.out.println("two可以转换为Dog类型");
		}
		if(two instanceof Animal) {
			System.out.println("two可以转换为Animal类型");
		}
		if(two instanceof Object) {
			System.out.println("two可以转换为Object类型");
		}
	}

}
