package com.moraesdev.msscbrewery.web.mappers;

import com.moraesdev.msscbrewery.domain.Beer;
import com.moraesdev.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);

}
