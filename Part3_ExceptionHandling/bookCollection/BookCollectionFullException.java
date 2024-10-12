package bookCollection;

public class BookCollectionFullException extends Exception{
	
	public BookCollectionFullException()
	{
		super("Book Collection is full");
	}
	
	public BookCollectionFullException(String s)
	{
		super(s);
	}
}
