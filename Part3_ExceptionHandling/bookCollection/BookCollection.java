package bookCollection;

import java.util.Arrays;

/**
 * Class to hold a collection of books that allows for the 
 * addition and removal of books
 * @author Drew Elliott
 */
public class BookCollection {
	private String[] books = new String[10];
	private int numBooks;
	
	/**
	 * Default constructor
	 */
	public BookCollection()
	{
		this.books = new String[10];
		this.numBooks = 0;
	}
	
	/**
	 * adds a book to the collection if there is space
	 * @param book the book to be added to the collection
	 */
	public void addBook(String book)
	{
		try
		{
			if(numBooks == 10)
				throw new BookCollectionFullException();
			
			books[numBooks] = book;
			numBooks++;
		}
		catch(BookCollectionFullException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * removes book from collection if collection is non-empty
	 * @param book the book to be removed from the collection
	 */
	public void removeBook(String book)
	{
		try
		{
			if(numBooks == 0)
				throw new BookCollectionEmptyException();
			
			// i holds the index of the book we want to delete
			for(int i = 0; i < numBooks; i++)
			{
				if(books[i].equalsIgnoreCase(book))
				{
					for(int j = i; j < numBooks - 1; j++)
					{
						books[j] = books[j + 1];
					}
					books[numBooks - 1] = null;
					numBooks--;
					return;
				}
			}
		}
		catch(BookCollectionEmptyException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * gets the total number of books in the collection
	 * @return number of books stored
	 */
	public int getBooksCount()
	{
		return numBooks;
	}

	@Override
	public String toString() {
		return "BookCollection [books=" + Arrays.toString(books) + ", \nnumBooks=" + numBooks + "]";
	}
}
