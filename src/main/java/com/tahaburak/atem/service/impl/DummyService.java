package com.tahaburak.atem.service.impl;

import com.github.javafaker.Faker;
import com.tahaburak.atem.model.User;
import com.tahaburak.atem.service.IDummyService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Locale;

/**
 * Created by burak on 25.11.2019
 */
@Service
public class DummyService implements IDummyService {
	private Faker faker;

	@PostConstruct
	private void fill() {
		this.faker = generateFaker();
	}

	private Faker generateFaker() {
		return new Faker(new Locale("en-US"));
	}

	@Override
	public User getDummyUserById(Long id) {
		return new User(id, faker.name().firstName(), faker.name().lastName(), faker.date().birthday());
	}
}
