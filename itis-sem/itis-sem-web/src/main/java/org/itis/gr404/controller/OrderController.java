package org.itis.gr404.controller;

import org.itis.gr404.dao.OrderRepositoryImpl;
import org.itis.gr404.dao.UserRepositoryImpl;
import org.itis.gr404.entity.Order;
import org.itis.gr404.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class OrderController {
    @Autowired
    OrderRepositoryImpl orderRepository;

    @Autowired
    UserRepositoryImpl userRepository;

    @RequestMapping(value = "/addOrder", method = RequestMethod.GET)
    public ModelAndView showForm() {
        ModelAndView response = new ModelAndView("addOrder");
//        response.addObject("car", new Car());
//        response.addObject("brandList", brandManager.getBrandList());
//        return response;
    }

    @RequestMapping(value = "/addOrder", method = RequestMethod.POST)
    public ModelAndView addCar(@ModelAttribute Order order) {

    }

    @RequestMapping(value = "/orderTable", method = RequestMethod.GET)
    public ModelAndView showList() {
//        ModelAndView response = new ModelAndView("carList");
//        response.addObject("listCar", carManager.getCarList());
//        return response;
    }

}
