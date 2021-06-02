package com.capgemini.vegetable.service;

import java.util.Comparator;

import com.capgemini.vegetable.model.Vegetable;

public class VegetableNameComparator implements Comparator<Vegetable>{

	@Override
	public int compare(Vegetable o1, Vegetable o2) {
		// TODO Auto-generated method stub
		return o1.getVegName().compareTo(o2.getVegName());
	}
} 
