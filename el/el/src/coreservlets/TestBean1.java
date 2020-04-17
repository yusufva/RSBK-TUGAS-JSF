package coreservlets;

import java.util.*;
import javax.faces.bean.*;

@ManagedBean
@ApplicationScoped // Safe since no user state
public class TestBean1 {
  private Date creationTime = new Date();
  private String greeting = "Hello";

  public Date getCreationTime() {
    return(creationTime);
  }

  public String getGreeting() {
    return(greeting);
  }

  public double getRandomNumber() {
    return(Math.random());
  }
}