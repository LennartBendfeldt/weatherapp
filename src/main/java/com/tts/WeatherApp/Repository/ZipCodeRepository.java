package com.tts.WeatherApp.Repository;

import com.tts.WeatherApp.Model.ZipCode;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ZipCodeRepository extends PagingAndSortingRepository
        <ZipCode, Long> {


}
