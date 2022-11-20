package Com.Axelor.modular;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import Com.Axelor.School.School;
import Com.Axelor.Student.Student1;

public class SchoolModule  extends  AbstractModule{

	@Override
	protected void configure() {
     bind(School.class) .to(Student1.class); 
     
     bind(String.class).annotatedWith(Names.named("name")).toInstance("jagabadhu");
     bind(String.class).annotatedWith(Names.named("ln")).toInstance("Kar");
	}
}
