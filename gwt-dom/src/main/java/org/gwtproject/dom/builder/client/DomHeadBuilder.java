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

import org.gwtproject.dom.builder.shared.HeadBuilder;
import org.gwtproject.dom.client.HeadElement;
import org.gwtproject.safehtml.shared.SafeHtml;

/** DOM-based implementation of {@link HeadBuilder}. */
public class DomHeadBuilder extends DomElementBuilderBase<HeadBuilder, HeadElement>
    implements HeadBuilder {

  DomHeadBuilder(DomBuilderImpl delegate) {
    super(delegate, false);
  }

  @Override
  public HeadBuilder html(SafeHtml html) {
    throw new UnsupportedOperationException();
  }

  @Override
  public HeadBuilder text(String text) {
    throw new UnsupportedOperationException();
  }
}
