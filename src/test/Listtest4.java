package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Food{
	private String name;
	private int price;
	private String locale;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", locale=" + locale + "]";
	}
}
public class Listtest4 {
	
	public static void main(String[] args) {
		List<Food> fList = new ArrayList<>();
		String[] locales = {"한식","양식","중식","일식","분식","경양식"};
		Random r = new Random();
		for(int i=1;i<=30;i++) {
			Food f = new Food();
			f.setLocale(locales[r.nextInt(locales.length)]);
			f.setName("음식" + i);
			f.setPrice((r.nextInt(10)+1)*1000);
			fList.add(f);
			System.out.println(f);
		}
		List<Food> maxList = new ArrayList<>();
		List<Food> minList = new ArrayList<>();
		
		Food maxF = fList.get(0);
		Food minF = fList.get(0);
		for(int i=0;i<30;i++) {
			Food f = fList.get(i);
			if(maxF.getPrice()<f.getPrice()) {
				maxF = f;
				
			}
			if(minF.getPrice()>f.getPrice()) {
				minF = f;
				
		}
		}
		for(Food f:fList) {
			if(maxF.getPrice()==f.getPrice()) {
				maxList.add(f);
			}
			if(minF.getPrice()==f.getPrice()) {
				minList.add(f);
			}
		}
		int[] cnts = new int[locales.length];
		for(int i=0;i<locales.length;i++) {
			for(int j=0;j<fList.size();j++) {
				if((locales[i]).equals(fList.get(j).getLocale())) {
					cnts[i]++;
				}
			}
		}
		for(int j=0;j<locales.length;j++) {
			System.out.println(locales[j] + "갯수" + cnts[j]);
		}
		
		System.out.println("제일 비싼 음식 : " + maxF);
		System.out.println(maxList);
		System.out.println("제일 비싼 음식 갯수 : " + maxList.size());
		System.out.println("제일 싼 음식 : " + minF);
		System.out.println(minList);
		System.out.println("제일 싼 음식 갯수 : " + minList.size());
		
	}
}
 /*
  *음식가격은 1000원 부터 10000원까지
  *단 1000단위로 이루어져야함
  *제일 비싼 음식과 제일 저렴한 음식을 찾아서 출력해주시면 됩니다.
  */