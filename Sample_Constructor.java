class Sample_Constructor {
Sample () {
System.out.println("default constructor");
}

Sample(int a) {
System.out.println("Parameterized_Construcor integer"); }

Sample(String s) {
System.out.println("Parameterized_Constructor string"); }

public static void main(String args[]) {

Sample s1=new Sample();
Sample s2=new Sample(100);
Sample s3=new Sample("Action");

}

}