package rual.weather.service;

import org.joda.time.DateTime;

import rual.weather.model.WeatherModel;

public interface WeatherService {

	WeatherModel getWeatherData(DateTime calendarDate);
}
