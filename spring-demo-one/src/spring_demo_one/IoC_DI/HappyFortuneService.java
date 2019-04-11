package spring_demo_one.IoC_DI;

public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "Today is your lucky day!";
	}
}
