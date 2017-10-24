package com.ixorp.edi.si;

import com.alibaba.fastjson.JSONObject;

public class GenerateSI {

	static JSONObject json = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Generate SI Start");
        
        getJSON();
	}
	
	public static void getJSON() {
		json = new JSONObject();
		
		json.put("ID", "B33885");
		json.put("NAME", "OWEN");
		
		System.out.println(json.toString());
	}

}
