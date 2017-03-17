package net.squill.freemarker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;


public class squill_welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration();
		try{
			Template tem=con.getTemplate("src/main/resources/welcome.ftl");
			Map<String,Object> data = new HashMap<String,Object>();
			data.put("name", "Ritapa");
			
			Writer out =new OutputStreamWriter(System.out);
			tem.process(data,out);
			out.flush();
			
			Writer file=new FileWriter(new File("src/main/resources/welcome1.html"));
			tem.process(data,file);
			file.flush();
			
			
		}catch(IOException e){
			e.printStackTrace();
		}catch(TemplateException e){
			e.printStackTrace();
		}
	}
	
}
