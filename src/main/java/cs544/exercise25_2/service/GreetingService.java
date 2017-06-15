package cs544.exercise25_2.service;

public class GreetingService implements IGreeting {
	private String greeting;
	private static int initial = 0;
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getMessage(Person person) {
		return greeting + " " + person.getFirstName() + " "
				+ person.getLastName();
	}
	
	public synchronized int calculator(char operator, int value){
		if(operator=='+')
			GreetingService.initial+=value;
		else if(operator=='*')
			GreetingService.initial*=value;
		else if(operator=='/'&&value>0)
			GreetingService.initial/=value;
		
		return GreetingService.initial;
	}
}