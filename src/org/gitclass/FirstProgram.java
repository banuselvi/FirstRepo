package org.gitclass;

public class FirstProgram {

private void landTrans() {
	System.out.println("Bus"); 	
}
private void seaTrans() {
	System.out.println("Ship");
}
private void airTrans(){
	System.out.println("Aero");
}
private void india(){
	System.out.println("ind");
}
private void USA(){
	System.out.println("Us");
}

public static void main(String[] args) {
	FirstProgram f=new FirstProgram();
	f.landTrans();
	f.airTrans();
	f.seaTrans();
}
}
