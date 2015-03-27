package controller;

import java.util.List;

import model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import requestModel.RequestPerson;
import service.CommonService;

@Controller
public class PersonControll {

//	@Autowired
//	private CommonService commonService;

	@RequestMapping("api/get/person")
	@ResponseBody
	public Person getPerson(@RequestBody RequestPerson req) {
		CommonService commonService=new CommonService();
		Person person = commonService.getPerson(req.getName());
		return person;
	}

	@RequestMapping("api/get/allperson")
	@ResponseBody
	public List<Person> getAllPerson() {
		CommonService commonService=new CommonService();
		List<Person> list = commonService.getAllPerson();
		return list;
	}
}
