package com.training;

import java.io.*;


public class BookReaderWriter {
	public void addBooks(Book[] book){
        try {
            PrintWriter out = new PrintWriter( new FileWriter("myAccount2.dat"));
            out.println("srivatsan");
            out.println("10099");
            out.println(5000);
            out.close();
            } 
			catch (FileNotFoundException e){ 
			} 
			catch (IOException e) {
			}
         }

	public void printBooks(){
		try {
			FileReader fr = new FileReader("TextFile.txt");
			BufferedReader br = new BufferedReader(fr);
			String line=null;
			try 
			{
				while(( line=br.readLine()) !=null) {
				System.out.println(line); }
			} 
			catch (IOException e) {
			e.printStackTrace();
			} 
			} 
			catch (FileNotFoundException e) {
			e.printStackTrace(); 
			}
	}
}
