class Car 
{	
 static int doors=4;
 static int headlights=4;
 static int mirrors=2;
 static  int wheels=4;
String name;
double length;
double width;
double height;
String actions;
Car(String name, double length, double width, double height, String actions) {
        this.name=name;
		this.length=length;
		this.width=width;
		this.height=height;
		this.actions=actions;
}		
static void travelling() {
	System.out.println("tavel on the road ");
}
void setName(String name) {
	this.name=name;
}
String getName() {
	return name;
}
void setLength(double length) {
	this.length=length;
}
double getLength() {
	return length;
}
void setWidth(double width) {
	this.width=width;
}
double getwidth() {
	return width;
}
void setHeight(double height) {
    this.height=height;
}
double getheight() {
    return height;
}
void setActions(String actions) {
	this.actions=actions;
}
String getactions() {
	return actions;
}
void print() {
	    System.out.println("Doors :"+doors);
		System.out.println("Headlights:"+headlights);
		System.out.println("Mirrors :"+mirrors);
		System.out.println("Wheels :"+wheels);
		
		System.out.println("Name  :"+name);
		System.out.println("Length :"+length);
		System.out.println("Width :"+width);
		System.out.println("Actions:"+actions);
}
}
class Test1
{
	public static void main (String args[]) {
		Car c=new Car("Marutisuzuki",68.31,60.24,96.46,"pick up and drop the travellers");
		c.print();
	}
}