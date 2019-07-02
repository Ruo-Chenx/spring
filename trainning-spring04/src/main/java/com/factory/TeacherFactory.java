package com.factory;

import com.bean.Teacher;

public class TeacherFactory 
{
   public static Teacher createTeacher()
   {
	   Teacher t1 = new Teacher("老王", 34);
	   return t1;
   }
   
   public  Teacher createTeacher2()
   {
	   Teacher t1 = new Teacher("老张", 34);
	   return t1;
   }
}
