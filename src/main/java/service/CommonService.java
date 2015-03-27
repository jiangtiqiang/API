package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import model.Car;
import model.Person;

@Service
public class CommonService {
	public Car getCar(String carNo) {
		Car car = new Car();
		car.setBrand("玛莎拉蒂");
		car.setCc("8升");
		car.setDate("2015-3-1");
		car.setPrice(new Random().nextInt(3000000) + 1000000);
		car.setType("豪华至尊V8");
		car.setWeight("1.2吨");
		car.setCarNo(carNo);
		return car;
	}

	public List<Car> getAllCar() {
		List<String> listBrand = new ArrayList<String>();
		listBrand.add("上海大众");
		listBrand.add("一汽丰田");
		listBrand.add("美国福特");
		listBrand.add("宝马");
		listBrand.add("奔驰");
		listBrand.add("奥迪");
		listBrand.add("长安福特");
		listBrand.add("玛莎拉蒂");
		listBrand.add("宾利");
		listBrand.add("劳斯莱斯");
		listBrand.add("布加迪");
		List<Car> list = new ArrayList<Car>();
		for (int i = 0; i < 100; i++) {
			Car car = new Car();
			car.setBrand(listBrand.get(new Random().nextInt(listBrand.size() - 1)));
			car.setCc("" + new Random().nextInt(10) + "L");
			car.setDate("2014-" + new Random().nextInt(12) + "-"
					+ new Random().nextInt(30));
			car.setPrice(100000 + new Random().nextInt(3000000));
			car.setType("标准型");
			car.setWeight(new Random().nextInt(3) + "");
			car.setCarNo("川A214+" + new Random().nextInt(9000));
			list.add(car);
		}
		return list;
	}

	public Person getPerson(String name) {
		Person person = new Person();
		person.setAddress("成都高新区" + new Random().nextInt(30) + "区");
		person.setEmail(new Random().nextInt(90000000) + 1000000 + "");
		person.setName(name);
		person.setPhone("1388329443" + new Random().nextInt(10));
		person.setSex("男");
		return person;
	}

	public List<Person> getAllPerson() {
		List<Person> list = new ArrayList<Person>();
		for (int i = 0; i < 10; i++) {
			Person person = new Person();
			person.setAddress("成都高新区" + new Random().nextInt(30) + "区");
			person.setEmail(new Random().nextInt(90000000) + 1000000 + "");
			person.setName("杨乐" + i);
			person.setPhone("1388329443" + new Random().nextInt(10));
			person.setSex("男");
			list.add(person);
		}
		return list;
	}
}
