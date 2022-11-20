package Com.Axelor.Student;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import Com.Axelor.School.School;

public class Student1  implements School{

private	String name;

@javax.inject.Inject @Named("ln")
private String lastnmae;

		@Inject(optional = false)
      public void setName(@Named("name") String name )
      {
    	  this.name=name;
      }

		
	@Override
	public void StudentName() {
		System.out.println("its Student one   "+name+" lastname is "+lastnmae);
		
	}

}
