package Com.Axelor.GiveStudent;

import com.google.inject.Inject;

import Com.Axelor.School.School;

public class GetStudent {

	private School school;
	
	
	@Inject
	public GetStudent(School school) {
		super();
		this.school = school;
	}



	
	public void getStudent()
	{
		this.school.StudentName();
	}
}
