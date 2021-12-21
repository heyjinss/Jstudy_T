package Hyejin.LOTTO;

import java.util.Scanner;

public class LO1_Main {
  
public static void main(String[] args) {
// TODO Auto-generated method stub
  
  //0. controller 객체 선언 
  LO1_Controller ctrl1 = new LO1_Controller();
  
	
        //------------프로세스-------------
        //[1]. 동행복권 결과 검색화면 구성 
        /*   가. DTO 구성 
                (1) L01_Dao : 6개의 값이 합쳐진 dao단에 저장되어있는 값 
                (2) SearchNumber : 사용자로부터 입력받을 vo 6개 자리 값 
             나. 메인화면 구성  (class명: LO1_Main) 
                (1) 6개의 값 입력 
                    -main단에서 사용자로부터 6개의 값을 입력받는다. 
             다. 컨트롤러 단 :메서드 선언 (class명: L01_Controller) 
                (0) 서비스 객체 선언 ( 호출하여 값을 사용하기 위해서) 
                    private LO1_Service service = new LO1_Service();
                (1) 파라미터값, 모델 선언  (SearchNumber s, LO1_Model d)
                (2) 모델값 선언 d.addAttribute1("slist", service.list(s));
             라. 서비스단 서언 
                  
        */
      
        //1.Scanner 클래스 선언 
        //2.목적: 화면(사용자)으로부터 데이터를 입력받는 기능을 제공하는 클래스시용 
		Scanner sc = new Scanner(System.in);
		
		//3.입력: 6개로 나누어 검색할 번호를 입력받는다. 
		System.out.println("첫째칸");
		String num01= sc.nextLine();
		
		System.out.println("둘째칸");
		String num02= sc.nextLine();
		
		System.out.println("셋째칸");
		String num03= sc.nextLine();
		
		System.out.println("넷째칸");
		String num04= sc.nextLine();
		
		System.out.println("다섯째칸");
		String num05= sc.nextLine();
		
		System.out.println("여섯째칸");
		String num06= sc.nextLine();
		
	
		//4.입력받은 값을 SearchNumber에 저장시킴 
		SearchNumber s = new SearchNumber(num01,num02,num03,num04,num05,num06); 
		
		//6. 확인용 
		System.out.println("입력된값:"+"["+ num01+ "]" +"["+ num02+ "]" + "["+ num03+ "]" + "["+ num04+ "]" + "["+ num05+ "]" + "["+ num06+ "]"+"\n");
		System.out.println("#호출된화면# - 검색값 ");
		
		System.out.println(ctrl1.lotoSearch(s, new LO1_Model()));
		
		
		
        }
        }
