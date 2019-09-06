package com.imooc.people;
//外部类
public class Person {
	public int age;
	
	public Heart getHeart() {
		new Heart().temp = 12;
//		//temp = 33; //无法识别
		return new Heart();
	}
	
	public void eat() {
		System.out.println("人会吃东西");
	}
	//成员内部类
	/*
	 * 1、内部类在外部使用时，无法直接实例化，需要借用外部类信息才能完成实例化
	 * 2、内部类的访问修饰符，可以任意，但是访问范围会受到影响
	 * 3、内部类可以直接访问外部类的成员；如果出现同名的属性，优先访问内部类中定义的
	 * 4、可以使用外部类.this.成员的方式，访问外部类中同名的信息
	 * 5、外部类访问内部类信息，需要通过内部类实例，无法直接访问
	 * 6、内部类编译的class文件命名：外部类$内部类.class
	 * 7、内部类中是否可以包含与外部类相同方法签名的方法？
	 */
	class Heart{
		int age = 13;
		int temp = 22;
		public String beat() {
			eat();
			return Person.this.age + "岁的心脏在跳动";
		}
	}
	
	//静态内部类
	/*
	 * 1、静态内部类中，只能直接访问外部类的静态成员，如果需要调用非静态成员，可以通过对象实例
	 * 2、静态内部类对象实例时，可以不依赖与外部类对象
	 * 3、可以通过外部类.内部类.静态成员的方式，访问内部类中的静态成员
	 * 4、当内部类属性与外部类属性同名时，默认直接调用内部类中的成员；
	 * 	  如果需要访问外部类中的静态属性，则可以通过 外部类.属性 的方式;
	 *    如果需要访问外部类中的非静态属性，则可以通过 new 外部类().属性 的方式;

	 */
	static class Heart2{
		int age = 13;
		int temp = 22;
		static void say() {
			System.out.println("hello");
		}
		public String beat() {
			new Person().eat();
			return new Person().age + "岁的心脏在跳动";
		}
	}
	
	//方法内部类
	/*
	 * 1、定义在方法内部，作用范围也在方法内
	 * 2、和方法内部成员使用规则一样，class前面不可以添加public、private、protected、static
	 * 3、类中不能包含静态成员
	 * 4、类中可以包含final、abstract修饰的成员
	 */
	public Object getHeart2() {
		class Heart3 {
			public int age = 13;
			int temp = 22;

			void say() {
				System.out.println("hello");
			}
			public String beat() {
				new Person().eat();
				return new Person().age + "岁的心脏在跳动";
			}
		}
		return new Heart().beat();
	}
}
