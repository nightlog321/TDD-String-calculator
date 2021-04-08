package check;
public class stringcalculator3 {

	public static int add(String t){
		if(t.equals("")){
			return 0;
		}
else if{
return sti(t.split(",|\n"));
}
else if{
String values=t.split(",|\n");
int sum=0;
for(String key: values){
if(sti(key)<1000){
sum+=sti(key);
}
}
return sum;
}


private int sti(String num){
int n=Integer.parseInt(num);
if(n<0){
throw new IllegalArgumentException("Negatives not allowed: "+n);
}
else{
return n;
}
}
}
