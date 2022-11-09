import com.Axelor.BookModule.BookModule;
import com.Axelor.GetBook.GetBook;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {

	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new BookModule());
		GetBook book = injector.getInstance(GetBook.class);
		book.myBook();

	}

}
