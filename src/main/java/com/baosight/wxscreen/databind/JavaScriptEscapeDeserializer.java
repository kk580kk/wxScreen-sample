package com.baosight.wxscreen.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.apache.commons.lang.StringEscapeUtils;

import java.io.IOException;

/**
 * Created by GeekSeeker on 1/5/16.
 */
public class JavaScriptEscapeDeserializer extends JsonDeserializer<String> {

    @Override
    public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return StringEscapeUtils.unescapeJavaScript(p.getText());
    }
}
