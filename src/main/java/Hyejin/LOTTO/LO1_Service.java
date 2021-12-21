package Hyejin.LOTTO;

import java.util.ArrayList;


public class LO1_Service {

	
	//service : [DB처리가 필요없고], [입력]을 통해서 [반복이나 조건처리]가 필요한 부분 
	
	ArrayList<LO1_List> winlist; // DTO를 winlist라는 이름으로 선언하여 사용한다. 
	LO1_Dao dao = new LO1_Dao();  //DAO클래스를 dao로 선언하여 사용한다. 
	
	
	public String list(SearchNumber s) { //SearchNumber DTO를 파라미터값으로 받는 메서드를 선언
	
	    //controller에서 받은 값을 아래에서 확인한다. (s(참조주소).getNum01(값))  
		System.out.println("# 검색리스트 #");
		System.out.println(" - " +"["+ s.getNum01() +"]"+"["+s.num02+"]"+"["+s.num03+"]"+"["+s.num04+"]"+"["+s.num05+"]"+"["+s.num06+"]"+": 검색 결과 ");
		
		
		//1. DAO에 저장된 값을 winlist에 담아주어 controller에서 받은 값과 비교해주기 위해서
		//2. DTO arraylist에 dao의 결과값을 담아준다. 
		
		winlist = dao.list(s); // dao용도 (데이터가 담겨있다.) 
		
		
		//<----------------------------------------------------------------------------------중요부분 ------------------------------------------------------>
		for(LO1_List l:winlist) { //arraylist반복 
		  
			// 사용자가 입력한 6자리 입력값이 [당첨번호]에 있으면 출력 
			if(l.wincode.contains(s.getNum01())
			    ||l.wincode.contains(s.getNum02())
				||l.wincode.contains(s.getNum03())
				||l.wincode.contains(s.getNum04())
				||l.wincode.contains(s.getNum05())
				||l.wincode.contains(s.getNum06())) {
			  
			    //DTO에 있는 메서드 
				l.showInfo(s); 
				
		
				
		
		System.out.println("회차번호"+"\t"+ "날짜"+"\t"+"\t"+"당첨번호"+"\t"+"\t"+"\t"+"보너스번호"+"\t"+"갯수");
		System.out.println("DAO에 전송 데이터: " + s.getNum01());
		//System.out.println("DAO에서 받은 크기:" + dao.list(s).size());//
					
			}
	
		}
		return "완료";
	}

}
	
