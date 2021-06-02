package com.capgemini.vegetable.service;
import java.util.Comparator;

import com.capgemini.vegetable.model.Vegetable;
public class VegetableIdComparator implements Comparator<Vegetable>{

	@Override
	public int compare(Vegetable o1, Vegetable o2) {
		// TODO Auto-generated method stub
		if(o1.getVegid()==o2.getVegid())
			return 0;
		if(o1.getVegid()>o2.getVegid()) 
			return 1;
		return -1;
	}
}