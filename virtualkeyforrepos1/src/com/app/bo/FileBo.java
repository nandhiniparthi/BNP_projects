package com.app.bo;

public interface FileBo {
	public void createFile(String name);
	//public void addfile(String name);
	public void deletefile(String name);
	public void searchfile(String name);
	public void sortfilesinaccorder();
	public void getAllFiles();
}
