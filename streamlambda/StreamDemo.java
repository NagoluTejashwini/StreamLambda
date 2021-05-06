package streamlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		StreamDemo obj = new StreamDemo();
		//obj.createStreamDemo();
		//obj.terminalOperations();
		//obj.terminalMinMax();
		obj.intermediateFilterOperation();
		//obj.
	}
	void createStreamDemo() {
		
		//approach-1
		List<Employee> empList = new ArrayList<Employee>();
		Employee e = new Employee(100, "Tejashwini", 30000, "p1");
		Employee e1 = new Employee(101, "Mike", 25000, "p1");
		Employee e2 = new Employee(102, "Alex", 20000, "p2");
		Employee e3 = new Employee(102, "Alex", 20000, "p2");
		
		
		empList.add(e);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		//approach-2
		Stream<Employee> s = Stream.of(e,e1,e2,e3);
		s.forEach(i->System.out.println(i));
		
		//approach-3
		Stream<Employee> s1 = Stream.of(new Employee(100,"Tejashwini", 20000, "p1"),
				new Employee(101,"Bob", 30000,"p2"));
		
		//s1.forEach(i->System.out.println(i));
		
		
	}
	
	void terminalOperations() {
		List<Employee> empList = new ArrayList<Employee>();
		Employee e = new Employee(100, "Tejashwini", 30000, "p1");
		Employee e1 = new Employee(101, "Mike", 25000, "p1");
		Employee e2 = new Employee(102, "Alex", 20000, "p2");
		Employee e3 = new Employee(102, "Alex", 20000, "p2");
		
		
		empList.add(e);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		Stream<Employee> s = Stream.of(e,e1,e2,e3);
		long x = s.count();
		System.out.println(x);
		
	}
	void terminalMinMax() {
		List<Integer> list = Arrays.asList(10,11,12,13,1000,34,2341);
		int x = list.stream().max((i,j)->i.compareTo(j)).get();
		System.out.println(x);
		
		List<Employee> empList = new ArrayList<Employee>();
		Employee e = new Employee(100, "Tejashwini", 30000, "p1");
		Employee e1 = new Employee(101, "Mike", 25000, "p1");
		Employee e2 = new Employee(102, "Alex", 20000, "p2");
		Employee e3 = new Employee(102, "Alex", 20000, "p2");
		
		
		empList.add(e);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		//Stream<Employee> s = Stream.of(e,e1,e2,e3);
		Comparator<Employee> bySalary = (emp1,emp2)->emp1.getSalary()-emp2.getSalary();
		//Employee e3 = s.max((i,j)->i.getEmpName().compareTo(j.getEmpName())).get();
		Optional<Employee> e4 = empList.stream().min(bySalary);
		System.out.println(e4);
	}
	
	void intermediateFilterOperation() {
		List<Integer> list = Arrays.asList(10,11,12,13,1000,34,2341);
		List<Integer> list1 = list.stream().filter(x-> x >10 && x < 40).collect(Collectors.toList());
		System.out.println(list1);
		
		List<Employee> empList = new ArrayList<Employee>();
		Employee e = new Employee(100, "Tejashwini", 30000, "p1");
		Employee e1 = new Employee(101, "Mike", 25000, "p1");
		Employee e2 = new Employee(102, "Alex", 20000, "p2");
		Employee e3 = new Employee(102, "Alex", 20000, "p2");
		
		
		empList.add(e);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		Stream<Employee> s = Stream.of(e,e1,e2,e3);
		Comparator<Employee> bySalary = (emp1,emp2)->emp1.getSalary()-emp2.getSalary();
		Optional<Employee> e4 = s.filter(x-> x.getProjectName().equals("p1")).max(bySalary);
		System.out.println(e4);
		
	}
}
