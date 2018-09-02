package InterfacesAndInheritance;

public interface InterfaceEggLayer extends InterfaceAnimal {
	default public String identifyMyself() {
        return "I am able to lay eggs.";
    }

}
