package com.spring.di;

public class CharacterManager2 {
	
	// CharacterManager2 클래스는 Wizard, Warrior, Hunter 클래스들과 결합력(의존성)이 약하다.
	
	Warrior warrior;
	Wizard  wizard;
	Hunter  hunter;
	
	// 방법1 ) 생성자를 통하여 외부 객체를 주입한다.
	public CharacterManager2() {}
	public CharacterManager2(Warrior warrior) {
		this.warrior = warrior;
	}
	public CharacterManager2(Wizard  wizard) {
		this.wizard  = wizard;
	}
	public CharacterManager2(Hunter  hunter) {
		this.hunter  = hunter;
	}
	
	// 방법2) setter 메소드를 통하여 외부 객체를 주입한다.
	public Warrior getWarrior() {
		return warrior;
	}
	public void setWarrior(Warrior warrior) {
		this.warrior = warrior;
	}
	
	public Wizard getWizard() {
		return wizard;
	}
	public void setWizard(Wizard wizard) {
		this.wizard = wizard;
	}
	
	public Hunter getHunter() {
		return hunter;
	}
	public void setHunter(Hunter hunter) {
		this.hunter = hunter;
	}
	
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
