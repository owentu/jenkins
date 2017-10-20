package com.ixorp.edi.si;


import com.alibaba.fastjson.JSONObject;
public class GenerateSI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SI");
		
		JSONObject obj = new JSONObject();
		
		obj.put("name", "owen");
		obj.put("tel", "25002636");
		
		
		System.out.println(obj.toString());
	}

}
