package com.javaex.problem02;

public class Depart extends Employee {

	private String department;

	public Depart(String name, int salary, String department) {
        super(name, salary); // 부모 생성자 호출
        this.department = department;
    }
	
    //코드작성
	@Override
	public void getInformation() {
        System.out.println("이름:" + getName() + " 연봉:" + getSalary() + " 부서:" + department);
    }

}
