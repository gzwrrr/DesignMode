package com.gontoy.s_interpreter.example;

import java.util.HashMap;



/**
 * @author gzw
 */
public class VarExpression extends Expression {

	private String key;

	public VarExpression(String key) {
		this.key = key;
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}
