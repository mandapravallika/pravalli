record Employe(int EmpId, String name, String Dept, float salary) {
Employe() {
this(2,"Pravallika","IT dept",60000f); }

public static void main(String args[]) {
Employe e=new Employe(2,"Pravallika","IT dept",60000f);
Employe e1=new Employe(5, "Supriya","pro dept",50000f);
Employe e2=new Employe(7,"Priyanka","HR dept",45000f);
Employe e3=new Employe(9,"Uma","Admin dept",75000f);
Employe e4=new Employe(10,"Surya","Sales dept",80000f);
Employe e5=new Employe(12,"Lalli","Marketing dept",55000f);

System.out.println(e);
System.out.println(e1);
System.out.println(e2);
System.out.println(e3);
System.out.println(e4);
System.out.println(e5);
}
}

