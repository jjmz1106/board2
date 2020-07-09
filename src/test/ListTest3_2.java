package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3_2 {
	public static void main(String[] args) {
		String[] fNames = {"김","이","박","최","맹","신","조"};
		String[] lNames = {"동동","나나","진수","명희","철수","명호","둘리"};
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		for(int i=1;i<=20;i++) {
			String fName = fNames[r.nextInt(7)];
			String lName = lNames[r.nextInt(7)];
			Student s = new Student();
			s.setName(fName + lName);
			s.setGrade(r.nextInt(3)+1);
			stList.add(s);
		}
		List<Student> oneList = new ArrayList<>();
		List<Student> towList = new ArrayList<>();
		List<Student> threeList = new ArrayList<>();

		for(Student s:stList) {
			System.out.println(s);
			if(s.getGrade()==1) {
				oneList.add(s);
			}
			if(s.getGrade()==2) {
				towList.add(s);
			}
			if(s.getGrade()==3) {
				threeList.add(s);
			}
		}
		
		if(oneList.size()>0) {
			System.out.print("1학년 : " + oneList.size() + "명 ");
			for(Student s : oneList) {
				System.out.print(s.getName() + ",");
		}
			System.out.println();
		}
		if(towList.size()>0) {
			System.out.print("2학년 : " + towList.size() + "명 ");
			for(Student s : towList) {
				System.out.print(s.getName() + ",");
		}
			System.out.println();
		}	
		if(threeList.size()>0) {
			System.out.print("3학년 : " + threeList.size() + "명 ");
			for(Student s : threeList) {
				System.out.print(s.getName() + ",");
		}
			System.out.println();
		}
	
	}

}