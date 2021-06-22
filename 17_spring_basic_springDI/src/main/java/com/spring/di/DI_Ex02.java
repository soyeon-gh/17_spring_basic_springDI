package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DI_Ex02 {
	
	@RequestMapping(value="/diEx02")
	public String diEx02() {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:CharacterApplicationContext.xml");
		
		// 방법 1, 2, 3) 
		//CharacterManager2 cm2 = ctx.getBean("characterManager2", CharacterManager2.class); 
		// getBean("bean id", 클래스명.class);
		//CharacterManager2 cm2 = (CharacterManager2)ctx.getBean("characterManager2"); 		
		// (클래스명)getBean("bean id");
		CharacterManager2 cm2 = ctx.getBean(CharacterManager2.class);						
		// 클래스가 유일한 경우 bean의 id값을 생략할 수 있다.
		//getBean(클래스명.class);
		
		System.out.println("\n ================= XML 파일을 통한 객체 주입 =================");
		Warrior warrior1  = ctx.getBean("warrior", Warrior.class);
		Wizard  wizard1   = ctx.getBean("wizard" , Wizard.class);
		Hunter  hunter1_1 = ctx.getBean("hunter1", Hunter.class);
		Hunter  hunter1_2 = ctx.getBean("hunter2", Hunter.class);
		
		cm2.setWarrior(warrior1);
		cm2.printCharacter1Info();
		
		cm2.setWizard(wizard1);
		cm2.printCharacter2Info();
		
		cm2.setHunter(hunter1_1);
		cm2.printCharacter3Info();
		
		cm2.setHunter(hunter1_2);
		cm2.printCharacter3Info();
		
		System.out.println("-------------------------------------------");
		
		// xml 파일에 설정값이 1개만 있으면 bean의 id 생략 가능
		
		Warrior warrior2 = ctx.getBean(Warrior.class);
		Wizard  wizard2  = ctx.getBean(Wizard.class);
		Hunter  hunter2  = ctx.getBean(Hunter.class); // bean id 생략 불가
		
		
		cm2.setWarrior(warrior2);
		cm2.printCharacter1Info();
		
		cm2.setWizard(wizard2);
		cm2.printCharacter2Info();
		
		cm2.setHunter(hunter2);
		cm2.printCharacter3Info();
		
		return "home";
	}
}
