
public class Age 
{
	private double value;
	private String unit;
	
	public Age(double v, String u){
		value = v;
		unit = u;
		convertAge();
	}
	
	public double getAge(){
		return value;
	}
	
	public void setAge(double v, String u){
		value = v;
		unit = u;
		convertAge();
	}
	
	public void  incrementAge(String u, double v){
		if(unit.equals("min")){
			value += 0.00000190258;
		}
		else if(unit.equals("hr")){
			value += 0.000114155;
		}
		else if(unit.equals("wk")){
			value+= 0.019178;
		}
		else if(unit.equals("m")){
			value += 0.08333333;
		}
		else if(unit.equals("yr")){
			value += 1;
		}
	}
	
	//this method converts the given value, with it's already specified units, to years.
	public void convertAge(){
		if(unit.equals("min")){
			value /= 525960;
		}
		else if(unit.equals("hr")){
			value /= 8766;
		}
		else if(unit.equals("wk")){
			value/= 52;
		}
		else if(unit.equals("m")){
			value /= 12;
		}
		else if(unit.equals("yr")){
			return;
		}
	}
}
