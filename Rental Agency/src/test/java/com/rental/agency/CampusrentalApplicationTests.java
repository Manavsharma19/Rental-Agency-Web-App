package com.rental.agency;

import com.rental.agency.controller.PropertyController;
import com.rental.agency.dto.PropertyDTO;
import com.rental.agency.repository.PropertyRepository;
import com.rental.agency.service.PropertyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class CampusrentalApplicationTests {

	@Autowired
	private PropertyService propertyService;

	@MockBean
	private PropertyRepository propertyRepository;

	@Autowired
	private ModelMapper modelMapper;

	@InjectMocks
	private PropertyController propertyController;

	@Test
	void contextLoads() {
	}

}
