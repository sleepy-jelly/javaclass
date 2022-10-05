import java.util.Scanner;

public class class1005Student {
	// define 
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	
	private static final int MAX =10; // MAX == array MAXimum range 
	private static final int MAXSCORE = 100;         // MAXimum value of score
	private static final int MINSCORE = 0;			// MINimum value of score
	private int[] stuNum;
	
	private String[] name;
	
	private int[] kor;
	private int[] eng;
	private int[] math;
	
	private double[] avg;
	private int[] sum;
	
	protected void RESET() {                // reset all data
		for(int i=0; i<MAX;i++) {
			this.stuNum[i]=0;
			this.name[i]="null";
			this.kor[i] =0;
			this.eng[i] =0;
			this.math[i] =0;
			this.avg[i] = 0;
			this.sum[i] = 0;
		}
	}
	///// set by multiple object module
	protected void setFull(String name_,int stuNum_, int kor_, int eng_,int math_, int pointer) {
		
		///data checking start
		if(this.name[pointer]!="null") {
			System.out.println("pointer(location): "+pointer+" has already data over there do you want over write? ");
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
		
		
		this.stuNum[pointer]=stuNum_;
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
	protected void setName(String name_,int pointer) {
		if(pointer>=0&&pointer<MAX) {
		this.name[pointer] =name_;
		}else {
			System.out.println("pointer is out of range");
			return;
		}
	}
	
	protected void setStuNum(int stuNum_,int pointer) {
		if(stuNum_<0||MAX<stuNum_) {
			
			System.out.println("stuNum is out of range");
			return;
		}else if(pointer>=0&&pointer<MAX) {
			this.stuNum[pointer] =stuNum_;
			}else {
				System.out.println("pointer is out of range");
				return;
			}
		
		this.stuNum[pointer]=stuNum_;
	}

	protected void setKor(int kor_,int pointer) {
		if((kor_<MINSCORE&&MAXSCORE>kor_)&&(pointer<MAX&&pointer>=0)) {
			System.out.println("kor is out of range");
			return;
		}
		this.kor[pointer]=kor_;
	}

	protected void setEng(int eng_,int pointer) {
		if((eng_<MINSCORE&&MAXSCORE>eng_)&&(pointer<MAX&&pointer>=0)) {
			System.out.println("eng is out of range");
			return;
		}
		this.eng[pointer]=eng_;
	}

	protected void setMath(int math_,int pointer) {
		if((math_<MINSCORE&&MAXSCORE>math_)&&(pointer<MAX&&pointer>=0)) {
			System.out.println("math is out of range");
			return;
		}
		this.math[pointer]=math_;
	}
	
	//////////////////////////////////////////////////  get
	protected String getName(int pointer) {
		return this.name[pointer];
	}

	protected int getStuNum(int pointer) {
		return this.stuNum[pointer];
	}
	
	protected int getKor(int pointer) {
		return this.kor[pointer];
	}
	
	protected int getEng(int pointer) {
		return this.eng[pointer];
	}
	
	protected int getMath(int pointer) {
		return this.math[pointer];
	}
	
	protected double getAvg(int pointer) {
		this.avg[pointer]=(this.kor[pointer]+this.eng[pointer]+this.math[pointer])/3;
		return avg[pointer];
	}

	protected int getSum(int pointer) {
		this.sum[pointer] =(this.kor[pointer]+this.eng[pointer]+this.math[pointer]);
		return sum[pointer];
	}

	protected String getFullByString(int pointer) {
		
		
		return "a";
	}
}

