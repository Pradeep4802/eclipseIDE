package com.collection.set;

import java.util.*;

public class TeacherSortByID implements Comparator<Teacher>{
	public int compare(Teacher o1, Teacher o2) {
		
		return o1.getId()-o2.getId();
	}
}
