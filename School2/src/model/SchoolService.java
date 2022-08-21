package model;

import java.util.ArrayList;

public interface SchoolService {
	
	public int indexByTel(String tel);
	
	public void addMember(Member member);
	
	public void printAll();
	
	public Member findmemberByTel(String tel);
	
	public void deleteMemberByTel(String tel);
	
	public void updateMember(Member member);	
	
}