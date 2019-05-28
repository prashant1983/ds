package dp.creation.builder;

import dp.creation.builder.Pizza.Builder;

public class Client {

	public static void main(String[] args) {

		Builder builder = new Builder(12).addBacon().addCheese();
		Pizza pizza = new Pizza(builder);
		System.out.println(pizza);

		Employee employee = new Employee.EmployeeBuilder(12, "Prashant", "Savadi").withOptionalAddress("VBNagar")
				.buildEmployee();
		System.out.println(employee);

	}

}
