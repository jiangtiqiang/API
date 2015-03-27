package controller;

import java.util.List;

import model.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import requestModel.RequestCar;
import service.CommonService;

@Controller
public class CarControll {

//	 @Autowired
//	 private CommonService commonService;

	@RequestMapping("api/get/car")
	@ResponseBody
	public Car getCar(@RequestBody RequestCar car) {
		CommonService commonService = new CommonService();
		Car result = commonService.getCar(car.getCarNo());
		return result;
	}

	@RequestMapping("api/get/allcar")
	@ResponseBody
	public List<Car> getAllCar() {
		CommonService commonService = new CommonService();
		List<Car> list = commonService.getAllCar();
		return list;
	}
}
