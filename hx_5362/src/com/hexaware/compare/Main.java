package com.hexaware.compare;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Emp> a = new ArrayList<Emp>();
		a.add(new Emp(1,"gopi",4892));
		a.add(new Emp(2,"suresh",3456));
		a.add(new Emp(3,"amal",9387));
		a.add(new Emp(4,"jaya",7645));
		System.out.println("sort by Ename");
		
		Collections.sort(a, new NamComp());
		
		Iterator<Emp> i = a.iterator();
		while(i.hasNext()) {
			Emp e = i.next();
			System.out.println(e.eName+" "+ e.eid);
		}
		
//		sort by salary --------
		Collections.sort(a,new SalComp());
		Iterator<Emp> i2 = a.iterator();
		while(i2.hasNext()) {
			Emp e = i2.next();
			System.out.println(e.sal+" "+e.eName+" "+ e.eid);
		}
		
	}
}
