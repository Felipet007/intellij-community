// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.ide.util.treeView;

public class BgLoadingSyncUpdate extends TreeUiTestCase {
  public BgLoadingSyncUpdate() {
    super(false, true);
  }

  @Override
  protected int getChildrenLoadingDelay() {
    return 50;
  }

  @Override
  protected int getNodeDescriptorUpdateDelay() {
    return 50;
  }

  @Override
  public void testNoInfiniteSmartExpand() {
    //todo
  }

  @Override
  public void testBigTreeUpdate() {
    //to slow, tested the same in VeryQuickBgLoadingTest
  }
}
