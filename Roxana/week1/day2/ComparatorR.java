import java.util.Comparator;

public class ComparatorR implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getVarsta() - o2.getVarsta();

	}

}
