package Exercise;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());

//        if (e1.getName() > e2.getName()) return 1;
//        else if(e1.getName() < e2.getName()) return -1;
//        else return 0;
    }
}



