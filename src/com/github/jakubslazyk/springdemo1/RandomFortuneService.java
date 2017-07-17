package com.github.jakubslazyk.springdemo1;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private Random randomGenerator=new Random();
	private String[] Fortunes={
			"That's bad day",
			"That's good day",
			"That's decent day"
	};
	@Override
	public String getFortune() {
		
		return Fortunes[randomGenerator.nextInt(Fortunes.length)];
	}

}
