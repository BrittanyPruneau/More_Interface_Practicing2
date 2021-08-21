package m02;
/** 
 * Represents an oven that knows how to heat food. 
 * 
 * @author Brittany Pruneau 
 *
 */
public abstract class Oven 
{
	private double size;
	
	/**
	 * @param size
	 */
	public Oven(double size) 
	{
		if(size<=0)
		{
			throw new IllegalArgumentException("The size of the oven eneds to be positive"); 
		}
		
		this.size = size;
	}

	/**
	 * @param size
	 */
	public abstract void heatFood();

	@Override
	public String toString() 
	{
		return super.getClass().getSimpleName() + " " + size + "ft^3 ";
	}
}
