package com.accp.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/fileup")
public class FileController {
	
	@RequestMapping("/io")
	@ResponseBody
	public void io(@RequestParam MultipartFile file) {
		try {
			
			file.transferTo(new File("D:/img/"+file.getOriginalFilename()));
			String name = file.getOriginalFilename();
			System.out.println("文件名字"+name);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
