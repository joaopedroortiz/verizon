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
package org.apache.sling.scripting.sightly.apps.verizon.custom_components.form;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class form__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<div class=\"form\">\n    <div class=\"form-internal-box\">\n       <div class=\"reduced-box\">\n        <p class=\"form-title\">");
{
    String var_0 = (("\n      " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text"))) + "\n        ");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</p>\n        <p class=\"form-topic\">");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "subtitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n        <p class=\"form-topic\">\n            Nome\n        </p>\n\n        <div class=\"input-box\">\n            <p class=\"form-label-description\">Preencha o seu nome completo</p>\n            <input class=\"input\" type=\"text\" placeholder=\"Ex: Jos\u00E9 Pinheiro\"/>\n        </div>\n\n        <p class=\"form-topic\">\n            Documento de identifica\u00E7\u00E3o\n        </p>\n\n        <div class=\"flex-box\">\n            <div class=\"input-container\">\n                <p class=\"form-label-description\">Escolha o seu documento de identifica\u00E7\u00E3o</p>\n                <select id=\"id\" name=\"identification\" class=\"input\">\n                    <option value=\"volvo\">Cart\u00E3o de Cidad\u00E3o</option>\n                    <option value=\"saab\">Bilhete de Identidade</option>\n                    <option value=\"fiat\">Passaporte</option>\n                  </select>\n            </div>\n            <div class=\"input-container\">\n                <p class=\"form-label-description\">Introduza o seu n\u00FAmero de identifica\u00E7\u00E3o</p>\n                <input class=\"input\" type=\"number\" placeholder=\"Ex: 1234567\"/>\n            </div>\n        </div>\n\n        <div class=\"flex-box\">\n            <div class=\"input-container\">\n                <p class=\"form-label-description\">Introduza o seu NIF:</p>\n                <input onblur=\"validate()\" id=\"nif\" class=\"input\" type=\"number\" placeholder=\"Ex: 1234567\"/>\n                <p class=\"error-none\">NIF inv\u00E1lido. Por favor introduza um NIF v\u00E1lido com 9 d\u00EDgitos.</p>\n            </div>\n            <div class=\"input-container\">\n            </div>\n        </div>\n       </div>\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

