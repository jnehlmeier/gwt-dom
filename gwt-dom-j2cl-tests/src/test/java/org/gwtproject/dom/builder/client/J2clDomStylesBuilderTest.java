/*
 * Copyright © 2019 The GWT Project Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gwtproject.dom.builder.client;

import static junit.framework.TestCase.assertEquals;

import org.gwtproject.dom.builder.shared.J2clStylesBuilderTestBase;

/** Gwt tests for {@link DomStylesBuilder}. */
public class J2clDomStylesBuilderTest extends J2clStylesBuilderTestBase {

  public void testToCamelCaseForm() {
    assertEquals("simple", DomStylesBuilder.toCamelCaseForm("simple"));
    assertEquals("alreadycamelCase", DomStylesBuilder.toCamelCaseForm("alreadycamelCase"));
    assertEquals(
        "alreadyCamelCaseMultipleHumps",
        DomStylesBuilder.toCamelCaseForm("alreadyCamelCaseMultipleHumps"));
    assertEquals("wasHyphenated", DomStylesBuilder.toCamelCaseForm("was-hyphenated"));
    assertEquals("wasHyphenatedTwice", DomStylesBuilder.toCamelCaseForm("was-hyphenated-twice"));
    assertEquals("startsWithHyphen", DomStylesBuilder.toCamelCaseForm("-starts-with-hyphen"));
  }

  @Override
  protected DomBuilderFactory getElementBuilderFactory() {
    return DomBuilderFactory.get();
  }
}
