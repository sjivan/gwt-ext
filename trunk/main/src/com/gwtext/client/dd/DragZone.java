/*
 * GWT-Ext Widget Library
 * Copyright(c) 2007-2008, GWT-Ext.
 * licensing@gwt-ext.com
 * 
 * http://www.gwt-ext.com/license
 */

package com.gwtext.client.dd;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.gwtext.client.widgets.Component;

public class DragZone extends DragSource {

    public DragZone(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public DragZone(String id, DragSourceConfig config) {
        super(id, config);
    }

    public DragZone(Component component, DragSourceConfig config) {
        super(component, config);
    }

    protected native JavaScriptObject create(String id, String sGroup, JavaScriptObject config)/*-{
        return new $wnd.Ext.dd.DragZone(id, config);
    }-*/;

    protected native JavaScriptObject create(Element element, String sGroup, JavaScriptObject config)/*-{
        return new $wnd.Ext.dd.DragZone(element, config);
    }-*/;
}
