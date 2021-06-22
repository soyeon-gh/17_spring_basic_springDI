package com.spring.di;

public class CharacterManager1 {
	
	// 클래스 내부에서 다른 객체를 생성
	// CharacterManager1 클래스는 Wizard, Warrior, Hunter 클래스에 의존한다.
	// 결합력(의존성)이 강하다.
	
	Warrior warrior = new Warrior();
	Wizard  wizard  = new Wizard();
	Hunter  hunter  = new Hunter();
	
	// 데이터 확인용 메소드
	void printCharacter1Info() {
		System.out.println(warrior.getOccupation() + "/" + warrior.getLevel());
	}
	
	void printCharacter2Info() {
		System.out.println(wizard.getOccupation() + "/" + wizard.getLevel());
	}
	
	void printCharacter3Info() {
		System.out.println(hunter.getOccupation() + "/" + hunter.getLevel());
	}
	
	
}
