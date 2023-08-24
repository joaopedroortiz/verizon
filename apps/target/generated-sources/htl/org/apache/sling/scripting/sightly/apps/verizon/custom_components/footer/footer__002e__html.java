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
package org.apache.sling.scripting.sightly.apps.verizon.custom_components.footer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class footer__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("\n<footer class=\"footer\">\n    <div class=\"footer-internal-box\">\n        \n        <button");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "firstType");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" class");
                {
                    boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                    if (!var_istrueattr2) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" type=\"button\" form=\"form\">\n            <a class=\"text\"");
{
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "firstButtonPath");
    {
        Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "uri");
        {
            boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
            if (var_shoulddisplayattr7) {
                out.write(" href");
                {
                    boolean var_istrueattr6 = (var_attrvalue4.equals(true));
                    if (!var_istrueattr6) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent5));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">");
{
    String var_8 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "footerFirstButton"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_8));
}
out.write("</a>\n        </button>\n\n        <button");
{
    Object var_attrvalue9 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "secondType");
    {
        Object var_attrcontent10 = renderContext.call("xss", var_attrvalue9, "attribute");
        {
            boolean var_shoulddisplayattr12 = (((null != var_attrcontent10) && (!"".equals(var_attrcontent10))) && ((!"".equals(var_attrvalue9)) && (!((Object)false).equals(var_attrvalue9))));
            if (var_shoulddisplayattr12) {
                out.write(" class");
                {
                    boolean var_istrueattr11 = (var_attrvalue9.equals(true));
                    if (!var_istrueattr11) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent10));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" type=\"submit\" form=\"form\" onblur=\"(validation())\">\n            <a class=\"text\"");
{
    Object var_attrvalue13 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "secondButtonPath");
    {
        Object var_attrcontent14 = renderContext.call("xss", var_attrvalue13, "uri");
        {
            boolean var_shoulddisplayattr16 = (((null != var_attrcontent14) && (!"".equals(var_attrcontent14))) && ((!"".equals(var_attrvalue13)) && (!((Object)false).equals(var_attrvalue13))));
            if (var_shoulddisplayattr16) {
                out.write(" href");
                {
                    boolean var_istrueattr15 = (var_attrvalue13.equals(true));
                    if (!var_istrueattr15) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent14));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">");
{
    String var_17 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "footerSecondButton"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_17));
}
out.write("</a>\n        </button>\n        \n    </div>\n</footer>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

