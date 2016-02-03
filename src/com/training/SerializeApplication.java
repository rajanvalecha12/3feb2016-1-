package com.training;

public class SerializeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book book = new Book(777,"Python Programming","Yashwant Kanetkar",213);
BookSerializer bookserializer=new BookSerializer();
System.out.println(bookserializer.serialize(book));

/*Book bk=(Book)bookserializer.deserialize();
System.out.println(bk);*/
}
	

}
