package day12;

public class Wrapperclass {
   public static void main(String[] args) {
	

	byte b=11;
	int i=12;
	short s=569;
	long l=56788;
	float f=56.98f;
	double d=67.987d;
	char c='j';
	boolean boo=true;
	
	//gonna convert the above primitives datas into objects its called as autoboxing
	Byte objB=b;
	Integer objI=i;
	Short objS=s;
	Long objL=l;
	Float objF=f;
	Double objD=d;
	Character objC=c;
	Boolean objBo=boo;
	

	System.out.println("Byte object:"+objB);
	System.out.println("Integer object"+objI);
	System.out.println("Short object"+objS);
	System.out.println("Long object"+objL);
	System.out.println("Float object"+objF);
	System.out.println("Double object"+objD);
	System.out.println("Character object"+objC);
	System.out.println("Character object"+objBo);
	
	//convert objects into primitives is called as unboxing
	byte bytevalue=objB;
	int intvalue=objI;
	short shortvalue=objS;
	long longvalue=objL;
	float floatvalue=objF;
	double doublevalue=objD;
	char charvalue=objC;
	boolean boovalue=objBo;
	
	System.out.println("byte value:"+bytevalue);
	System.out.println("int  value"+intvalue);
	System.out.println("shortvalue"+shortvalue);
	System.out.println("longvalue"+longvalue);
	System.out.println("floatvalue"+floatvalue);
	System.out.println("doublevalue"+doublevalue);
	System.out.println("charvalue"+charvalue);
	System.out.println("Character object"+boovalue);
	
	
	
}
	
	
	
	

}
