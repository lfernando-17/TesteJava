package aplicacao;

import entidade.Dept;
import entidade.Emp;

public class Apl3 {
	public static void main(String[] args) {
		Dept[] depts = new Dept[4];
		Emp[] emps = new Emp[14];
		depts[0] = new Dept(10, "ACCOUNTING", "NEW YORK");
		depts[1] = new Dept(20, "RESEARCH", "DALLAS");
		depts[2] = new Dept(30, "SALES", "CHICAGO");
		depts[3] = new Dept(40, "OPERATIONS", "BOSTON");
		emps[0] = new Emp(7839, "KING", "PRESIDENT", null, "1981, 11, 17", 5000, 0, depts[0]);
		emps[1] = new Emp(7698, "BLAKE", "MANAGER", emps[0], "1981, 5, 1", 2850, 0, depts[2]);
		emps[2] = new Emp(7782, "CLARK", "MANAGER", emps[0], "1981, 6, 9", 2450, 600, depts[0]);
		emps[3] = new Emp(7566, "JONES", "MANAGER", emps[0], "1981, 4, 2", 2975D, 0, depts[1]);
		/*
		 * emps.add(new Emp(7499, "ALLEN", "SALESMAN", emps.get(1), "1981, 2, 20", 1600,
		 * 300, depts.get(2))); emps.add(new Emp(7521, "WARD", "SALESMAN", emps.get(1),
		 * "1981, 2, 22", 1250, 500, depts.get(2))); emps.add(new Emp(7654, "MARTIN",
		 * "SALESMAN", emps.get(1), "1981, 9, 28", 1250, 1400, depts.get(2)));
		 * emps.add(new Emp(7900, "JAMES", "CLERK", emps.get(1), "1981, 12, 3", 950D, 0,
		 * depts.get(2))); emps.add(new Emp(7788, "SCOTT", "ANALYST", emps.get(3),
		 * "1987, 4, 19", 3000, 0,depts.get(1))); emps.add(new Emp(7902, "FORD",
		 * "ANALYST", emps.get(3), "1981, 12, 3", 3000, 0, depts.get(1))); emps.add(new
		 * Emp(7369, "SMITH", "CLERK", emps.get(9), "1980, 12, 17", 800, 0,
		 * depts.get(1)));
		 * 
		 * emps.add(new Emp(7844, "TURNER", "SALESMAN", emps.get(1), "1981, 9, 8", 1500,
		 * 0, depts.get(2))); emps.add(new Emp(7876, "ADAMS", "CLERK", emps.get(8),
		 * "1987, 5, 23", 1100, 350, depts.get(1))); emps.add(new Emp(7934, "MILLER",
		 * "CLERK", emps.get(2), "1982, 1, 23", 1300, 400, depts.get(0)));
		 */
		System.out.println(emps[3]);

	}
}