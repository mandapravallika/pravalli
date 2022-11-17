record Student(int rollno, String name,String branch, double height, int age, float fees) {
Student() {
this(10, "Pravallika", "Bsc Cs", 157.2, 22, 25000f); }

 public static void main(String args[]) {
	 
 Student s=new Student(10, "Pravallika", "Bsc Cs", 157.2, 22, 25000f);
 Student s1=new Student(13, "Joshna", "Bsc ", 149.2, 21, 20000);
 Student s2=new Student(20, "Nagu", "Bcom", 144.4, 23, 15000f);
 Student s3=new Student(18, "", "BBA ", 157.2, 22, 35000f);
 
 System.out.println(s);
 System.out.println(s1);
 System.out.println(s2);
 System.out.println(s3);
 }
 }
 
 
 
 