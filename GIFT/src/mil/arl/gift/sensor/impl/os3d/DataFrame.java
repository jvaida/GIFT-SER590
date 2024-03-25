/**
 * Copyright Dignitas Technologies, LLC
 * 
 * This file and its contents are governed by one or more distribution and
 * copyright statements as described in the LICENSE.txt file distributed with
 * this work.
 */
package mil.arl.gift.sensor.impl.os3d;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.NativeLong;
import com.sun.jna.Structure;

/**
 * This file was autogenerated by <a
 * href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a
 * href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few
 * opensource projects.</a>.<br>
 * For help, please visit <a
 * href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a
 * href="http://rococoa.dev.java.net/">Rococoa</a>, or <a
 * href="http://jna.dev.java.net/">JNA</a>.
 */
@SuppressWarnings("all")
public class DataFrame extends Structure {

    public short wCounter;
    public short wPadding;
    public NativeLong dwSensorsBitMask;
    public double dBatteryCharge;
    // / C type : InertialLabs_SDK_Lite_FullDataEntry[32]
    public FullDataEntry[] DataEntry = new FullDataEntry[32];

    public DataFrame() {
        super();
    }

    protected List<String> getFieldOrder() {
        return Arrays.asList("wCounter", "wPadding", "dwSensorsBitMask",
                "dBatteryCharge", "DataEntry");
    }

    // / @param DataEntry C type : InertialLabs_SDK_Lite_FullDataEntry[32]
    public DataFrame(short wCounter, short wPadding,
            NativeLong dwSensorsBitMask, double dBatteryCharge,
            FullDataEntry DataEntry[]) {
        super();
        this.wCounter = wCounter;
        this.wPadding = wPadding;
        this.dwSensorsBitMask = dwSensorsBitMask;
        this.dBatteryCharge = dBatteryCharge;
        if (DataEntry.length != this.DataEntry.length)
            throw new IllegalArgumentException("Wrong array size !");
        this.DataEntry = DataEntry;
    }

    public static class ByReference extends DataFrame implements
            Structure.ByReference {

    };

    public static class ByValue extends DataFrame implements Structure.ByValue {

    };
}