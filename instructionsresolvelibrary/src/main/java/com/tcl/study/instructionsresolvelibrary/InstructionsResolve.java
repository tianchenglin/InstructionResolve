/*
 * Copyright (c) Created by T C L on 2017.5.3.
 */

package com.tcl.study.instructionsresolvelibrary;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.tcl.study.instructionsresolvelibrary.model.NewsListData;
import com.tcl.study.instructionsresolvelibrary.model.NewsListData.NewsItemData;
import com.tcl.study.instructionsresolvelibrary.util.RepeatedFilter;
import com.tcl.study.instructionsresolvelibrary.util.SortUtil;

public class InstructionsResolve {

  private static InstructionsResolve instructionsResolve;

  private InstructionsResolve() {

  }

  public static InstructionsResolve getInstance() {
    if (instructionsResolve == null) {
      instructionsResolve = new InstructionsResolve();
    }
    return instructionsResolve;
  }

  /**
   * 解析存储，多条数据
   *
   * @param result 请求的json数据
   * reverse 是否逆序 default = FALSE(正序);
   */
  public NewsListData parsesAndSave(String result) {
    NewsListData newsListData = null;
    if (!TextUtils.isEmpty(result)) {
      //数据解析
      newsListData = new Gson().fromJson(result, NewsListData.class);
      //数据去重
      newsListData = RepeatedFilter.filter(newsListData);
      //数据排序--按照index
      newsListData = SortUtil.sort(newsListData, false);//默认排序方式
    }
    return newsListData;
  }

  /**
   * 解析存储 一条数据
   */
  public NewsItemData parseAndSave(String result) {
    NewsItemData newsItemData = new NewsItemData();
    if (!TextUtils.isEmpty(result)) {
      //数据解析
      newsItemData = new Gson().fromJson(result, NewsItemData.class);
    }
    return newsItemData;
  }

}
