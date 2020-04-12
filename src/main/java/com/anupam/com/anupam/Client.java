package com.anupam.com.anupam;

import java.util.List;

public class Client {
    private int xyz;
    private String name;
    private String clientId;
    private String city;
    List<String> offices;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getOffices() {
        return offices;
    }

    public void setOffices(List<String> offices) {
        this.offices = offices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (xyz != client.xyz) return false;
        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        if (clientId != null ? !clientId.equals(client.clientId) : client.clientId != null) return false;
        if (city != null ? !city.equals(client.city) : client.city != null) return false;
        return offices != null ? offices.equals(client.offices) : client.offices == null;
    }

    @Override
    public int hashCode() {
        int result = xyz;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (offices != null ? offices.hashCode() : 0);
        return result;
    }
}
