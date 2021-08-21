package guitar;
/**
 * Guiter that is defined by its type(electric or acoustic) 
 * and the number of strings. 
 * 
 * @author Brittany Pruneau 
 *
 */
public class Guitar implements Comparable<Guitar> 
{
	private boolean electric; 
	private int numberOfStrings;
	
	/**
	 * @param electric
	 * @param numberOfStrings
	 */
	public Guitar(boolean electric, int numberOfStrings) 
	{
		this.electric = electric;
		this.numberOfStrings = numberOfStrings;
	}
	@Override
	public String toString() 
	{
		return (electric ? "electric" : "acoustic") + " guitar with " + numberOfStrings + " strings";  
	}
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + (electric ? 1231 : 1237);
		result = prime * result + numberOfStrings;
		return result;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guitar other = (Guitar) obj;
		if (electric != other.electric)
			return false;
		if (numberOfStrings != other.numberOfStrings)
			return false;
		return true;
	}
	@Override
	public int compareTo(Guitar other) 
	{
		if(this.electric != other.electric)
			return this.electric ? 1 : -1; 
		else 
			return this.numberOfStrings - other.numberOfStrings;
	} 
}
