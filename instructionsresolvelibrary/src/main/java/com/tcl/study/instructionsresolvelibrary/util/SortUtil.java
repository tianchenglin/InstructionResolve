/*
 * Copyright (c) Created by T C L on 2017.5.3.
 */

package com.tcl.study.instructionsresolvelibrary.util;

import com.tcl.study.instructionsresolvelibrary.model.NewsListData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUtil {

  /**
   * 排序
   *
   * @param isReverse 是否是逆序？true 逆序 false 正序
   */
  public static NewsListData sort(NewsListData newsListData, boolean isReverse) {
    if (isReverse) {
      // 按照index降序排列
      Collections.reverse(newsListData.getResult());
    } else {
      // 按照index升序排列
      Collections.sort(newsListData.getResult());
    }
    return newsListData;
  }

  public static List<NewsListData.NewsItemData.Item.Card> queryByDate(
      List<NewsListData.NewsItemData.Item.Card> cards,
      NewsListData.NewsItemData.Item.Day targetTime) {
    String formatTime = targetTime.getFormatTime();
    List<NewsListData.NewsItemData.Item.Card> filteredTimeCards = new ArrayList<>();
    for (int i = 0; i < cards.size(); i++) {
      if (DateTimeUtil.transferLongToDate(cards.get(i).getPubTime() * 1000).equals(formatTime)) {
        if (!filteredTimeCards.contains(cards.get(i))) {
          filteredTimeCards.add(cards.get(i));
        }
      }
    }
    return filteredTimeCards;
  }

  /**
   * 根据会场过滤
   */
  public static List<NewsListData.NewsItemData.Item.Card> queryByLocation(
      List<NewsListData.NewsItemData.Item.Card> cards, String targetLocation) {
    List<NewsListData.NewsItemData.Item.Card> filteredLocationCards = new ArrayList<>();
    for (int i = 0; i < cards.size(); i++) {
      if (cards.get(i).getLocation().equals(targetLocation)) {
        if (!filteredLocationCards.contains(cards.get(i))) {
          filteredLocationCards.add(cards.get(i));
        }
      }
    }
    return filteredLocationCards;
  }

  /**
   * 根据记者过滤
   */
  public static List<NewsListData.NewsItemData.Item.Card> queryByEditor(
      List<NewsListData.NewsItemData.Item.Card> cards, String editor) {

    List<NewsListData.NewsItemData.Item.Card> filteredCards = new ArrayList<>();
    for (int i = 0; i < cards.size(); i++) {
      if (cards.get(i).getEditor().equals(editor)) {
        if (!filteredCards.contains(cards.get(i))) {
          filteredCards.add(cards.get(i));
        }
      }
    }
    return filteredCards;
  }

}

