package Exercise;

import java.util.Comparator;

public class EmployeeCompare implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        // explicitly say whether we return 1, -1, 0 for each scenario:
        if (e1.getExperience() > e2.getExperience()) return 1;
        else if(e1.getExperience() < e2.getExperience()) return -1;
        else return 0;
    }
}
