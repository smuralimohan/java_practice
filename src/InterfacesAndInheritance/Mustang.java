package InterfacesAndInheritance;

public final class Mustang extends Horse implements InterfaceMammal {
	
	//public int hidethis = 0;
    public static void main(String... args) {
        Mustang myApp = new Mustang();
        System.out.println(myApp.identifyMyself() + myApp.hidethis);
    }
}