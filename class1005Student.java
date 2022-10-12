

import java.util.Scanner;

public class class1005Student {
	// define 
	
	class1005Student(){
		RESET();
	}
	class1005Student(int studentId){
		setstuId(studentId);
		RESET();
		
	}
	
	
	
	
	static StringBuilder sb= new StringBuilder();
	static Scanner sc = new Scanner(System.in);
	
	private static final int MAX =100; // MAX == array MAXimum range 
	private static final int MAXSCORE = 100;         // MAXimum value of score
	private static final int MINSCORE = 0;			// MINimum value of score
	private int[] stuId= new int[MAX];
	
	private String[] name = new String[MAX];
	private String[] address = new String[MAX];
	private String[] sex = new String[MAX];
	private int[] birthday = new int[MAX];
	
	
	private int[] kor =new int[MAX];
	private int[] eng =new int[MAX];
	private int[] math =new int[MAX];
	
	
	
	private double[] avg= new double[MAX];
	private int[] sum= new int[MAX];
	
	
	private int cnt =0;
	private int[] pointerA= new int[MAX];

	protected void RESET() {                // reset all data
		for(int i=0; i<MAX;i++) {
			this.stuId[i]=0;
			this.name[i]="null";
			this.kor[i] =0;
			this.eng[i] =0;
			this.math[i] =0;
			this.avg[i] = 0;
			this.sum[i] = 0;
		}
	}
	
	///// set by multiple object module
	protected void setFull(String name_,int stuId_, int kor_, int eng_,int math_) {
		
		setstuId(stuId_);

		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return;
		}
		
		///data checking start
		if(cnt<MAX) {
			System.out.println("student number(location): "+cnt+" has already data over   do you want over write? ");
			System.out.println("if you want to over write type '1'");
			
			if(sc.nextInt()==1) {
				
				System.out.println("over writing");
				
			}else {
				
				System.out.println("exit");
				
				return;
			}
		}
		
		
		if(pointer<0||pointer>MAX) {
			System.out.println("Number of point is out of range ");
			return;
		}
		
		
		this.stuId[pointer]=stuId_;
		this.name[pointer] = name_;
	
		
		if((kor_<MINSCORE&&MAXSCORE>kor_)&&(pointer<MAX&&pointer>=0)) {
			System.out.println("kor is out of range");
			return;
		}
		this.kor[pointer]=kor_;

		
		
		if((eng_<MINSCORE&&MAXSCORE>eng_)&&(pointer<MAX&&pointer>=0)) {
			System.out.println("eng is out of range");
			return;
		}
		this.eng[pointer]=eng_;
		
		
		
		if((math_<MINSCORE&&MAXSCORE>math_)&&(pointer<MAX&&pointer>=0)) {
			System.out.println("math is out of range");
			return;
		}
		this.math[pointer]=math_;
	}
	
	///// set by single object module
	protected void setName(String name_,int stuId_) {
		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return;
		}
		
		if(pointer>=0&&pointer<MAX) {
		this.name[pointer] =name_;
		}else {
			System.out.println("pointer is out of range");
			return;
		}
	}
	
	protected void setstuId(int stuId_) {
		int pointer =cnt;
		
		if(pointer>=0&&pointer<MAX) {
			this.stuId[pointer] =stuId_;
		}else {
			System.out.println("pointer is out of range");
			return;
		}
		this.pointerA[cnt] = cnt;
		this.stuId[pointer]=stuId_;
		cnt++;
	}

	protected void setKor(int kor_,int stuId_) {
		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return;
		}
		
		
		if((kor_<MINSCORE&&MAXSCORE>kor_)&&(pointer<MAX&&pointer>=0)) {
			System.out.println("kor is out of range");
			return;
		}
		
		this.kor[pointer]=kor_;
	}
	
	
	protected void setEng(int eng_,int stuId_) {
		
		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return;
		}
		
		
		if((eng_<MINSCORE&&MAXSCORE>eng_)&&(pointer<MAX&&pointer>=0)) {
			System.out.println("eng is out of range");
			return;
		}
		this.eng[pointer]=eng_;
	}

	protected void setMath(int math_,int stuId_) {
		
		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return;
		}
		
		if((math_<MINSCORE&&MAXSCORE>math_)&&(pointer<MAX&&pointer>=0)) {
			System.out.println("math is out of range");
			return;
		}
		this.math[pointer]=math_;
	}
	
	/**
	 * @return the address
	 */
	public String getAddress(int stuId_) {
		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return"null";
		}
		return this.address[pointer];
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address, int stuId_) {
		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return;
		}
		this.address[pointer] = address;
	}
	//////////////////////////////////////////////////  get
	protected String getName(int stuId_) {
		
		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return "null";
		}
		
		return this.name[pointer];
	}

	protected int getstuId(int stuId_) {
		

		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return -1;
		}
		
		return this.stuId[pointer];
	}
	
	protected int getKor(int stuId_) {
		
		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return -1;
		}
		
		return this.kor[pointer];
	}
	
	protected int getEng(int stuId_) {
		
		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return -1;
		}
		
		return this.eng[pointer];
	}
	
	protected int getMath(int stuId_) {
		
		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return -1;
		}
		
		return this.math[pointer];
	}
	
	protected double getAvg(int stuId_) {
		
		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return -1;
		}
		
		
		this.avg[pointer]=(this.kor[pointer]+this.eng[pointer]+this.math[pointer])/3;
		return avg[pointer];
	}

	protected int getSum(int stuId_) {
		
		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return -1;
		}
		
		this.sum[pointer] =(this.kor[pointer]+this.eng[pointer]+this.math[pointer]);
		return sum[pointer];
	}

	protected void printFullByString(int stuId_) {

		int pointer= 0;
		boolean idChecker = true;
		
		for(int i =0; i<MAX;i++) {
			if(stuId[i]==stuId_) {
				pointer =cnt;
				idChecker =false;
				break;
			}
		}
		
		if(idChecker==true) {
			System.out.println("  unvalid data");
			return;
		}
		
		sb.setLength(0);
		
		sb.append("학번: "+Integer.toString(stuId[pointer])+" ");
		
		
		sb.append("이름: "+this.name[pointer]+" ");
		
		sb.append("한국어: "+Integer.toString(kor[pointer])+" ");
		
		sb.append("영어: "+Integer.toString(eng[pointer])+" ");
		
		sb.append("수학: "+Integer.toString(math[pointer])+" ");
		getAvg(pointer);
		
		sb.append("평균: "+Double.toString(Math.round(getAvg(pointer)*100)/100)+" ");
		
		
		getSum(pointer);
		
		sb.append("총점수: "+Integer.toString(sum[pointer]));
		System.out.println(sb);
		return;
	}

	
	protected void printNumStud() {
		System.out.println(cnt);
	}
	
}