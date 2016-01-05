package com.baosight.wxscreen.databind;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.commons.lang.StringEscapeUtils;

import java.io.IOException;

/**
 * Created by GeekSeeker on 1/5/16.
 */
public class JavaScriptEscapeSerializer  extends JsonSerializer<String> {
    @Override
    public void serialize(String value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        int status = ((JsonWriteContext) gen.getOutputContext()).writeValue();
        switch (status) {
            case JsonWriteContext.STATUS_OK_AFTER_COLON:
                gen.writeRaw(':');
                break;
            case JsonWriteContext.STATUS_OK_AFTER_COMMA:
                gen.writeRaw(',');
                break;
            case JsonWriteContext.STATUS_EXPECT_NAME:
                throw new JsonGenerationException("Can not write string value here");
        }
        gen.writeRaw('"');//写入JSON中字符串的开头引号
        gen.writeRaw(StringEscapeUtils.escapeJavaScript(value));
        gen.writeRaw('"');//写入JSON中字符串的结束引号
    }
}
