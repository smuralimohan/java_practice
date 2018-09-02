package InterfacesAndInheritance;

public class Dragon implements  InterfaceFireBreather, InterfaceEggLayer {

	public static void main (String... args) {
        Dragon myApp = new Dragon();
        System.out.println(myApp.identifyMyself());
    }

}
