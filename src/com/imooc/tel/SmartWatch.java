package com.imooc.tel;

public class SmartWatch implements INet,IPhoto{
	public static final int TEMP = 30;
	@Override
	public void network() {
		System.out.println("智能手表可以上网");
	}

	@Override
	public void connection() {
		INet.super.connection();//调用接口中默认的方法
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		
	}

}
