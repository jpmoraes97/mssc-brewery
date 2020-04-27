package com.moraesdev.msscbrewery.web.mappers;

import com.moraesdev.msscbrewery.domain.Customer;
import com.moraesdev.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);

}
