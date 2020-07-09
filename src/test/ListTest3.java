package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3 {
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

		int[] nums = new int[3];
		for(Student s:stList) {
			System.out.println(s);
			for(int i=0;i<nums.length;i++) {
				if(s.getGrade()==(i+1)) {
					nums[i]++;
				}
			}

		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				System.out.println(i+1+" 학년 : " + nums[i] + "명");
			}
		}
	}

}
/*
 *위의 리스트는 1-3학년까지 랜덤하게 들어간 리스트입니다.
 *각 학년당 몇명의 학생이있는지 출력하는 프로그램을 만들어 주세요.
 */
 