package com.springboot.project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	
	public final String UPLOAD_DIR="D:\\Spring_Tool_Project\\SpringBootPractice\\src\\main\\resources\\static\\image";
	
	public boolean uploadFile(MultipartFile multipartFile)
	{
		boolean f=false;
		
		try {
			  
			//
			InputStream is= multipartFile.getInputStream();
			byte data[]=new byte[is.available()];
			is.read();
			
			//write
			
			FileOutputStream fos=new FileOutputStream(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename());
			fos.write(data);
			
			fos.flush();
			fos.close();
			f=true;
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

}
