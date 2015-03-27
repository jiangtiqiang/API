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
		car.setBrand("��ɯ����");
		car.setCc("8��");
		car.setDate("2015-3-1");
		car.setPrice(new Random().nextInt(3000000) + 1000000);
		car.setType("��������V8");
		car.setWeight("1.2��");
		car.setCarNo(carNo);
		return car;
	}

	public List<Car> getAllCar() {
		List<String> listBrand = new ArrayList<String>();
		listBrand.add("�Ϻ�����");
		listBrand.add("һ������");
		listBrand.add("��������");
		listBrand.add("����");
		listBrand.add("����");
		listBrand.add("�µ�");
		listBrand.add("��������");
		listBrand.add("��ɯ����");
		listBrand.add("����");
		listBrand.add("��˹��˹");
		listBrand.add("���ӵ�");
		List<Car> list = new ArrayList<Car>();
		for (int i = 0; i < 100; i++) {
			Car car = new Car();
			car.setBrand(listBrand.get(new Random().nextInt(listBrand.size() - 1)));
			car.setCc("" + new Random().nextInt(10) + "L");
			car.setDate("2014-" + new Random().nextInt(12) + "-"
					+ new Random().nextInt(30));
			car.setPrice(100000 + new Random().nextInt(3000000));
			car.setType("��׼��");
			car.setWeight(new Random().nextInt(3) + "");
			car.setCarNo("��A214+" + new Random().nextInt(9000));
			list.add(car);
		}
		return list;
	}

	public Person getPerson(String name) {
		Person person = new Person();
		person.setAddress("�ɶ�������" + new Random().nextInt(30) + "��");
		person.setEmail(new Random().nextInt(90000000) + 1000000 + "");
		person.setName(name);
		person.setPhone("1388329443" + new Random().nextInt(10));
		person.setSex("��");
		return person;
	}

	public List<Person> getAllPerson() {
		List<Person> list = new ArrayList<Person>();
		for (int i = 0; i < 10; i++) {
			Person person = new Person();
			person.setAddress("�ɶ�������" + new Random().nextInt(30) + "��");
			person.setEmail(new Random().nextInt(90000000) + 1000000 + "");
			person.setName("����" + i);
			person.setPhone("1388329443" + new Random().nextInt(10));
			person.setSex("��");
			list.add(person);
		}
		return list;
	}
}
