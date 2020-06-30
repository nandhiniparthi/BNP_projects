package com.app.bo;

import java.io.File;
import java.util.List;

public interface FileBo {

		public void createDirectories(String name);
		//public void addfile(String name);
		public void deletefile(String name);
		public void searchfile(String name);
		public void sortfilesinaccorder();
		public void getAllFiles();
		
}
