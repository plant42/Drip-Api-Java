package com.plant42.drip.api.callbacks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.plant42.drip.api.enums.Route;
import com.plant42.drip.api.impl.json.DripModule;
import com.plant42.drip.domain.DripError;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCallback {

    protected ObjectMapper objectMapper;
    protected List<DripError> errors;
    protected Route route;
    protected String responseBody;
    protected String errorResponseBody;
    protected int code;

    public abstract void onSuccess();
    public abstract void onFailure();


    protected void initObjectMapper() {
        this.objectMapper  = new com.fasterxml.jackson.databind.ObjectMapper();
        this.objectMapper.registerModule(new DripModule());
        objectMapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
        objectMapper.configure(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS, true);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    protected <T> T deserialize(String body) {
        try {
            JsonNode node = parseNode(body);
            String rootName = route.getRootName();

            if (node.get(rootName) != null) {
                return objectMapper.readerFor(route.getType()).readValue(node.get(rootName));
            } else {
                return objectMapper.readerFor(route.getType()).readValue(node);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    protected void deserializeError(String body) {
        errors = new ArrayList<>();
        JsonNode node = parseNode(body);
        try {
            errors = objectMapper.readerFor(new TypeReference<List<DripError>>(){} ).readValue(node.get("errors"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    protected JsonNode parseNode(String json) {
        System.out.println(json);
        if (json != null && !json.isEmpty()) {
            JsonNode jsonObject;
            try {
                jsonObject = objectMapper.readTree(json);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }

            return jsonObject;

        } else {
            throw new RuntimeException("Blank JSON package");
        }

    }

}
