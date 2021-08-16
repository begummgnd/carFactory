package code.carFactory.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import code.carFactory.business.abstracts.Car;

@RestController
public class carController {

private Car car;
	  
	  
  @Autowired
  public carController(Car car) {
	  super();
	  this.car=car;
  }
}
