package com.qiancheng.work2;

import java.util.Comparator;

public class CustomComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Person&&o2 instanceof Person){
			Person p1 = (Person)o1;
			Person p = (Person)o2;
			if(p1.getSalary()==p.getSalary()){
				if(p1.getAge()==p.getAge()){
					if(p1.getName().equals(p.getName())){
						if(p1.getBook().getPrice()==p.getBook().getPrice()){
							return p1.getBook().getName().compareTo(p.getBook().getName());
						}
						return (int)(p1.getBook().getPrice()-p.getBook().getPrice());
					}
					return p1.getName().compareTo(p.getName());
				}
				return p1.getAge()-p.getAge();
			}
			return (int)(p1.getSalary()-p.getSalary());
		}
		return 0;
	}

}
