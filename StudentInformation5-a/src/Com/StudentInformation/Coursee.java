package Com.StudentInformation;

import java.util.List;

public interface Coursee {
	
	    String getCourseId();
	    String getCourseName();
	    void enrollStudent(student student);
	    List<student> getEnrolledStudents();
	}


