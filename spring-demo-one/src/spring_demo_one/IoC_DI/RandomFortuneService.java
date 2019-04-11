package spring_demo_one.IoC_DI;

import java.util.ArrayList;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	
	ArrayList<String> list;
	Random rn;


	public RandomFortuneService() {
		list = new ArrayList<String>();
		
		for(int i = 0; i < 3; i++) {
			list.add(""+ i);
		}
		
		rn = new Random();
	}


	@Override
	public String getFortune() {
		return this.list.get(rn.nextInt(3));
	}

}
