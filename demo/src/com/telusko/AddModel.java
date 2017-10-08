package com.telusko;

// Bean -> Pojo

// Encapsulation

public class AddModel {
	int i;
	int j;
	int result;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public void add() {
		result = i + j;
	}
}
