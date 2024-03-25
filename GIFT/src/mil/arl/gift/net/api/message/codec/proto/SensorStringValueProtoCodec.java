/**
 * Copyright Dignitas Technologies, LLC
 * 
 * This file and its contents are governed by one or more distribution and
 * copyright statements as described in the LICENSE.txt file distributed with
 * this work.
 */
package mil.arl.gift.net.api.message.codec.proto;

import java.util.Optional;

import generated.proto.common.AbstractSensorAttributeValueProto.SensorStringValue;
import mil.arl.gift.common.enums.SensorAttributeNameEnum;
import mil.arl.gift.common.sensor.StringValue;
import mil.arl.gift.net.proto.ProtoCodec;

/**
 * This class is responsible for converting to/from a SensorStringValue message.
 * 
 * @author cpolynice
 *
 */
public class SensorStringValueProtoCodec implements ProtoCodec<SensorStringValue, StringValue> {

    /* Codec that will be used to convert/map the protobuf enum. */
    private static AbstractEnumObjectProtoCodec enumCodec = new AbstractEnumObjectProtoCodec();

    @Override
    public StringValue convert(SensorStringValue protoObject) {
        if (protoObject == null) {
            return null;
        }

        String value = protoObject.hasValue() ? protoObject.getValue().getValue() : null;
        SensorAttributeNameEnum name = (SensorAttributeNameEnum) enumCodec.convert(protoObject.getName());

        return new StringValue(name, value);
    }

    @Override
    public SensorStringValue map(StringValue commonObject) {
        if (commonObject == null) {
            return null;
        }

        SensorStringValue.Builder builder = SensorStringValue.newBuilder();

        builder.setValue(com.google.protobuf.StringValue.of(commonObject.getString()));
        Optional.ofNullable(enumCodec.map(commonObject.getName())).ifPresent(builder::setName);

        return builder.build();
    }

}
