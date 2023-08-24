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
out.write("<div class=\"main\">\n     <div class=\"header-internal-box\">\n\n          <div>\n               <img");
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
out.write(" alt=\"Verizon Logo\" class=\"logo\"/>\n          </div>\n          <div class=\"links\">\n               <a class=\"title-link\"");
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
out.write("</a>\n               <a class=\"title-link\"");
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
out.write("</a>\n               <a class=\"title-link\"");
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
out.write("</a>\n               <a class=\"title-link\"");
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
out.write(" alt=\"search\" class=\"icon\"/>\n          </div>\n          <div class=\"mobile-menu-button\">\n               <img");
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
out.write(" alt=\"search\" class=\"mobile-menu-icon\"/>\n               <img onclick=\"menuShow()\"");
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
out.write(" alt=\"hamburger\" class=\"mobile-menu-icon\"/>\n          </div>\n     </div>\n\n     <div class=\"mobile-menu\">\n\n          <div class=\"mobile-link-box\">\n               <a class=\"mobile-link\"");
{
    Object var_attrvalue44 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "aboutuspath");
    {
        Object var_attrcontent45 = renderContext.call("xss", var_attrvalue44, "uri");
        {
            boolean var_shoulddisplayattr47 = (((null != var_attrcontent45) && (!"".equals(var_attrcontent45))) && ((!"".equals(var_attrvalue44)) && (!((Object)false).equals(var_attrvalue44))));
            if (var_shoulddisplayattr47) {
                out.write(" href");
                {
                    boolean var_istrueattr46 = (var_attrvalue44.equals(true));
                    if (!var_istrueattr46) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent45));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">");
{
    Object var_48 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "aboutus"), "html");
    out.write(renderContext.getObjectModel().toString(var_48));
}
out.write("</a>\n               <img");
{
    Object var_attrvalue49 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "arrow");
    {
        Object var_attrcontent50 = renderContext.call("xss", var_attrvalue49, "uri");
        {
            boolean var_shoulddisplayattr52 = (((null != var_attrcontent50) && (!"".equals(var_attrcontent50))) && ((!"".equals(var_attrvalue49)) && (!((Object)false).equals(var_attrvalue49))));
            if (var_shoulddisplayattr52) {
                out.write(" src");
                {
                    boolean var_istrueattr51 = (var_attrvalue49.equals(true));
                    if (!var_istrueattr51) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent50));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" class=\"arrow\" alt=\"\"/>\n          </div>\n\n          <div class=\"mobile-link-box\">\n               <a class=\"mobile-link\"");
{
    Object var_attrvalue53 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "productspath");
    {
        Object var_attrcontent54 = renderContext.call("xss", var_attrvalue53, "uri");
        {
            boolean var_shoulddisplayattr56 = (((null != var_attrcontent54) && (!"".equals(var_attrcontent54))) && ((!"".equals(var_attrvalue53)) && (!((Object)false).equals(var_attrvalue53))));
            if (var_shoulddisplayattr56) {
                out.write(" href");
                {
                    boolean var_istrueattr55 = (var_attrvalue53.equals(true));
                    if (!var_istrueattr55) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent54));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">");
{
    Object var_57 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "products"), "html");
    out.write(renderContext.getObjectModel().toString(var_57));
}
out.write("</a>\n               <img");
{
    Object var_attrvalue58 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "arrow");
    {
        Object var_attrcontent59 = renderContext.call("xss", var_attrvalue58, "uri");
        {
            boolean var_shoulddisplayattr61 = (((null != var_attrcontent59) && (!"".equals(var_attrcontent59))) && ((!"".equals(var_attrvalue58)) && (!((Object)false).equals(var_attrvalue58))));
            if (var_shoulddisplayattr61) {
                out.write(" src");
                {
                    boolean var_istrueattr60 = (var_attrvalue58.equals(true));
                    if (!var_istrueattr60) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent59));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" class=\"arrow\" alt=\"\"/>\n          </div>\n\n          <div class=\"mobile-link-box\">\n               <a class=\"mobile-link\"");
{
    Object var_attrvalue62 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "storepath");
    {
        Object var_attrcontent63 = renderContext.call("xss", var_attrvalue62, "uri");
        {
            boolean var_shoulddisplayattr65 = (((null != var_attrcontent63) && (!"".equals(var_attrcontent63))) && ((!"".equals(var_attrvalue62)) && (!((Object)false).equals(var_attrvalue62))));
            if (var_shoulddisplayattr65) {
                out.write(" href");
                {
                    boolean var_istrueattr64 = (var_attrvalue62.equals(true));
                    if (!var_istrueattr64) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent63));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">");
{
    Object var_66 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "store"), "html");
    out.write(renderContext.getObjectModel().toString(var_66));
}
out.write("</a>\n               <img");
{
    Object var_attrvalue67 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "arrow");
    {
        Object var_attrcontent68 = renderContext.call("xss", var_attrvalue67, "uri");
        {
            boolean var_shoulddisplayattr70 = (((null != var_attrcontent68) && (!"".equals(var_attrcontent68))) && ((!"".equals(var_attrvalue67)) && (!((Object)false).equals(var_attrvalue67))));
            if (var_shoulddisplayattr70) {
                out.write(" src");
                {
                    boolean var_istrueattr69 = (var_attrvalue67.equals(true));
                    if (!var_istrueattr69) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent68));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" class=\"arrow\" alt=\"\"/>\n          </div>\n\n          <div class=\"mobile-link-box\">\n               <a class=\"mobile-link\"");
{
    Object var_attrvalue71 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "helppath");
    {
        Object var_attrcontent72 = renderContext.call("xss", var_attrvalue71, "uri");
        {
            boolean var_shoulddisplayattr74 = (((null != var_attrcontent72) && (!"".equals(var_attrcontent72))) && ((!"".equals(var_attrvalue71)) && (!((Object)false).equals(var_attrvalue71))));
            if (var_shoulddisplayattr74) {
                out.write(" href");
                {
                    boolean var_istrueattr73 = (var_attrvalue71.equals(true));
                    if (!var_istrueattr73) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent72));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">");
{
    Object var_75 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "help"), "html");
    out.write(renderContext.getObjectModel().toString(var_75));
}
out.write("</a>\n               <img");
{
    Object var_attrvalue76 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "arrow");
    {
        Object var_attrcontent77 = renderContext.call("xss", var_attrvalue76, "uri");
        {
            boolean var_shoulddisplayattr79 = (((null != var_attrcontent77) && (!"".equals(var_attrcontent77))) && ((!"".equals(var_attrvalue76)) && (!((Object)false).equals(var_attrvalue76))));
            if (var_shoulddisplayattr79) {
                out.write(" src");
                {
                    boolean var_istrueattr78 = (var_attrvalue76.equals(true));
                    if (!var_istrueattr78) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent77));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" class=\"arrow\" alt=\"\"/>\n          </div>\n\n          <div class=\"mobile-link-box\">\n               <a class=\"mobile-link\"");
{
    Object var_attrvalue80 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "cartpath");
    {
        Object var_attrcontent81 = renderContext.call("xss", var_attrvalue80, "uri");
        {
            boolean var_shoulddisplayattr83 = (((null != var_attrcontent81) && (!"".equals(var_attrcontent81))) && ((!"".equals(var_attrvalue80)) && (!((Object)false).equals(var_attrvalue80))));
            if (var_shoulddisplayattr83) {
                out.write(" href");
                {
                    boolean var_istrueattr82 = (var_attrvalue80.equals(true));
                    if (!var_istrueattr82) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent81));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">\n                    <img");
{
    Object var_attrvalue84 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "cart"), "uri");
    {
        boolean var_shoulddisplayattr87 = ((!"".equals(var_attrvalue84)) && (!((Object)false).equals(var_attrvalue84)));
        if (var_shoulddisplayattr87) {
            out.write(" src");
            {
                boolean var_istrueattr86 = (var_attrvalue84.equals(true));
                if (!var_istrueattr86) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue84));
                    out.write("\"");
                }
            }
        }
    }
}
out.write(" alt=\"cart\" class=\"icon\"/>\n               </a>\n               <img");
{
    Object var_attrvalue88 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "arrow");
    {
        Object var_attrcontent89 = renderContext.call("xss", var_attrvalue88, "uri");
        {
            boolean var_shoulddisplayattr91 = (((null != var_attrcontent89) && (!"".equals(var_attrcontent89))) && ((!"".equals(var_attrvalue88)) && (!((Object)false).equals(var_attrvalue88))));
            if (var_shoulddisplayattr91) {
                out.write(" src");
                {
                    boolean var_istrueattr90 = (var_attrvalue88.equals(true));
                    if (!var_istrueattr90) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent89));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" class=\"arrow\" alt=\"\"/>\n          </div>\n     </div>\n</div>\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

