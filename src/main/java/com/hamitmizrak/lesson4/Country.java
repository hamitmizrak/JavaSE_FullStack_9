package com.hamitmizrak.lesson4;


// Inner Class
public class Country {

    private String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    // Inner class
    public static class City{
        private String cityName;

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }
    }
}


class InnerClassMain{
    public static void main(String[] args) {
        Country country=new Country();
        country.setCountryName("Turkiye");

        Country.City city=new Country.City();
        city.setCityName("Adana");

        System.out.println(country.getCountryName()+" "+city.getCityName());
    }
}
