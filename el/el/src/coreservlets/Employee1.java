package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class Employee1 extends Employee {
  public Employee1() {
    super(new Name("Marty", "Hall"),
          new Company("coreservlets.com",
                      "Customized Java EE and Ajax Training"));
  }
}
