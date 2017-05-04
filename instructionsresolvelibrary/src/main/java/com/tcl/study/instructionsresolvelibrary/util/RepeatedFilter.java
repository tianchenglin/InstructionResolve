/*
 * Copyright (c) Created by T C L on 2017.5.3.
 */

package com.tcl.study.instructionsresolvelibrary.util;

import com.tcl.study.instructionsresolvelibrary.model.NewsListData;
import com.tcl.study.instructionsresolvelibrary.model.NewsItemData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tcl on 2017.04.20
 * 过滤重复数据
 */
public class RepeatedFilter {

  public static NewsListData filter(NewsListData newsListData) {
    NewsListData items = new NewsListData();
    List<NewsListData.NewsItemData> newsItemDatas = newsListData.getResult();

    for (int i = 0; i < newsItemDatas.size(); i++) {
      boolean isExist = false;
      for (int j = 0; j < (items.getResult() == null ? 0 : items.getResult().size()); j++) {
        if (items.getResult().get(j).getIndex().equals(newsItemDatas.get(i).getIndex())) {
          isExist = true;
          break;
        }
      }
      if (!isExist) {
        items.getResult().add(newsItemDatas.get(i));
      }
    }
    return items;
  }
}
