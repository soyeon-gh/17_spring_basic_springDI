package com.spring.di;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DI_Ex01 {

	@RequestMapping(value="/diEx01")
	public String diEx01() {
		
		
		System.out.println("1. 클래스 내부에서 외부 객체를 생성한 예시");
		
		CharacterManager1 cm1 = new CharacterManager1();
		cm1.printCharacter1Info();
		cm1.printCharacter2Info();
		cm1.printCharacter3Info();
		
		System.out.println("\n2. 생성자를 통하여 외부의 객체를 주입한 예시");
		CharacterManager2 cm2 = new CharacterManager2(new Warrior());
		cm2.printCharacter1Info();
		
		cm2 = new CharacterManager2(new Wizard());
		cm2.printCharacter2Info();
		
		cm2 = new CharacterManager2(new Hunter());
		cm2.printCharacter3Info();
		
		System.out.println("\n3. setter를 통하여 외부의 객체를 주입한 예시");
		cm2 = new CharacterManager2();
		cm2.setWarrior(new Warrior());
		cm2.printCharacter1Info();
		
		cm2 = new CharacterManager2();
		cm2.setWizard(new Wizard());
		cm2.printCharacter2Info();
		
		cm2 = new CharacterManager2();
		cm2.setHunter(new Hunter());
		cm2.printCharacter3Info();
		
		
		
		return "home";
	}
	
	
	
	
	
}
