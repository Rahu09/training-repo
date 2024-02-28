package com.hexa.auth.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    static public ModelMapper modelMapper(){
        ModelMapper modelMapper =  new ModelMapper();
        
      modelMapper
      .getConfiguration()
      .setMatchingStrategy(MatchingStrategies.LOOSE);
      
        return modelMapper;
    }
}