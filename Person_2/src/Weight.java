
public class Weight 
{
	private double value;
	private String unit;
	
	public Weight(double v, String u)
	{
		value = v;
		unit = u;
	}
	
	public double convert(double length, String unitToConvertTo)
	{
		if(unitToConvertTo.equals("g"))
		{
			unit = unitToConvertTo;
			value = length/0.00220462;
			return value;
		}
		else if(unitToConvertTo.equals("lbs"))
		{
			unit = unitToConvertTo;
			value = length;
			return value;
		}
		else if(unitToConvertTo.equals("kg"))
		{
			unit = unitToConvertTo;
			value = length*2.20462;
			return value;
		}
		else if(unitToConvertTo.equals("ton"))
		{
			unit = unitToConvertTo;
			value = length * 2000;
			return value;
		}
		else if(unitToConvertTo.equals("stone"))
		{
			unit = unitToConvertTo;
			value = length*14;
			return value;
		}
		else if(unitToConvertTo.equals("ounce"))
		{
			unit = unitToConvertTo;
			value = length/0.0625;
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
