package com.krakowapp.krakowapp.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "output_image_url"
})
public class OutputImageUrl {

    @JsonProperty("output_image_url")
    private String outputImageUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public OutputImageUrl(String outputImageUrl) {
        this.outputImageUrl = outputImageUrl;
    }

    public OutputImageUrl() {
    }

    @JsonProperty("output_image_url")
    public String getOutputImageUrl() {
        return outputImageUrl;
    }

    @JsonProperty("output_image_url")
    public void setOutputImageUrl(String outputImageUrl) {
        this.outputImageUrl = outputImageUrl;
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
        return "OutputImageUrl{" +
                "outputImageUrl='" + outputImageUrl + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}

