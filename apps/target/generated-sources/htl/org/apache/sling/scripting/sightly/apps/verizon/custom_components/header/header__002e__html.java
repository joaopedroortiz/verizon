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
package org.apache.sling.scripting.sightly.apps.verizon.custom_components.header;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class header__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<div class=\"main\">\n     <div class=\"internal-box\">\n\n          <div>\n               <img");
{
    Object var_attrvalue0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "logo"), "uri");
    {
        boolean var_shoulddisplayattr3 = ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0)));
        if (var_shoulddisplayattr3) {
            out.write(" src");
            {
                boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                if (!var_istrueattr2) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue0));
                    out.write("\"");
                }
            }
        }
    }
}
out.write(" alt=\"Verizon Logo\" class=\"logo\"/>\n          </div>\n          <div class=\"links\">\n               <a class=\"title\"");
{
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "aboutuspath");
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
    Object var_8 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "aboutus"), "html");
    out.write(renderContext.getObjectModel().toString(var_8));
}
out.write("</a>\n               <a class=\"title\"");
{
    Object var_attrvalue9 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "productspath");
    {
        Object var_attrcontent10 = renderContext.call("xss", var_attrvalue9, "uri");
        {
            boolean var_shoulddisplayattr12 = (((null != var_attrcontent10) && (!"".equals(var_attrcontent10))) && ((!"".equals(var_attrvalue9)) && (!((Object)false).equals(var_attrvalue9))));
            if (var_shoulddisplayattr12) {
                out.write(" href");
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
out.write(">");
{
    Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "products"), "html");
    out.write(renderContext.getObjectModel().toString(var_13));
}
out.write("</a>\n               <a class=\"title\"");
{
    Object var_attrvalue14 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "storepath");
    {
        Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "uri");
        {
            boolean var_shoulddisplayattr17 = (((null != var_attrcontent15) && (!"".equals(var_attrcontent15))) && ((!"".equals(var_attrvalue14)) && (!((Object)false).equals(var_attrvalue14))));
            if (var_shoulddisplayattr17) {
                out.write(" href");
                {
                    boolean var_istrueattr16 = (var_attrvalue14.equals(true));
                    if (!var_istrueattr16) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent15));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">");
{
    Object var_18 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "store"), "html");
    out.write(renderContext.getObjectModel().toString(var_18));
}
out.write("</a>\n               <a class=\"title\"");
{
    Object var_attrvalue19 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "helppath");
    {
        Object var_attrcontent20 = renderContext.call("xss", var_attrvalue19, "uri");
        {
            boolean var_shoulddisplayattr22 = (((null != var_attrcontent20) && (!"".equals(var_attrcontent20))) && ((!"".equals(var_attrvalue19)) && (!((Object)false).equals(var_attrvalue19))));
            if (var_shoulddisplayattr22) {
                out.write(" href");
                {
                    boolean var_istrueattr21 = (var_attrvalue19.equals(true));
                    if (!var_istrueattr21) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent20));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">");
{
    Object var_23 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "help"), "html");
    out.write(renderContext.getObjectModel().toString(var_23));
}
out.write("</a>\n               <a");
{
    Object var_attrvalue24 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "cartpath");
    {
        Object var_attrcontent25 = renderContext.call("xss", var_attrvalue24, "uri");
        {
            boolean var_shoulddisplayattr27 = (((null != var_attrcontent25) && (!"".equals(var_attrcontent25))) && ((!"".equals(var_attrvalue24)) && (!((Object)false).equals(var_attrvalue24))));
            if (var_shoulddisplayattr27) {
                out.write(" href");
                {
                    boolean var_istrueattr26 = (var_attrvalue24.equals(true));
                    if (!var_istrueattr26) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent25));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">\n                    <img");
{
    Object var_attrvalue28 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "cart"), "uri");
    {
        boolean var_shoulddisplayattr31 = ((!"".equals(var_attrvalue28)) && (!((Object)false).equals(var_attrvalue28)));
        if (var_shoulddisplayattr31) {
            out.write(" src");
            {
                boolean var_istrueattr30 = (var_attrvalue28.equals(true));
                if (!var_istrueattr30) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue28));
                    out.write("\"");
                }
            }
        }
    }
}
out.write(" alt=\"cart\" class=\"icon\"/>\n               </a>\n               <img");
{
    Object var_attrvalue32 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "search"), "uri");
    {
        boolean var_shoulddisplayattr35 = ((!"".equals(var_attrvalue32)) && (!((Object)false).equals(var_attrvalue32)));
        if (var_shoulddisplayattr35) {
            out.write(" src");
            {
                boolean var_istrueattr34 = (var_attrvalue32.equals(true));
                if (!var_istrueattr34) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue32));
                    out.write("\"");
                }
            }
        }
    }
}
out.write(" alt=\"search\" class=\"icon\"/>\n          </div>\n          <div class=\"mobilelinks\">\n               <img");
{
    Object var_attrvalue36 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "search"), "uri");
    {
        boolean var_shoulddisplayattr39 = ((!"".equals(var_attrvalue36)) && (!((Object)false).equals(var_attrvalue36)));
        if (var_shoulddisplayattr39) {
            out.write(" src");
            {
                boolean var_istrueattr38 = (var_attrvalue36.equals(true));
                if (!var_istrueattr38) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue36));
                    out.write("\"");
                }
            }
        }
    }
}
out.write(" alt=\"search\" class=\"icon\"/>\n               <img");
{
    Object var_attrvalue40 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "hamburger"), "uri");
    {
        boolean var_shoulddisplayattr43 = ((!"".equals(var_attrvalue40)) && (!((Object)false).equals(var_attrvalue40)));
        if (var_shoulddisplayattr43) {
            out.write(" src");
            {
                boolean var_istrueattr42 = (var_attrvalue40.equals(true));
                if (!var_istrueattr42) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue40));
                    out.write("\"");
                }
            }
        }
    }
}
out.write(" alt=\"hamburger\" class=\"icon\"/>\n          </div>\n     </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

