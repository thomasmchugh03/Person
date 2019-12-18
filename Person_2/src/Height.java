
public class Height 
{
	private double value;
	private String unit;
	
	public Height(double v, String u){
		value = v;
		unit = u;
	}
	
	public double convert(double length, String unitToConvertTo)
	{
		if(unitToConvertTo.equals("cm"))
		{
			unit = unitToConvertTo;
			value = length/100;
			return value;
		}
		else if(unitToConvertTo.equals("m"))
		{
			unit = unitToConvertTo;
			value = length;
			return value;
		}
		else if(unitToConvertTo.equals("km"))
		{
			unit = unitToConvertTo;
			value = length*1000;
			return value;
		}
		else if(unitToConvertTo.equals("in"))
		{
			unit = unitToConvertTo;
			value = length / 37.37;
			return value;
		}
		else if(unitToConvertTo.equals("ft"))
		{
			unit = unitToConvertTo;
			value = length/3.28;
			return value;
		}
		else if(unitToConvertTo.equals("yd"))
		{
			unit = unitToConvertTo;
			value = length*1.09;
			return value;
		}
		else if(unitToConvertTo.equals("mi"))
		{
			unit = unitToConvertTo;
			value = length*1609.344;
			return value;
		}
		else return -1;
	}
	
	public void setValue(double v, String u)
	{		
		this.value = convert(v, u);
	}

	public double getValue(String unit) 
	{
		return convert(this.value, unit);
	}
	
	public String getUnit()
	{
		return this.unit;
	}

	
}
