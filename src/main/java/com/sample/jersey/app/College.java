package com.sample.jersey.app;

import java.util.ArrayList;

public class College {
  public String name;
  public String univId;
  public String address;
  public ArrayList<String> departments;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setUnivId(String univId) {
    this.univId = univId;
  }

  public String getUnivId() {
    return getUnivId;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  public void setDepartments(ArrayList<String> departments) {
    this.departments = departments;
  }
}
