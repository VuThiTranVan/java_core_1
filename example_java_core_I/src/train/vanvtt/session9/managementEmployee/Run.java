package train.vanvtt.session9.managementEmployee;

import java.util.ArrayList;
import java.util.Collections;

public class Run {

	public static void main(String[] args) {
		Developer dev = new Developer(1, "ff", true, "danang", 100, "php");
		Tester test = new Tester(2, "cccc", false, "danang", 1200, "ok", 600);

		Employee dev2 = new Developer(3, "aaa", true, "danang", 111, "java");

		ArrayList<Employee> congty = new ArrayList<>();
		congty.add(dev);
		congty.add(test);
		congty.add(dev2);
		congty.add(new Tester(4, "bb", true, "quangnam", 222, "ok", 700));
		congty.add(new Developer(5, "ggg", true, "danang", 150, "ruby"));
		congty.forEach(employee -> employee.displayInfomation());

		System.out.println("--------");
		for (Employee emp : congty) {
			if (emp instanceof Developer) {
				emp.displayInfomation();
			}
		}

	}

}
