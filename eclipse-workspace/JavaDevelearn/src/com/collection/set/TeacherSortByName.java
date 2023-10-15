package com.collection.set;

import java.util.*;

public class TeacherSortByName implements Comparator<Teacher>{
	public int compare(Teacher o1, Teacher o2) {

		return o1.getName().compareTo(o2.getName()); 
	}
}
