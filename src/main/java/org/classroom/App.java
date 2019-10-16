package org.classroom;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
//    	
//    	ClassRoom cls =(ClassRoom)context.getBean("ClassRoom1");
//    	cls.printClassDetails();
//    	
//    	ClassRoom cls2 =(ClassRoom)context.getBean("ClassRoom2");
//    	cls2.printClassDetails();
//    	
//    	ClassRoom cls3 =(ClassRoom)context.getBean("ClassRoom3");
//    	cls3.printClassDetails();
//    	
//    	StudentList stdlist = (StudentList)context.getBean("StudentList1");
//    	stdlist.getStudentList1();
////    	
//    	ClassRoom cls4 = (ClassRoom)context.getBean("FlippedClassRoom");
//    	System.out.println("Duration------------->" + cls4.duration);
//    	
    	ClassRoom clsList= (ClassRoom)context.getBean("classAnno");
    	clsList.printClassDetails();
    	
    	
//    	Student studentObj = (Student) context.getBean("Student", "Sudhindra", gender.male, 1927, 27);
//    	Student studentObj2 = (Student) context.getBean("Student", "Sudhindra2", gender.male, 1927, 27);
//    	System.out.println(studentObj2.getName());
    }
}
