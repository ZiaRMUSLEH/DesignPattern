package StructuralDP.CompositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class HeadDepartment extends Department{

    List<Department> departments;

    // Constructor
    public HeadDepartment(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    String getName() {
        return departments.stream() // Get the finance and sales objects
                .map(Department::getName)   // "Finance Sales"
                .collect(Collectors.joining(",")); // "Finance","Sales"
    }

    // flatMap() combines all results in a collection.
    @Override
    List<String> getEmployee() {
        return departments.stream()
                .flatMap(d->d.getEmployee().stream())
                .collect(Collectors.toList());
    }
}