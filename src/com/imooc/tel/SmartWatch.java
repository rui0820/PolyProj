package com.imooc.tel;

public class SmartWatch implements INet{
	public static final int TEMP = 30;
	@Override
	public void network() {
		System.out.println("智能手表可以上网");
	}

	@Override
	public void connection() {

	}

}
