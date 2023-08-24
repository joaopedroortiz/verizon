/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.verizon.custom_components.contact;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class contact__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<div class=\"contact\">\n    <div class=\"contact-internal-box\">\n        <p class=\"form-title\">");
{
    String var_0 = (("\n      " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text"))) + "\n        ");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</p>\n        <p class=\"form-topic\">");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "subtitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n        <div class=\"flex-box\">\n            <div");
{
    Object var_attrvalue2 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "telemovel");
    {
        Object var_attrcontent3 = renderContext.call("xss", var_attrvalue2, "attribute");
        {
            boolean var_shoulddisplayattr5 = (((null != var_attrcontent3) && (!"".equals(var_attrcontent3))) && ((!"".equals(var_attrvalue2)) && (!((Object)false).equals(var_attrvalue2))));
            if (var_shoulddisplayattr5) {
                out.write(" class");
                {
                    boolean var_istrueattr4 = (var_attrvalue2.equals(true));
                    if (!var_istrueattr4) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent3));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">\n                <p class=\"form-label-description\">Telem\u00F3vel:</p>\n                <input class=\"input\" type=\"text\" placeholder=\"Ex: 1234567\"/>\n            </div>\n            <div");
{
    Object var_attrvalue6 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "telefone");
    {
        Object var_attrcontent7 = renderContext.call("xss", var_attrvalue6, "attribute");
        {
            boolean var_shoulddisplayattr9 = (((null != var_attrcontent7) && (!"".equals(var_attrcontent7))) && ((!"".equals(var_attrvalue6)) && (!((Object)false).equals(var_attrvalue6))));
            if (var_shoulddisplayattr9) {
                out.write(" class");
                {
                    boolean var_istrueattr8 = (var_attrvalue6.equals(true));
                    if (!var_istrueattr8) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent7));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">\n                <p class=\"form-label-description\">Telefone:</p>\n                <input class=\"input\" type=\"text\" placeholder=\"Ex: 1234567\"/>\n            </div>\n            <div");
{
    Object var_attrvalue10 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "email");
    {
        Object var_attrcontent11 = renderContext.call("xss", var_attrvalue10, "attribute");
        {
            boolean var_shoulddisplayattr13 = (((null != var_attrcontent11) && (!"".equals(var_attrcontent11))) && ((!"".equals(var_attrvalue10)) && (!((Object)false).equals(var_attrvalue10))));
            if (var_shoulddisplayattr13) {
                out.write(" class");
                {
                    boolean var_istrueattr12 = (var_attrvalue10.equals(true));
                    if (!var_istrueattr12) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">\n                <p class=\"form-label-description\">E-mail:</p>\n                <input class=\"input\" type=\"text\" placeholder=\"Ex: 1234567\"/>\n            </div>\n        </div>\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

