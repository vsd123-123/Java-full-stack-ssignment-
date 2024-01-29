interface Drivable {
    void start();
    void stop();
}

interface Flyable {
    void takeOff();
    void land();
}
class car implements Drivable, Flyable 
{
	void start()
	{
		System.out.println("  the car starts wwith keys ");
		}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
