package com.moraesdev.msscbrewery.services;

import com.moraesdev.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
