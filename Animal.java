record Animal(String name, String Breed,double height,int weight,String colour) {
Animal() {
this("Dog","German shepherd", 22,49,"Black"); }

public static void main(String args[]) {

Animal a=new Animal("Dog","German shepherd", 22,49,"Black");
Animal a1=new Animal("Cat","Persian",10,12,"Brown");
Animal a2=new Animal("Tiger", "Bengal Tiger", 10.5, 295,"orange");

System.out.println(a);
System.out.println(a1);
System.out.println(a2);
}
}








