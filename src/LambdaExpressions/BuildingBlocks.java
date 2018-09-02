package LambdaExpressions;
import java.util.function.*;

public class BuildingBlocks {
	public static void main(String... args) {
		
		BooleanSupplierTest booleanSupplierTest = new BooleanSupplierTest();
		System.out.println(booleanSupplierTest.booleanSupplierTest(()->true));
		System.out.println(booleanSupplierTest.booleanSupplierTest(()-> 1>2? true: false));		
		
		DoubleConsumer dc = x-> { x = x*2; System.out.printf("DoubleConsumerTest with return %f\n", x); return;};
		DoubleConsumerTest doubleConsumerTest = new DoubleConsumerTest();
		doubleConsumerTest.test(2.0, x -> System.out.printf("DoubleConsumerTest with value %f\n", x));
		doubleConsumerTest.test(3.14, dc);
		
		LongSupplierTest longSupplierTest = new LongSupplierTest();
		System.out.printf("Long Supplier Test, %d\n", longSupplierTest.test(() -> 234L));
		System.out.printf("Long Supplier Test2, %d\n", longSupplierTest.test(() -> 987654321L));
		
		Employee employee = new Employee(50000.0);
		Predicate<Employee> matcher = e -> e.getSalary() > 1000;
		
		if (matcher.test(employee)) {
			System.out.println("Above average");
		} else {
			System.out.println("Below average");
		}
		
		new PopulationTest().test(Population::new, population -> population.getCount() > 1000);
		new PopulationTest().test(Population::new, population -> population.getCount() < 1000);
	}

}

class Employee {
	double salary;
	

	public Employee(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

class BooleanSupplierTest {
	
	public boolean booleanSupplierTest(BooleanSupplier booleanSupplier) {
		return booleanSupplier.getAsBoolean();
	}
}

class DoubleConsumerTest {
	public void test (double value, DoubleConsumer doubleConsumer) {
		doubleConsumer.accept(value);
	}
}

class LongSupplierTest {
	public long test(LongSupplier longSupplier) {
		return longSupplier.getAsLong();
	}
}

class Population {
	
	private long count = 10000;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}
}

class PopulationTest {
	
	void test(Supplier<Population> population, Predicate<Population> matcher) {
		if (matcher.test(population.get())) {
			System.out.println("Population criteria matches");
		} else {
			System.out.println("Population criteria does not match");
		}
	}
}