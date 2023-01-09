package com.project.kitchenstory.global;

import java.util.ArrayList;
import java.util.List;

import com.project.kitchenstory.model.Product;

public class GlobalData {
	
	public static List<Product>cart;
	
	static {
		cart = new ArrayList<Product>();
	}
	
	

}