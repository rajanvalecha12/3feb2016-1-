package com.training;
import java.io.*;
public class BookSerializer {
public String serialize(Book obj){
	String message = null;
	ObjectOutputStream out=null;
	try{
		out= new ObjectOutputStream(new FileOutputStream(new File("Book.ser")));
		out.writeObject(obj);
		message="one objecvt serialized - press f5 to view file";
	}catch(IOException e){
		System.out.println(e.getMessage());
	}
	finally{
		try{
			out.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	return message;
}
public Object deserialize(){
	Object obj=null;
	
	try(ObjectInputStream oin=new ObjectInputStream(new FileInputStream(new File("Book.ser")))){
		obj=oin.readObject();
	}catch(ClassNotFoundException | IOException e){
		e.printStackTrace();
	}
	
	
	
			return obj;
}
}
