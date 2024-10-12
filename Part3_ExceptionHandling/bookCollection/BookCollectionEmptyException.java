package bookCollection;

public class BookCollectionEmptyException extends Exception{
	
	public BookCollectionEmptyException()
	{
		super("Book Collection is empty");
	}
	
	public BookCollectionEmptyException(String s)
	{
		super(s);
	}
}
