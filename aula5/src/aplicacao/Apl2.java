package aplicacao;

import java.util.ArrayList;
import entidade.Dept;
import entidade.Emp;

public class Apl2 {
	public static void main(String[] args) {
		ArrayList<Dept> depts = new ArrayList<>();
		ArrayList<Emp> emps = new ArrayList<>();
		depts.add(new Dept(10, "ACCOUNTING", "NEW YORK"));
		depts.add(new Dept(20, "RESEARCH", "DALLAS"));
		depts.add(new Dept(30, "SALES", "CHICAGO"));
		depts.add(new Dept(40, "OPERATIONS", "BOSTON"));
		emps.add(new Emp(7839, "KING", "PRESIDENT", null, "1981, 11, 17", 5000, 0, depts.get(0)));
		emps.add(new Emp(7698, "BLAKE", "MANAGER", emps.get(0), "1981, 5, 1", 2850, 0, depts.get(2)));
		emps.add(new Emp(7782, "CLARK", "MANAGER", emps.get(0), "1981, 6, 9", 2450, 600, depts.get(0)));
		emps.add(new Emp(7566, "JONES", "MANAGER", emps.get(0), "1981, 4, 2", 2975D, 0, depts.get(1)));
		emps.add(new Emp(7499, "ALLEN", "SALESMAN", emps.get(1), "1981, 2, 20", 1600, 300, depts.get(2)));
		emps.add(new Emp(7521, "WARD", "SALESMAN", emps.get(1), "1981, 2, 22", 1250, 500, depts.get(2)));
		emps.add(new Emp(7654, "MARTIN", "SALESMAN", emps.get(1), "1981, 9, 28", 1250, 1400, depts.get(2)));
		emps.add(new Emp(7900, "JAMES", "CLERK", emps.get(1), "1981, 12, 3", 950D, 0, depts.get(2)));
		emps.add(new Emp(7788, "SCOTT", "ANALYST", emps.get(3), "1987, 4, 19", 3000, 0, depts.get(1)));
		emps.add(new Emp(7902, "FORD", "ANALYST", emps.get(3), "1981, 12, 3", 3000, 0, depts.get(1)));

		emps.add(new Emp(7369, "SMITH", "CLERK", emps.get(9), "1980, 12, 17", 800, 0, depts.get(1)));
		emps.add(new Emp(7844, "TURNER", "SALESMAN", emps.get(1), "1981, 9, 8", 1500, 0, depts.get(2)));
		emps.add(new Emp(7876, "ADAMS", "CLERK", emps.get(8), "1987, 5, 23", 1100, 350, depts.get(1)));
		emps.add(new Emp(7934, "MILLER", "CLERK", emps.get(2), "1982, 1, 23", 1300, 400, depts.get(0)));
		System.out.println(emps.get(11).toString());

	}
}