package in.ineuron.comp;

import java.util.Date;
import java.util.List;

public class College {
	
	private List<String> studentNames;
	private List<Date> dateList;
	
	public List<String> getStudentNames() {
		return studentNames;
	}
	
	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
		System.out.println("Implementation class of List is " + studentNames.getClass().getName());
	}
	
	public List<Date> getDateList() {
		return dateList;
	}
	
	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}

	@Override
	public String toString() {
		return "College [studentNames=" + studentNames + ", dateList=" + dateList + "]";
	}
}
