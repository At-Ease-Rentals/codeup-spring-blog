package com.codeup.hippogriffspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    private int counter = 0;

    @GetMapping("/counter/{counterInit}")
    @ResponseBody
    public String initCounter(@PathVariable int counterInit){
        counter = counterInit;
        return "counter reset to " + counter;
    }

    @GetMapping("/increment")
    @ResponseBody
    public String incrementCounter() {
         counter++;
        return "counter is now:" + counter;
    }


//    @RequestMapping(path = "/hello", method = RequestMethod.GET)
//    @ResponseBody
//    public String hello() {
//        return "Hello from Spring!";
//
//        @GetMapping(path = "/hello/{personName}")
//        @ResponseBody
//        public String hello (@PathVariable String  personName){
//            return "Hello " + personName;
//        }
//
//        @GetMapping(path = "/hello-msg/{personName}", produces = "applications/json")
//        @ResponseBody
//        public String helloMessage () {
//            ){
//                return String.format("Hello from JSON! %s %s", personName, LocalDate.now());
}