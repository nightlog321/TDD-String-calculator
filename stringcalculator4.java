package check;
public class stringcalculator4 {

	public static int add(String t){
		if(t.equals("")){
			return 0;
		}

else{
if(t.matches("//(.*)\n(.*)")){
String comma=Character.toString(text.charAt(2));
t=t.substring(4);
}
int sumall=0;
String negative="";
for(String value:lvalues){
if(sti(value)<0){
if(negative.matches("")){
negative=value;
}
else{
negative+=(","+value);
}
}
if(sti(value)<1000){
sumall+=sti(value);
}
if(!negative.equals("")){
			throw new IllegalArgumentException("Negatives not allowed: " + negative);
		}


		return sumall;
}
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
