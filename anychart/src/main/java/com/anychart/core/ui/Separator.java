package com.anychart.core.ui;

import com.anychart.APIlib;
import com.anychart.chart.common.listener.ListenersInterface;
import com.anychart.core.VisualBase;

import java.util.Arrays;
import java.util.Locale;

// class
/**
 * Class for a separator element.
 */
public class Separator extends VisualBase {

    protected Separator() {

    }

    public static Separator instantiate() {
        return new Separator("new anychart.core.ui.separator()");
    }

    

    public Separator(String jsChart) {
        jsBase = "separator" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the element state (enabled or disabled).
     */
    public void enabled() {
        APIlib.getInstance().addJSLine(jsBase + ".enabled();");
    }
    /**
     * Setter for the element enabled state.
     */
    public com.anychart.core.ui.Separator enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Getter for the separator fill.
     */
    public void fill() {
        APIlib.getInstance().addJSLine(jsBase + ".fill();");
    }
    /**
     * Setter for separator fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Separator fill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Fill color with opacity.
     */
    public com.anychart.core.ui.Separator fill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill for the separator.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Separator fill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill for the separator.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Separator fill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill for the separator.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Separator fill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill for the separator.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Separator fill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill for the separator.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Separator fill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill for the separator.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Separator fill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill for the separator.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Separator fill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill for the separator.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Separator fill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.math.Rect getRemainingBounds() {
        return new com.anychart.math.Rect(jsBase + ".getRemainingBounds()");
    }
    /**
     * Getter for separator height.
     */
    public void height() {
        APIlib.getInstance().addJSLine(jsBase + ".height();");
    }
    /**
     * Setter for separator height.
     */
    public com.anychart.core.ui.Separator height(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", value));

        return this;
    }
    /**
     * Setter for separator height.
     */
    public com.anychart.core.ui.Separator height(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the margin of the separator.
     */
    public com.anychart.core.utils.Margin margin() {
        return new com.anychart.core.utils.Margin(jsBase + ".margin()");
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, wrapQuotes(rightOrRightAndLeft), bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, wrapQuotes(rightOrRightAndLeft), bottom, left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom, left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(Number[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the margin of the separator.
     */
    public com.anychart.core.ui.Separator margin(String[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, left));

        return this;
    }
    /**
     * Getter fo the orientation of the separator.
     */
    public void orientation() {
        APIlib.getInstance().addJSLine(jsBase + ".orientation();");
    }
    /**
     * Getter fo the orientation of the separator.
     */
    public com.anychart.core.ui.Separator orientation(com.anychart.enums.Orientation value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".orientation(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter fo the orientation of the separator.
     */
    public com.anychart.core.ui.Separator orientation(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".orientation(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Prints all elements on related stage.
     */
    public void print(com.anychart.graphics.vector.PaperSize paperSizeOrOptions, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", (paperSizeOrOptions != null) ? paperSizeOrOptions.getJsBase() : null, landscape));
    }
    /**
     * Prints all elements on related stage.
     */
    public void print(String paperSizeOrOptions, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", wrapQuotes(paperSizeOrOptions), landscape));
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Separator stroke.
     */
    public com.anychart.core.ui.Separator stroke(com.anychart.graphics.vector.Stroke strokeOrFill, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Separator stroke.
     */
    public com.anychart.core.ui.Separator stroke(com.anychart.graphics.vector.Stroke strokeOrFill, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Separator stroke.
     */
    public com.anychart.core.ui.Separator stroke(com.anychart.graphics.vector.Stroke strokeOrFill, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Separator stroke.
     */
    public com.anychart.core.ui.Separator stroke(com.anychart.graphics.vector.Stroke strokeOrFill, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Separator stroke.
     */
    public com.anychart.core.ui.Separator stroke(com.anychart.graphics.vector.ColoredFill strokeOrFill, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Separator stroke.
     */
    public com.anychart.core.ui.Separator stroke(com.anychart.graphics.vector.ColoredFill strokeOrFill, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Separator stroke.
     */
    public com.anychart.core.ui.Separator stroke(com.anychart.graphics.vector.ColoredFill strokeOrFill, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Separator stroke.
     */
    public com.anychart.core.ui.Separator stroke(com.anychart.graphics.vector.ColoredFill strokeOrFill, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Separator stroke.
     */
    public com.anychart.core.ui.Separator stroke(String strokeOrFill, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(strokeOrFill), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Separator stroke.
     */
    public com.anychart.core.ui.Separator stroke(String strokeOrFill, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(strokeOrFill), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Separator stroke.
     */
    public com.anychart.core.ui.Separator stroke(String strokeOrFill, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(strokeOrFill), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Separator stroke.
     */
    public com.anychart.core.ui.Separator stroke(String strokeOrFill, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(strokeOrFill), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

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
    /**
     * Getter for separator width.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for separator width.
     */
    public com.anychart.core.ui.Separator width(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", value));

        return this;
    }
    /**
     * Setter for separator width.
     */
    public com.anychart.core.ui.Separator width(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the Z-index of the element.
     */
    public void zIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".zIndex();");
    }
    /**
     * Setter for the Z-index of the element.
     */
    public com.anychart.core.ui.Separator zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Separator stroke(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", wrapQuotes(value)));

        return this;
    }

}