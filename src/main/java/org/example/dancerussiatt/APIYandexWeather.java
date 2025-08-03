package org.example.dancerussiatt;

import java.net.http.HttpHeaders;

public class APIYandexWether {
    private double latitude;
    private double longitude;
    private String url = "https://api.weather.yandex.ru/v2/forecast?lat="+latitude+"&lon="+longitude;
    private String apiKey = "c14d7c0c-ea87-46d4-9bc2-89469a8f78c4";
    
    public void getWather() {
        HttpHeaders headers = new HttpHeaders();
        
    }
}
