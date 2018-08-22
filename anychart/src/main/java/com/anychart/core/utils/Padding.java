package com.anychart.core.utils;

import com.anychart.APIlib;
import com.anychart.chart.common.listener.ListenersInterface;
import com.anychart.core.Base;

import java.util.Arrays;
import java.util.Locale;

// class
/**
 * Stores padding values. Can accept numbers and strings.
Use {@link anychart.core.utils.Padding#set} method to set values.
 */
public class Padding extends Base {

    protected Padding() {

    }

    public static Padding instantiate() {
        return new Padding("new anychart.core.utils.padding()");
    }

    

    public Padding(String jsChart) {
        jsBase = "padding" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the bottom space.<br/>
Returns previously set padding, not the derived pixel value.
     */
    public void bottom() {
        APIlib.getInstance().addJSLine(jsBase + ".bottom();");
    }
    /**
     * Setter for the bottom space.
     */
    public com.anychart.core.utils.Padding bottom(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", value));

        return this;
    }
    /**
     * Setter for the bottom space.
     */
    public com.anychart.core.utils.Padding bottom(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the left space.<br/>
Returns previously set padding, not the derived pixel value.
     */
    public void left() {
        APIlib.getInstance().addJSLine(jsBase + ".left();");
    }
    /**
     * Setter for the left space.
     */
    public com.anychart.core.utils.Padding left(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", value));

        return this;
    }
    /**
     * Setter for the left space.
     */
    public com.anychart.core.utils.Padding left(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Getter for the right space.<br/>
Returns previously set padding, not the derived pixel value.
     */
    public void right() {
        APIlib.getInstance().addJSLine(jsBase + ".right();");
    }
    /**
     * Setter for the right space.
     */
    public com.anychart.core.utils.Padding right(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", value));

        return this;
    }
    /**
     * Setter for the right space.
     */
    public com.anychart.core.utils.Padding right(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", value1, value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", value1, value2, value3, value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number[] value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number[] value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number[] value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number[] value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number[] value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number[] value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number[] value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(Number[] value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(value1), value2, value3, value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String[] value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", arrayToStringWrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String[] value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", arrayToStringWrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String[] value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", arrayToStringWrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String[] value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", arrayToStringWrapQuotes(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String[] value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", arrayToStringWrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String[] value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", arrayToStringWrapQuotes(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String[] value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", arrayToStringWrapQuotes(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Sets all offsets.
     */
    public com.anychart.core.utils.Padding set(String[] value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", arrayToStringWrapQuotes(value1), value2, value3, value4));

        return this;
    }
    /**
     * Getter for the top space.<br/>
Returns previously set padding, not the derived pixel value.
     */
    public void top() {
        APIlib.getInstance().addJSLine(jsBase + ".top();");
    }
    /**
     * Setter for the top space.
     */
    public com.anychart.core.utils.Padding top(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", value));

        return this;
    }
    /**
     * Setter for the top space.
     */
    public com.anychart.core.utils.Padding top(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", wrapQuotes(value)));

        return this;
    }
    public void setOnClickListener(ListenersInterface.OnClickListener listener) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(".listen('pointClick', function(e) {");

        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }

}