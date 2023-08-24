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

Object _dynamic_resource = bindings.get("resource");
Collection var_collectionvar0_list_coerced$ = null;
Collection var_collectionvar11_list_coerced$ = null;
Collection var_collectionvar22_list_coerced$ = null;
Collection var_collectionvar32_list_coerced$ = null;
Object _dynamic_properties = bindings.get("properties");
out.write("<h2><strong id='file1_css'>Using pure HTL</strong></h2>\n<h2><strong id='file2_css'>Using pure HTL</strong></h2>\n<h2><strong id='file3_css'>Using pure HTL</strong></h2>\n\n\n");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_dynamic_resource, "getChildren");
    {
        long var_size1 = ((var_collectionvar0_list_coerced$ == null ? (var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0)) : var_collectionvar0_list_coerced$).size());
        {
            boolean var_notempty2 = (var_size1 > 0);
            if (var_notempty2) {
                {
                    long var_end5 = var_size1;
                    {
                        boolean var_validstartstepend6 = (((0 < var_size1) && true) && (var_end5 > 0));
                        if (var_validstartstepend6) {
                            out.write("<div>");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object continentmultifield : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\n\n    ");
                                        {
                                            boolean var_testvariable10 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(continentmultifield, "name"), "continents"));
                                            if (var_testvariable10) {
                                                out.write("<div>\n        <p>Continents</p>\n\n        ");
                                                {
                                                    Object var_collectionvar11 = renderContext.getObjectModel().resolveProperty(continentmultifield, "getChildren");
                                                    {
                                                        long var_size12 = ((var_collectionvar11_list_coerced$ == null ? (var_collectionvar11_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar11)) : var_collectionvar11_list_coerced$).size());
                                                        {
                                                            boolean var_notempty13 = (var_size12 > 0);
                                                            if (var_notempty13) {
                                                                {
                                                                    long var_end16 = var_size12;
                                                                    {
                                                                        boolean var_validstartstepend17 = (((0 < var_size12) && true) && (var_end16 > 0));
                                                                        if (var_validstartstepend17) {
                                                                            out.write("<ul>");
                                                                            if (var_collectionvar11_list_coerced$ == null) {
                                                                                var_collectionvar11_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar11);
                                                                            }
                                                                            long var_index18 = 0;
                                                                            for (Object continent : var_collectionvar11_list_coerced$) {
                                                                                {
                                                                                    boolean var_traversal20 = (((var_index18 >= 0) && (var_index18 <= var_end16)) && true);
                                                                                    if (var_traversal20) {
                                                                                        out.write("\n            <li>");
                                                                                        {
                                                                                            String var_21 = ("Name: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(continent, "continentName"), "text")));
                                                                                            out.write(renderContext.getObjectModel().toString(var_21));
                                                                                        }
                                                                                        out.write("</li>\n            <li>Countries:\n\n                \n                ");
                                                                                        {
                                                                                            Object var_collectionvar22 = renderContext.getObjectModel().resolveProperty(continent, "getChildren");
                                                                                            {
                                                                                                long var_size23 = ((var_collectionvar22_list_coerced$ == null ? (var_collectionvar22_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar22)) : var_collectionvar22_list_coerced$).size());
                                                                                                {
                                                                                                    boolean var_notempty24 = (var_size23 > 0);
                                                                                                    if (var_notempty24) {
                                                                                                        {
                                                                                                            long var_end27 = var_size23;
                                                                                                            {
                                                                                                                boolean var_validstartstepend28 = (((0 < var_size23) && true) && (var_end27 > 0));
                                                                                                                if (var_validstartstepend28) {
                                                                                                                    out.write("<div>");
                                                                                                                    if (var_collectionvar22_list_coerced$ == null) {
                                                                                                                        var_collectionvar22_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar22);
                                                                                                                    }
                                                                                                                    long var_index29 = 0;
                                                                                                                    for (Object countrymultifield : var_collectionvar22_list_coerced$) {
                                                                                                                        {
                                                                                                                            boolean var_traversal31 = (((var_index29 >= 0) && (var_index29 <= var_end27)) && true);
                                                                                                                            if (var_traversal31) {
                                                                                                                                out.write("\n\n                    \n                    ");
                                                                                                                                {
                                                                                                                                    boolean var_testvariable39 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(countrymultifield, "name"), "countries"));
                                                                                                                                    if (var_testvariable39) {
                                                                                                                                        {
                                                                                                                                            Object var_collectionvar32 = renderContext.getObjectModel().resolveProperty(countrymultifield, "getChildren");
                                                                                                                                            {
                                                                                                                                                long var_size33 = ((var_collectionvar32_list_coerced$ == null ? (var_collectionvar32_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar32)) : var_collectionvar32_list_coerced$).size());
                                                                                                                                                {
                                                                                                                                                    boolean var_notempty34 = (var_size33 > 0);
                                                                                                                                                    if (var_notempty34) {
                                                                                                                                                        {
                                                                                                                                                            long var_end37 = var_size33;
                                                                                                                                                            {
                                                                                                                                                                boolean var_validstartstepend38 = (((0 < var_size33) && true) && (var_end37 > 0));
                                                                                                                                                                if (var_validstartstepend38) {
                                                                                                                                                                    out.write("<ul>");
                                                                                                                                                                    if (var_collectionvar32_list_coerced$ == null) {
                                                                                                                                                                        var_collectionvar32_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar32);
                                                                                                                                                                    }
                                                                                                                                                                    long var_index40 = 0;
                                                                                                                                                                    for (Object country : var_collectionvar32_list_coerced$) {
                                                                                                                                                                        {
                                                                                                                                                                            boolean var_traversal42 = (((var_index40 >= 0) && (var_index40 <= var_end37)) && true);
                                                                                                                                                                            if (var_traversal42) {
                                                                                                                                                                                out.write("\n\n                        <li>");
                                                                                                                                                                                {
                                                                                                                                                                                    String var_43 = ("Name: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(country, "countryName"), "text")));
                                                                                                                                                                                    out.write(renderContext.getObjectModel().toString(var_43));
                                                                                                                                                                                }
                                                                                                                                                                                out.write("</li>\n                        <li>");
                                                                                                                                                                                {
                                                                                                                                                                                    String var_44 = ("Code: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(country, "code"), "text")));
                                                                                                                                                                                    out.write(renderContext.getObjectModel().toString(var_44));
                                                                                                                                                                                }
                                                                                                                                                                                out.write("</li>\n                    ");
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        var_index40++;
                                                                                                                                                                    }
                                                                                                                                                                    out.write("</ul>");
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var_collectionvar32_list_coerced$ = null;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                out.write("\n                ");
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var_index29++;
                                                                                                                    }
                                                                                                                    out.write("</div>");
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            var_collectionvar22_list_coerced$ = null;
                                                                                        }
                                                                                        out.write("\n            </li>\n        ");
                                                                                    }
                                                                                }
                                                                                var_index18++;
                                                                            }
                                                                            out.write("</ul>");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    var_collectionvar11_list_coerced$ = null;
                                                }
                                                out.write("\n    </div>");
                                            }
                                        }
                                        out.write("\n");
                                    }
                                }
                                var_index7++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\n\n<p>");
{
    Object var_45 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "exemploName"), "text");
    out.write(renderContext.getObjectModel().toString(var_45));
}
out.write("</p>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

