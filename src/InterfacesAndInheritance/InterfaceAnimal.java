package InterfacesAndInheritance;

public interface InterfaceAnimal {
	default public String identifyMyself() {
        return "I am an animal.";
    }

}
