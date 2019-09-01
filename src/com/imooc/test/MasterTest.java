package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;
import com.imooc.animal.Master;

public class MasterTest {

	public static void main(String[] args) {
		Master master = new Master();
		Cat one = new Cat();
		Dog two = new Dog();
		master.feed(one);
		master.feed(two);
		master.feed2(one);
		master.feed2(two);
		System.out.println("==============");
		boolean isManyTime = true;
		//方案一
		Animal temp;
		if(isManyTime) {
			temp = master.hasManyTime();
		}else {
			temp = master.hasLittleTime();
		}
		System.out.println(temp);
		System.out.println("--------");
		//方案二
		Animal temp2 = master.raise(isManyTime);
		System.out.println(temp2);
		
	}

}
