
package CR.util;

/**
 *
 * @author raul.arrabales
 */
public class Time 
{

    private int tick;

    private long milliseconds;

    public Time(int tick, long milliseconds) 
    {
	this.tick = tick;
	this.milliseconds = milliseconds;
    }

    public Time() 
    {
	this.tick = 0;
	this.milliseconds = System.currentTimeMillis();
    }

    public int getTick() 
    {
	return this.tick;
    }

    public long getMilliseconds() 
    {
	return this.milliseconds;
    }

    public void update(Time newTime) 
    {
	this.milliseconds = newTime.milliseconds;
	this.tick = newTime.tick;
    }

    @Override
    public String toString() 
    {
	return Integer.toString(this.tick) + ' ' + Long.toString(this.milliseconds);
    }

}
