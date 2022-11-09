class Function {

static void printStringCharacters(String s) {

for(int i=0; i<s.length();i++)
System.out.print("\t" +s.charAt(i));
System.out.println();
}
public static void main(String[]args) {

String str = "Wonder";
printStringCharacters(str);

System.out.println(str.indexOf("d"));
System.out.println(str.lastIndexOf("r"));
System.out.println(str.indexOf("h"));

}
}