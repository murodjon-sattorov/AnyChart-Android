package com.anychart.core.gantt;

import com.anychart.APIlib;
import com.anychart.chart.common.listener.ListenersInterface;
import com.anychart.core.Base;

import java.util.Locale;

// class
/**
 * Overlay element class.
 */
public class Overlay extends Base {

    protected Overlay() {

    }

    public static Overlay instantiate() {
        return new Overlay("new anychart.core.gantt.overlay()");
    }

    

    public Overlay(String jsChart) {
        jsBase = "overlay" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the name of DIV class.
     */
    public void className() {
        APIlib.getInstance().addJSLine(jsBase + ".className();");
    }
    /**
     * Setter for the name of DIV class.
     */
    public com.anychart.core.gantt.Overlay className(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".className(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the enabled state.
     */
    public void enabled() {
        APIlib.getInstance().addJSLine(jsBase + ".enabled();");
    }
    /**
     * Setter for the enabled state.
     */
    public com.anychart.core.gantt.Overlay enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Gets the overlay DOM element.
     */
    public void getElement() {
        APIlib.getInstance().addJSLine(jsBase + ".getElement();");
    }
    /**
     * Getter for the DIV identifier.
     */
    public void id() {
        APIlib.getInstance().addJSLine(jsBase + ".id();");
    }
    /**
     * Setter for the DIV identifier.
     */
    public com.anychart.core.gantt.Overlay id(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".id(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
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