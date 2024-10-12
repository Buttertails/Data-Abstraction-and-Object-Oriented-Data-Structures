package bookCollection;

public class BookCollectionDemo {
	public static void main(String args[])
	{
		
		BookCollection books = new BookCollection();	//create a book collection object
		String[] bookList = new String[10];				//array to hold the title of books for the collection
		
		//fill the book list with random books
		for(int i = 0; i < 10; i++)
		{
			bookList[i] = ("book title " + (i + 1));
		}
	
		//attempt to remove a book while collection is empty, tests exception
		books.removeBook("book title");
		
		//add the books to the collection
		for(int i = 0; i < bookList.length; i++)
		{
			books.addBook(bookList[i]);
		}
		
		//attempt to add a book while the collection is full, tests exception
		books.addBook("book title");
		
		//Show the books have been added to the collection
		System.out.println(books.toString());
		
		//Remove a book from the collection
		books.removeBook("book title 3");
		
		//Show that the book has been removed from the collection
		System.out.println(books.toString());
		
		//Display the amount of books being stored in the collection
		System.out.println("Number of Books: " + books.getBooksCount());
	}
}
