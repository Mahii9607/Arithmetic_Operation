package com.Output;
import com.Addition.Add;
import com.Substraction.Sub;
import com.Multiplication.Mul;
import com.Division.Div;
import com.Percentage.Mod;

public class Arithmetic {

	public static void main(String[] args) {
		
		Add a = new Add();
		a.add(10, 30);
		
		Sub s = new Sub();
		s.sub(60, 10);
		
		
		Mul m = new Mul();
		m.mul(10, 30);
		
		Div d = new Div();
		d.div(10, 60);
		
		Mod k = new Mod();
		k.mod(30, 68);
	}
	
	
	
	
}
