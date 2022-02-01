/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.fr.insset.tpcustomerjabri.managedbeans;

import com.fr.insset.tpcustomerjabri.entities.Customer;
import com.fr.insset.tpcustomerjabri.session.CustomerManager;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
        
@Named(value = "customerMBean")  
@ViewScoped  
public class CustomerMBean implements Serializable {  
  private List <Customer> customerList;  

  @EJB
  private CustomerManager customerManager;  
        
  public CustomerMBean() {  }  
        
  public List <Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  }  
}
