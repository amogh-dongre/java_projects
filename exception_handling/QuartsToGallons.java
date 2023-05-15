import java.util.*;
class NumberFormatException extends RuntimeException{
	int type;
	NumberFormatException(int type){
		this.type = type;
	}
	String evalEx(){
		if(type == 1)
			return "Not valid integer";
		else
			return " " ;
	}
	public String toString(){
		return evalEx();
	}
}
class NegativeArraySizeException extends RuntimeException{
	int type1;
	NegativeArraySizeException(int type1){
		this.type1 = type1;
	}
	String EvalEx(){
		if(type1 == 1)
			return "The input should be positive";
		else
			return " " ;
	}
	public String toString(){
		return EvalEx();
	}
}
class QuartsToGallons{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of required array : ");
	String i = sc.nextLine();
	int x = 0;
	try{
		x = Integer.parseInt(i);
		if(x%1==0){
			i = i;
		}
		else{
			i = "5";
			throw new NumberFormatException(1);
		}
	}
	catch(NumberFormatException nfe){
		System.out.println(nfe);
	}
	try{
		x = Integer.parseInt(i);
		if(x > 0)
			i = i;
		else
			throw new NegativeArraySizeException(1);
	}
	catch(NegativeArraySizeException nae){
		System.out.println(nae);
	}
	String[] Quarts = new String[Integer.parseInt(i)];
	System.out.println("Enter the elements : ");
	int q=0;
	for(int j = 0;j<Integer.parseInt(i);j++){
		Quarts[j] = sc.nextLine();
		try{
			q = Integer.parseInt(Quarts[j]);
			if(q%1==0)
				Quarts[j] = Quarts[j];
			else
				throw new NumberFormatException(1);
		}
		catch(NumberFormatException nfe){
			System.out.println(nfe);
		}
	}
	int Gallons[] = new int[Integer.parseInt(i)];
	int[] prod = new int[Quarts.length];
	for(int z =0;z<Quarts.length;z++){
		prod[z]=Integer.parseInt(Quarts[z]);
	}
	for(int z =0;z<Quarts.length;z++){
		Gallons[z]=4*prod[z];
	}
	System.out.println(Arrays.toString(Gallons));
}
}
