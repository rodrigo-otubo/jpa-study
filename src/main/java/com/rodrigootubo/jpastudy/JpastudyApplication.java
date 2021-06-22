package com.rodrigootubo.jpastudy;

import com.rodrigootubo.jpastudy.model.Company;
import com.rodrigootubo.jpastudy.model.Customer;
import com.rodrigootubo.jpastudy.model.Products;
import com.rodrigootubo.jpastudy.repository.basic.CompanyBasicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class JpastudyApplication {

	@Autowired
	private CompanyBasicRepository companyBasicRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpastudyApplication.class, args);
	}

	@PostConstruct
	void populateDb() {
		var companies = Arrays.asList(
				new Company(
						"Rodrigo SA",
						Arrays.asList(
								new Products(
										"Samsung", 10.0D, null,
										Arrays.asList(
												new Customer("Xablau", null),
												new Customer("Curupira", null)
										)
								), new Products(
										"Xiaomi", 5.0D, null,
										Arrays.asList(
												new Customer("Boi Bumba", null),
												new Customer("Saci", null)
										)
								)
						)
				),
				new Company(
						"Kaike SA",
						Arrays.asList(
								new Products(
										"Iphone", 12.0D, null,
										Arrays.asList(
												new Customer("Cuca", null),
												new Customer("Emilia", null)
										)
								),
								new Products(
										"Nokia", 9.0D, null,
										Arrays.asList(
												new Customer("Jepeto", null),
												new Customer("Pinóquio", null)
										)
								)
						)
				)
		);

		companyBasicRepository.saveAll(companies);
	}

}
