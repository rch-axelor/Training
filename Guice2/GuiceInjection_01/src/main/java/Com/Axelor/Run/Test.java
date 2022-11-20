package Com.Axelor.Run;

import com.google.inject.Guice;
import com.google.inject.Injector;

import Com.Axelor.GiveStudent.GetStudent;
import Com.Axelor.modular.SchoolModule;

public class Test {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new SchoolModule());
		GetStudent getStudent = injector.getInstance(GetStudent.class);
		getStudent.getStudent();
	}

}
