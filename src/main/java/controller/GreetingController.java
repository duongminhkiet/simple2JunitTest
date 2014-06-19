package controller;

import object.Person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	@RequestMapping("/greeting/helloview")
    public String helloview(@RequestParam(value="name", required=false, defaultValue="default") String name, Model model) {
        model.addAttribute("name", name);
        return "greetingoo";
    }

	@RequestMapping(value = "/greeting/hellojson/{name}", method = RequestMethod.GET)
	public
	@ResponseBody
	String getStr(@PathVariable final String name) throws Exception{
		return name;
	}
	
	@RequestMapping(value = "/greeting/getObject/{name}/{age}/{email}", method = RequestMethod.GET)
	public
	@ResponseBody
	Person getObject(@PathVariable final String name,@PathVariable final int age,@PathVariable final String email) throws Exception {
		System.out.println("--------------------1");
		Person person = new Person();
		person.setAge(age);
		person.setName(name);
		person.setEmail(email);
		return person;
	}
	@RequestMapping
	@ResponseBody
	public String sayHell(){
		return "hello";
	}
}
