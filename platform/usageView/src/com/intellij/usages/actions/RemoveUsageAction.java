/*
 * Copyright 2015 Manuel Stadelmann
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.usages.actions;

import com.intellij.usages.Usage;
import com.intellij.usages.UsageView;

/**
 * @author Manuel Stadelmann
 */
public class RemoveUsageAction extends IncludeExcludeActionBase {
  @Override
  protected void process(Usage[] usages, UsageView usageView) {
    for (Usage usage : usages) {
      usageView.removeUsage(usage);
    }
  }
}
