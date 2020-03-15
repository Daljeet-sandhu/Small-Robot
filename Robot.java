
import java.awt.Point;

public class Robot
{

    private int num;
    private int x;
    private int y;
    private String[] numArray = new String[100];
    private int[] xArray = new int[100];
    private int[] yArray = new int[100];
	private Point original = new Point(x, y);
	private int k,a=0,b=0,c=0;

	public Robot(Point _original, int _num)
    {  
        original = _original;
        num = _num; 
        k = 1;
        xArray[a] = _original.x;
        yArray[b] = _original.y;
        numArray[c] = getDirection();
        a++;b++;c++;
    }

    public void turnLeft() {
    	num = num - 1;
    	if(num == -1) {
    		num = 3;
    	}
    	k++;
    	xArray[a] = original.x;
		yArray[b] = original.y;
		numArray[c] = getDirection();
    	a++;b++;c++;
    }
    public void turnRight() {
    	num = num + 1;
    	if(num == 4) {
    		num = 0;
    	}
    	k++;
    	xArray[a] = original.x;
		yArray[b] = original.y;
		numArray[c] = getDirection();
    	a++;b++;c++;
    }

    public String getDirection() {
    	if (num == 0)
    	{
    		return "N";
    	}
    	else if (num == 1)
    	{
    		return "E";
    	}
    	else if (num == 2)
    	{
    		return "S";
    	}
    	else
    	{
    		return "W";
    	}
    	
    }
    
    public Point getLocation()
    {
        return original;
    }
    
    
    public void move()
    {
    	if (num == 0)
    	{
    		original.y--;
    		k++;
    		xArray[a] = original.x;
    		yArray[b] = original.y;
    		numArray[c] = getDirection();
    		a++;b++;c++;
    	}
    	else if (num == 1)
    	{
    		original.x++;
    		k++;
    		xArray[a] = original.x;
    		yArray[b] = original.y;
    		numArray[c] = getDirection();
    		a++;b++;c++;
    	}
    	else if (num == 2)
    	{
    		original.y++;
    		k++;
    		xArray[a] = original.x;
    		yArray[b] = original.y;
    		numArray[c] = getDirection();
    		a++;b++;c++;
    	}
    	else if (num == 3)
    	{
    		original.x--;
    		k++;
    		xArray[a] = original.x;
    		yArray[b] = original.y;
    		numArray[c] = getDirection();
    		a++;b++;c++;
    	}
    }
    
    public void printMovementHistory() 
    {
    	int i = 0;
    	while (i<k) 
    	{
    		System.out.println("(" + xArray[i] + "," + yArray[i] + "), " + numArray[i] );
    		i++;
    	}
    }

	public static void main(String[] args)
	{
	// Create a new Robot object with the initial position of (5,5) and
	// initial direction to the East (1).
	lab5Robot robot = new lab5Robot(new Point(5, 5), 1);
	robot.move(); // 6, 5, 1
	robot.turnRight(); // 6, 5, 2
	robot.move(); // 6, 6, 2
	
	robot.move(); // 6, 7, 2
	robot.turnRight(); // 6, 7, 3
	robot.move(); // 5, 7, 3
	robot.move(); // 4, 7, 3
	robot.turnLeft(); // 4, 7, 2
	robot.move(); // 4, 8, 2
	
	Point location = robot.getLocation();
	System.out.println("Location: " + location.x + ", " + location.y);
	System.out.println("Expected: 4, 8");
	System.out.println("Direction: " + robot.getDirection());
	System.out.println("Expected: S");
	
	robot.printMovementHistory();
	}	
}
