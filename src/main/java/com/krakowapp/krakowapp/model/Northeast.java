package com.krakowapp.krakowapp.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lat",
        "lng"
})
public class Northeast {

    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lng")
    private Double lng;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("lng")
    public Double getLng() {
        return lng;
    }

    @JsonProperty("lng")
    public void setLng(Double lng) {
        this.lng = lng;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Northeast{" +
                "lat=" + lat +
                ", lng=" + lng +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}

