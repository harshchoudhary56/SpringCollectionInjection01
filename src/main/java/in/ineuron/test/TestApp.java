package in.ineuron.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.College;
import in.ineuron.comp.ContactsInfo;
import in.ineuron.comp.MarksInfo;
import in.ineuron.comp.UniversityInfo;

public class TestApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		MarksInfo marksInfo = factory.getBean("marksInfo", MarksInfo.class);
		System.out.println(Arrays.toString(marksInfo.getMarks()));
		System.out.println(marksInfo);
		
		College college = factory.getBean("college", College.class);
		System.out.println(college);
		
		ContactsInfo contactsInfo = factory.getBean("contact", ContactsInfo.class);
		System.out.println(contactsInfo);
		
		UniversityInfo universityInfo = factory.getBean("universityInfo", UniversityInfo.class);
		System.out.println(universityInfo);
		
		factory.close();
	}

}
