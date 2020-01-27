package demo.demoTest.emp;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;


public class Employee {
	 int eno;
	 String name;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + "]";
	}
	 
}
class Test{
	public static void main(String[] args) {
		List<Employee> list=new LinkedList<Employee>();
		list.add(new Employee(1, "Anish"));
		list.add(new Employee(1, "Cm"));
		list.add(new Employee(3, "Saroj"));
		list.add(new Employee(4, "Layon"));
		Map<Integer,String> map=list.stream().collect(Collectors.toMap(Employee::getEno,Employee::getName,(x,y)->x+" "+y, LinkedHashMap::new));
		//Collections.sort(list, (e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		map.forEach((x,y)->System.out.println(" "+x+" "+y+""));
		System.out.println("aaa"+list);
	}

}
