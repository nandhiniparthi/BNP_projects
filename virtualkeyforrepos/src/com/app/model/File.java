package com.app.model;

public class File {

	private String name;
	//private String path;

	public File() {
		super();
		// TODO Auto-generated constructor stub
	}

	public File(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "File [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
