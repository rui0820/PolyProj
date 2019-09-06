package com.imooc.people;

public class PeopleTest {
	public static void main(String[] args) {
		Person lili = new Person();
		lili.age = 12;
		//获取成员内部类对象实例
		//方式一:new 外部类.new 内部类
		Person.Heart myHeart = new Person().new Heart();
		System.out.println(myHeart.beat());
		
		//方法二：外部类对象.new 内部类
		myHeart = lili.new Heart();
		System.out.println(myHeart.beat());
		
		//方法三：外部类对象.获取方法
		myHeart = lili.getHeart();
		System.out.println(myHeart.beat());
		
		//获取静态内部类对象实例
		Person.Heart2 myHeart2 = new Person.Heart2();
		System.out.println(myHeart2.beat());
		Person.Heart2.say();
		
		//
		System.out.println(lili.getHeart2());
	}
}
